package com.relation.jpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class CourseRatingKey implements Serializable {

    @Column(name ="student_id" , nullable = false )
    private Long studentId;

    @Column(name = "course_id ", nullable = false)
    private Long courseId;


}
