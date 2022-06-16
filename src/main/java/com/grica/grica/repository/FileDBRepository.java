package com.grica.grica.repository;

import com.grica.grica.entities.FileDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface FileDBRepository extends JpaRepository<FileDB, String> {
    List<FileDB> findByNameContains(String name);
    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(value = "DELETE FROM filedb WHERE name=?1", nativeQuery = true)
    void supprimerFileByName(String name);


}
