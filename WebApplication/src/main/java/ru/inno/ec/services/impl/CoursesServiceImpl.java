package ru.inno.ec.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.inno.ec.models.Course;
import ru.inno.ec.models.User;
import ru.inno.ec.repositories.CoursesRepository;
import ru.inno.ec.repositories.UsersRepository;
import ru.inno.ec.services.CoursesService;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CoursesServiceImpl implements CoursesService {

    private final CoursesRepository coursesRepository;
    private final UsersRepository usersRepository;

    @Override
    public void addStudentToCourse(Long courseId, Long studentId) {
        Course course = coursesRepository.findById(courseId).orElseThrow();
        User student = usersRepository.findById(studentId).orElseThrow();

        student.getCourses().add(course);

        usersRepository.save(student);
    }

    @Override
    public Course getCourse(Long courseId) {
        return coursesRepository.findById(courseId).orElseThrow();
    }

    @Override
    public List<User> getNotInCourseStudents(Long courseId) {
        Course course = coursesRepository.findById(courseId).orElseThrow();
        return usersRepository.findAllByCoursesNotContainsAndState(course, User.State.CONFIRMED);
    }

    @Override
    public List<User> getInCourseStudents(Long courseId) {
        Course course = coursesRepository.findById(courseId).orElseThrow();
        return usersRepository.findAllByCoursesContains(course);
    }
}
