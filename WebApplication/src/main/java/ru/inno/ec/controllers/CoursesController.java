package ru.inno.ec.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.inno.ec.models.Course;
import ru.inno.ec.security.details.CustomUserDetails;
import ru.inno.ec.services.CoursesService;

import java.util.Collections;
import java.util.List;

@RequiredArgsConstructor
@Controller
@RequestMapping("/courses")
public class CoursesController {

    private final CoursesService coursesService;

    @GetMapping
    public String getCoursesPage(@AuthenticationPrincipal CustomUserDetails customUserDetails, Model model) {
        model.addAttribute("role", customUserDetails.getUser().getRole());
        model.addAttribute("courses",
                List.of(
                        Course.builder().id(1L).title("Java").build(),
                        Course.builder().id(2L).title("SQL").build(),
                        Course.builder().id(3L).title("Spring").build()
                ));
        return "courses/courses_page";
    }

    @PostMapping("/{course-id}/students")
    public String addStudentToCourse(@PathVariable("course-id") Long courseId,
                                     @RequestParam("student-id") Long studentId) {
        coursesService.addStudentToCourse(courseId, studentId);
        return "redirect:/courses/" + courseId;
    }

    @GetMapping("/{course-id}")
    public String getCoursePage(@PathVariable("course-id") Long courseId, Model model) {
        model.addAttribute("course", coursesService.getCourse(courseId));
        model.addAttribute("notInCourseStudents", coursesService.getNotInCourseStudents(courseId));
        model.addAttribute("inCourseStudents", coursesService.getInCourseStudents(courseId));
        return "courses/course_page";
    }
}
