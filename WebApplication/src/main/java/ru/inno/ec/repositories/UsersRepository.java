package ru.inno.ec.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.inno.ec.models.Course;
import ru.inno.ec.models.User;

import java.util.List;
import java.util.Optional;

public interface UsersRepository extends JpaRepository<User, Long> {
    List<User> findAllByStateNot(User.State state);

    List<User> findAllByCoursesNotContainsAndState(Course course, User.State state);

    List<User> findAllByCoursesContains(Course course);

    Optional<User> findByEmail(String email);
}
