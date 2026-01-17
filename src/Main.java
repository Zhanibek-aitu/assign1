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
        System.out.println("Adding a new student to Database...");
        student newStudent = new student("Baidaulet", "Student", 255000, "CS-2500");
        boolean result = repo.createStudent(newStudent);

        if (result) {
            System.out.println("Student added successfully");
        } else {
            System.out.println("Failed to add student");
        }
        System.out.println("\nGetting all students from Database:");
        List<student> studentsFromDB = repo.getAllStudents();

        for (student s : studentsFromDB) {
            System.out.println(s.toString());
        }
    }
}