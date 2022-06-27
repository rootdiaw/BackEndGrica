package com.grica.grica.controllers;


import com.grica.grica.entities.FileDB;
import com.grica.grica.message.ResponseFile;
import com.grica.grica.message.ResponseMessage;
import com.grica.grica.services.FileStorageService;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/apifig")
public class FileController {

    private FileStorageService storageService;

    public FileController(FileStorageService storageService) {
        this.storageService = storageService;
    }

    @PostMapping("/upload")
    public ResponseEntity<ResponseMessage> uploadFile(@RequestParam("file") MultipartFile file) {
        FileDB fileDB= null;
        String message = "";
        String downloadURL= "";
        try {
            storageService.store(file);
           /* downloadURL= ServletUriComponentsBuilder.fromCurrentContextPath()
                    .path("/files/")
                    .path(fileDB.getId())
                    .toUriString();*/
            message = "Le fichier a été téléchargé avec succès : " + file.getOriginalFilename();
            return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
        } catch (Exception e) {
            message = "Impossible d'importer le fichier : " + file.getOriginalFilename() + "!";
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
        }
    }
   /* @GetMapping("/files")
    public ResponseEntity<List<ResponseFile>> getListFiles() {
        List<ResponseFile> files = storageService.getAllFiles().map(dbFile -> {
            String fileDownloadUri = ServletUriComponentsBuilder
                    .fromCurrentContextPath()
                    .path("/files/")
                    .path(dbFile.getId())
                    .toUriString();
            return new ResponseFile(
                    dbFile.getName(),
                    fileDownloadUri,
                    dbFile.getType(),
                    dbFile.getData().length);
        }).collect(Collectors.toList());
        return ResponseEntity.status(HttpStatus.OK).body(files);
    }
*/
   /* @GetMapping
    public List<String> getFileRepertoire(){
        return  storageService.getFileRepertoire();
    }*/

    @GetMapping
    public List<String> getFileRepertoire(){
        System.out.println(" alpha delta !!! moi==");
        return  storageService.getFileRepertoire();
    }
   /* @GetMapping("/files/{id}")
    public ResponseEntity<byte[]> getFile(@PathVariable String id) {
        FileDB fileDB = storageService.getFile(id);
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + fileDB.getName() + "\"")
                .body(fileDB.getData());
    }*/
    @GetMapping("/url/bynamefile/{name}")
    public String getFilebyName(@PathVariable("name") String name) {
        return  storageService.getUrlByfileName(name);
    }


   /* @GetMapping("/files/byname/{name}")
    public List<FileDB> getFilebyName(@PathVariable String name) {
        List<FileDB> files = storageService.findByName(name);
        return  files;
    }*/
    @DeleteMapping("/deletebyname/{name}")
    public void deleteFileByName(@PathVariable("name") String name) {
        storageService.supprimerfile(name);
    }

    @PutMapping("/update/{name}")
    public ResponseEntity<ResponseMessage> uploadUpdateFile(@RequestParam("file") MultipartFile file, String name) {

      System.out.println(name.toString()+"==afficher=="+file.toString());

        String message = "";
        try {
            storageService.update(file,name);
            message = "Le fichier a été téléchargé avec succès : " + file.getOriginalFilename();
            return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
        } catch (Exception e) {
            message = "Impossible d'importer le fichier : " + file.getOriginalFilename() + "!";
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
        }
    }

    @GetMapping(value = "/test/{fileName}")
    public ResponseEntity<InputStreamResource> getTermsConditions(@PathVariable("fileName") String fileName) throws FileNotFoundException {

        //String filePath = "C:\\Users\\waid\\crises\\files\\";
        String filePath = "/root/grica/files/";
        File file = new File(filePath+fileName);
        HttpHeaders headers = new HttpHeaders();
        headers.add("content-disposition", "inline;filename=" +fileName);
        InputStreamResource resource = new InputStreamResource(new FileInputStream(file));
        System.out.println(file);
        return ResponseEntity.ok()
                .headers(headers)
                .contentLength(file.length())
                .contentType(MediaType.parseMediaType("application/pdf"))
                .body(resource);
    }
}
