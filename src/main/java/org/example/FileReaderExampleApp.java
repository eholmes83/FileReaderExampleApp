package org.example;

import org.example.service.FileService;

import java.nio.file.Path;

public class FileReaderExampleApp {
    public static void main(String[] args) {

        FileService fileService = FileService.getInstance();
            fileService.printFileContentsToConsole(Path.of("student-data.txt"));
        }
    }
