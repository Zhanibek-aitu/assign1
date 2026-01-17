package repositories.interfaces;

import entities.student;
import java.util.List;

public interface IStudentRepository {
    boolean createStudent(student student);
    student getStudent(int id);
    List<student> getAllStudents();
}