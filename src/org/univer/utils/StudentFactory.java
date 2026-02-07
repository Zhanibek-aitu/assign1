package org.univer.utils;

import org.univer.entities.student;

public class StudentFactory {

    public static student createFreshman(int id, String name, String group) {
        return student.builder()
                .id(id)
                .name(name)
                .info("Freshman Student")
                .group_id(group)
                .build();
    }
}