package org.univer.entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public abstract class university_member {

    protected int id;
    protected String name;
    protected String info;
}