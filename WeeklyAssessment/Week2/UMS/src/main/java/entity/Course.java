package entity;

import jakarta.persistence.*;
import java.util.*;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String courseName;

    @ManyToMany(mappedBy = "courses")
    private Set<Student> students = new HashSet<>();

    public Course() {}
    public Course(String courseName) { this.courseName = courseName; }

    public Set<Student> getStudents() {
        return students;
    }

    public String getCourseName() {
        return courseName;
    }

    public Long getId() {
        return id;
    }
}