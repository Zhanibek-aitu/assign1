package org.univer.controllers;

import org.univer.entities.student;
import org.univer.repositories.interfaces.IStudentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

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
        student st = repo.getStudent(id);
        if (st == null) {
            throw new org.univer.exceptions.StudentNotFoundException("Student not found with id: " + id);
        }
        return st;
    }

    @GetMapping("/search")
    public List<student> search(@RequestParam String text) {
        return repo.getAllStudents().stream()
                .filter(s -> s.getName().toLowerCase().contains(text.toLowerCase()))
                .collect(Collectors.toList());
    }

    @PostMapping
    public String create(@RequestBody student st) {
        if (st.getName() == null || st.getName().isEmpty()) {
            throw new org.univer.exceptions.ValidationException("Student name cannot be empty!");
        }
        student demo = student.builder()
                .id(st.getId())
                .name(st.getName())
                .info("Created via Builder Pattern")
                .group_id(st.getGroup_id())
                .build();
        System.out.println("Pattern Builder demonstration: " + demo);

        boolean created = repo.createStudent(st);
        return created ? "Student created!" : "Creation failed!";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        boolean deleted = repo.deleteStudent(id);
        return deleted ? "Student deleted" : "Student not found";
    }
}