package com.example.codeclan.filesorting.components;

import com.example.codeclan.filesorting.models.File;
import com.example.codeclan.filesorting.models.Folder;
import com.example.codeclan.filesorting.models.User;
import com.example.codeclan.filesorting.repository.FileRepository;
import com.example.codeclan.filesorting.repository.FolderRepository;
import com.example.codeclan.filesorting.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        User bob = new User("Bob Smith");
        userRepository.save(bob);

        User sally = new User("Sally Brown");
        userRepository.save(sally);

        User tim = new User("Tim McDonald");
        userRepository.save(tim);

        Folder folder1 = new Folder("Folder 1", bob);
        folderRepository.save(folder1);

        Folder folder2 = new Folder("Folder 2", sally);
        folderRepository.save(folder2);

        Folder folder3 = new Folder("Folder 3", tim);
        folderRepository.save(folder3);

        File file1 = new File("File 1", ".txt", 100, folder1);
        fileRepository.save(file1);

        File file2 = new File("File 2", ".txt", 150, folder2);
        fileRepository.save(file2);

        File file3 = new File("File 1", ".txt", 100, folder3);
        fileRepository.save(file3);

        folder1.addfile(file1);
        folderRepository.save(folder1);

        folder2.addfile(file2);
        folderRepository.save(folder2);

        folder3.addfile(file3);
        folderRepository.save(folder3);

        bob.addFolder(folder1);
        userRepository.save(bob);

        sally.addFolder(folder2);
        userRepository.save(sally);

        tim.addFolder(folder3);
        userRepository.save(tim);

    }
}
