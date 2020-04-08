package com.example.codeclan.filesorting.repository;

import com.example.codeclan.filesorting.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
