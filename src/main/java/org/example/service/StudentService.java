package org.example.service;

import org.example.domain.Student;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class StudentService {

    public void printListOfBirthdays(List<Student> students) {
        boolean hasABirthday = false;
        for (Student student : students) {
            String todaysDate = LocalDate.now()
                    .format(DateTimeFormatter.ofPattern("MM-dd"));

            String studentBirthDate = student.getBirthDate()
                    .format(DateTimeFormatter.ofPattern("MM-dd"));

            if (todaysDate.equals(studentBirthDate)) {
                System.out.println("Happy Birthday " + student.getName());
                hasABirthday = true;
            }
        }

        if (!hasABirthday) {
            System.out.println("No birthdays today");
        }
    }
}
