package com.codeclan.example.folderservice.components;

import com.codeclan.example.folderservice.models.Folder;
import com.codeclan.example.folderservice.models.User;
import com.codeclan.example.folderservice.repository.FolderRepository;
import com.codeclan.example.folderservice.repository.UserRepository;
import javafx.application.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    public DataLoader(){
    }

    public void run(ApplicationArguments args){

        User user1 = new User("Agent Smith");
        userRepository.save(user1);

        Folder folder1 = new Folder("The Matrix", user1);
        folderRepository.save(folder1);
    }
}
