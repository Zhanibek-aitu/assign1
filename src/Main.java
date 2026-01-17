import data.PostgresDB;
import data.interfaces.IDB;
import entities.student;
import repositories.StudentRepository;
import repositories.interfaces.IStudentRepository;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        IDB db = new PostgresDB();
        IStudentRepository repo = new StudentRepository(db);

        System.out.println("--- DEMO: Working with PostgreSQL ---");
        System.out.println("\n1. Adding main student (Baidaulet)...");
        student newStudent = new student("Baidaulet", "Student", 255000, "CS-2500");

        boolean result = repo.createStudent(newStudent);

        if (result) {
            System.out.println("Student added successfully");
        } else {
            System.out.println("Student might already exist");
        }
        System.out.println("\n2. Getting all students from Database:");
        List<student> studentsFromDB = repo.getAllStudents();
        for (student s : studentsFromDB) {
            System.out.println(s.toString());
        }

        System.out.println("\n--- DEMO: Testing UPDATE and DELETE ---");

        int testId = 999;
        student testStudent = new student("Steve", "Student", testId, "Group");
        repo.createStudent(testStudent);
        System.out.println("Created test student: " + testStudent.getName());

        System.out.println("--> Updating group for ID " + testId + "...");
        repo.updateStudent(testId, "NEW-GROUP-X");
        System.out.println("Updated");

        System.out.println("--> Deleting student with ID " + testId + "...");
        repo.deleteStudent(testId);
        System.out.println("Deleted");

        System.out.println("\n--- FINISHED ---");
    }
}