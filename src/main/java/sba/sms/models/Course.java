package sba.sms.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import sba.sms.dao.CourseI;
import sba.sms.services.CourseService;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/**
 * Course is a POJO, configured as a persistent class that represents (or maps to) a table
 * name 'course' in the database. A Course object contains fields that represent course
 * information and a mapping of 'courses' that indicate an inverse or referencing side
 * of the relationship. Implement Lombok annotations to eliminate boilerplate code.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "course")
public class Course {
    @Column(name= "id", unique = true)
    @Id private int id;
    @Column(name = "name",length = 50, nullable = false)
    private String name;
    @Column(name = "instructor", length = 50, nullable = false)
    private String instructor;
    @Column(name = "students")
    private Set<Student> students;

    @Override
    public void createCourse(Course course) {

    }

    @Override
    public Course getCourseById(int courseId) {
        return null;
    }

    @Override
    public List<Course> getAllCourses() {
        return List.of();
    }
}
