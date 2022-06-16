package com.grica.grica.services;


import com.grica.grica.entities.FileDB;
import com.grica.grica.repository.FileDBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

@Service
public class FileStorageService {

    @Autowired
    private FileDBRepository fileDBRepository;

    public void store(MultipartFile file) throws IOException {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        //FileDB FileDB = new FileDB(fileName, file.getContentType(),file.get);
       // FileDB FileDB = new FileDB(fileName, file.getContentType(), file.getBytes());
       // System.out.println(FileDB.getData());
        Files.write(Paths.get(System.getProperty("user.home")+"/crises/files/"+fileName),file.getBytes());
      //  return fileDBRepository.save(FileDB);
    }
    public FileDB getFile(String id) {
        return fileDBRepository.findById(id).get();
    }

    public  String getUrlByfileName(String namefile){
         File name=new File(("user.home")+"/crises/files/"+namefile);
            return  name.getAbsolutePath();
    }
    public List<String> getFileRepertoire(){
        List<String> myfile= new ArrayList<String>();
        File folder = new File("C:\\Users\\waid\\crises\\files\\");
        if(folder.exists()){
            for (File file : folder.listFiles()) {
                myfile.addAll(Collections.singleton(file.getName()));
            }
        }
        return  myfile;
    }
    public List<FileDB> findByName(String name) {
        return fileDBRepository.findByNameContains(name);
    }

    public Stream<FileDB> getAllFiles() {
        return fileDBRepository.findAll().stream();
    }

    public void supprimerfile(String name){
       // fileDBRepository.supprimerFileByName(name);
        Path path = FileSystems.getDefault().getPath(System.getProperty("user.home")+"/crises/files/"+name);
        try {
            Files.deleteIfExists(path);
        } catch (IOException x) {
            System.err.println(x);
        }
    }

    public void update(MultipartFile file,String name) throws IOException{
        Path path = FileSystems.getDefault().getPath(System.getProperty("user.home")+"/crises/files/"+name);
        try {
            Files.deleteIfExists(path);
        } catch (IOException x) {
            System.err.println(x);
        }

        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        Files.write(Paths.get(System.getProperty("user.home")+"/crises/files/"+fileName),file.getBytes());

    }
}
