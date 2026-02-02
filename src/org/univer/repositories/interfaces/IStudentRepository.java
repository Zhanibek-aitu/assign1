package org.univer.repositories.interfaces;

import org.univer.entities.student;
import java.util.List;

public interface IStudentRepository {
    boolean createStudent(student student);
    student getStudent(int id);
    List<student> getAllStudents();
    boolean updateStudent(int id, String newGroup);
    boolean deleteStudent(int id);

    default void printLog(String message) {
        System.out.println("📊 LOG: " + message);
    }

    static boolean checkId(int id) {
        return id > 0;
    }
}