package ru.inno.ec.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.inno.ec.models.User;
import ru.inno.ec.repositories.UsersRepository;
import ru.inno.ec.security.details.CustomUserDetails;
import ru.inno.ec.services.ProfileService;

@RequiredArgsConstructor
@Service
public class ProfileServiceImpl implements ProfileService {

    private final UsersRepository usersRepository;

    @Override
    public User getCurrent(CustomUserDetails userDetails) {
        return usersRepository.findById(userDetails.getUser().getId()).orElseThrow();
    }
}
