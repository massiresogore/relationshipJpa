package com.relation.jpa.model;

import jakarta.persistence.*;

@Entity
public class CourseRating {
   @EmbeddedId
   private CourseRatingKey id;

   @ManyToOne
   @MapsId("studentId")
   @JoinColumn(name = "student_id", nullable = false)
   private Student student;

   @ManyToOne
   @MapsId("courseId")
   @JoinColumn(name = "course_id", nullable = false)
   private Course course;

   private int rating;

}
