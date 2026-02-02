package org.univer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.univer.data.PostgresDB;
import org.univer.data.interfaces.IDB;
import org.univer.repositories.StudentRepository;
import org.univer.repositories.interfaces.IStudentRepository;

@SpringBootApplication
public class MyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }

    @Bean
    public IDB idb() {
        return new PostgresDB();
    }

    @Bean
    public IStudentRepository studentRepository(IDB db) {
        return new StudentRepository(db);
    }
}