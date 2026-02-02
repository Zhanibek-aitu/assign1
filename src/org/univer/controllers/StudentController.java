package org.univer.controllers;

import org.univer.entities.student;
import org.univer.repositories.interfaces.IStudentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final IStudentRepository repo;
    public StudentController(IStudentRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<student> getAll() {
        return repo.getAllStudents();
    }

    @GetMapping("/{id}")
    public student getOne(@PathVariable int id) {
        return repo.getStudent(id);
    }

    @PostMapping
    public String create(@RequestBody student st) {
        boolean created = repo.createStudent(st);
        return created ? "Student created!" : "Creation failed!";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        boolean deleted = repo.deleteStudent(id);
        return deleted ? "Student deleted" : "Student not found";
    }
}