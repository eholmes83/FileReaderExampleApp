package org.example;

import org.example.service.FileService;

public class FileReaderExampleApp {
    public static void main(String[] args) {
        System.out.println("Starting app...");

        FileService fileService = FileService.getInstance();
        System.out.println(fileService.toString());

        FileService fileService12 = FileService.getInstance();
        System.out.println(fileService.toString());

        FileService fileservice22 = FileService.getInstance();
        System.out.println(fileService.toString());

        FileService fileservice2 = FileService.getInstance();
        System.out.println(fileService.toString());

        FileService fileservice32 = FileService.getInstance();
        System.out.println(fileService.toString());

        FileService fileservice42 = FileService.getInstance();
        System.out.println(fileService.toString());

        FileService fileservice82 = FileService.getInstance();
        System.out.println(fileService.toString());

        FileService fileservice62 = FileService.getInstance();
        System.out.println(fileService.toString());

        FileService fileservice52 = FileService.getInstance();
        System.out.println(fileService.toString());

    }
}
