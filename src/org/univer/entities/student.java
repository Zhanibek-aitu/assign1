package org.univer.entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor


@EqualsAndHashCode(callSuper = true)


@ToString(callSuper = true)



public class student extends university_member {
    private String group_id;
}