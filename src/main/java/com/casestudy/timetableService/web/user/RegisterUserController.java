package com.casestudy.timetableService.web.user;

import com.casestudy.timetableService.business.user.RegisterUser;
        import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;

@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
public class RegisterUserController {
    @Autowired
    RegisterUser registerUser;
}
