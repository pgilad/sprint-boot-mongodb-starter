package com.sampleapp.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;

@Document(collection = "students")
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @Getter
    @Setter
    private long id;
    @NotNull
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private String course;
}
