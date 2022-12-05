package ru.inno.ec.services.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import ru.inno.ec.models.Course;
import ru.inno.ec.models.User;
import ru.inno.ec.repositories.CoursesRepository;
import ru.inno.ec.repositories.UsersRepository;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class CoursesServiceImplTest {

    private static final long EXISTED_COURSE_ID = 1L;

    private static final long STUDENT_ID = 4L;
    private static final long NOT_EXISTED_COURSE_ID = 2L;

    private static final List<User> STUDENTS_OF_EXISTED_COURSE = Arrays.asList(
            User.builder().id(1L).email("test@1.com").build(),
            User.builder().id(2L).email("test@2.com").build(),
            User.builder().id(3L).email("test@3.com").build());

    private static final User STUDENT = User.builder()
            .id(STUDENT_ID)
            .email("test@4.com")
            .courses(new HashSet<>())
            .build();
    private static final Course EXISTED_COURSE = Course.builder()
            .id(EXISTED_COURSE_ID)
            .title("Тестовый курс")
            .start(LocalDate.of(2022, 12, 10))
            .finish(LocalDate.of(2023, 12, 10))
            .build();

    private CoursesServiceImpl coursesService;

    private CoursesRepository coursesRepository;

    private UsersRepository usersRepository;

    @BeforeEach
    void setUp() {
        setUpMocks();

        stubMocks();

        this.coursesService = new CoursesServiceImpl(coursesRepository, usersRepository);
    }

    private void setUpMocks() {
        this.usersRepository = Mockito.mock(UsersRepository.class);
        this.coursesRepository = Mockito.mock(CoursesRepository.class);
    }

    private void stubMocks() {
        when(coursesRepository.findById(EXISTED_COURSE_ID)).thenReturn(Optional.of(EXISTED_COURSE));
        when(coursesRepository.findById(NOT_EXISTED_COURSE_ID)).thenReturn(Optional.empty());

        when(usersRepository.findAllByCoursesContains(EXISTED_COURSE)).thenReturn(STUDENTS_OF_EXISTED_COURSE);
        when(usersRepository.findById(STUDENT_ID)).thenReturn(Optional.of(STUDENT));
    }

    @Test
    void get_in_course_students_for_existed_course() {
        List<User> actual = coursesService.getInCourseStudents(EXISTED_COURSE_ID);
        List<User> expected = STUDENTS_OF_EXISTED_COURSE;
        assertEquals(expected, actual);
    }

    @Test
    void get_in_course_students_for_not_existed_course() {
        assertThrows(RuntimeException.class, () -> {
            coursesService.getInCourseStudents(NOT_EXISTED_COURSE_ID);
        });
    }

    @Test
    void add_student_to_course() {
        coursesService.addStudentToCourse(1L, 4L);
        verify(usersRepository).save(STUDENT);
    }
}