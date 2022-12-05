package ru.inno.ec.services;

import ru.inno.ec.models.Course;
import ru.inno.ec.models.User;

import java.util.List;

public interface CoursesService {
    void addStudentToCourse(Long courseId, Long studentId);

    Course getCourse(Long courseId);

    List<User> getNotInCourseStudents(Long courseId);

    List<User> getInCourseStudents(Long courseId);
}
