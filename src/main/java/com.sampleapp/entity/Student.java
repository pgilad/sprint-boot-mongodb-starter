package com.sampleapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;

@Document(collection = "students")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {
    @Id
    private long id;
    @NotNull
    private String name;
    private String course;
}
