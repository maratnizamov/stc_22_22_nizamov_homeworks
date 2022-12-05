package ru.inno.ec.services;

import ru.inno.ec.models.User;
import ru.inno.ec.security.details.CustomUserDetails;

public interface ProfileService {
    User getCurrent(CustomUserDetails userDetails);
}
