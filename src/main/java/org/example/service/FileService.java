package org.example.service;

import org.example.domain.Student;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class FileService {

    private static FileService fileService = null;

    private FileService() {}

    public static FileService getInstance() {
        if (fileService == null) {
            fileService = new FileService();
        }
        return fileService;
    }

    public void printFileContentsToConsole(Path path) {
        try {

           // Step 1: Read data in
            List<String> data = Files.readAllLines(path);
            List<Student> students = new ArrayList<>();

            // Step 2: Do something with the data
            data.stream()
                .skip(1)
                .forEach((String lineOfData) -> {
                    Student student = new Student();
                    String[] studentData = lineOfData.split(",");
                    // studentData = 3 "data nodes"
                    // ie: [1, Jane Doe, 2000-01-01]
                    student.setId(Integer.parseInt(studentData[0]));
                    student.setName(studentData[1]);
                    student.setBirthDate(LocalDate.parse(studentData[2], DateTimeFormatter.ISO_DATE));
                    students.add(student);
                    // System.out.println(students);
                });

            // Step 3: Output happy birthday message
            StudentService studentService = new StudentService();
            studentService.printListOfBirthdays(students);

        } catch (IOException e) {
            System.out.println("Error reading file...");
            e.printStackTrace();
        }
    }
}
