package com.casestudy.timetableService.business.user;

import com.casestudy.timetableService.backend.GetUserGateway;
import com.casestudy.timetableService.backend.RegisterUserGateway;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class RegisterUserImplementation implements RegisterUser{

    @Autowired
    RegisterUserGateway registerUserGateway;

    @Autowired
    GetUserGateway getUserGateway;

    @Override
    public Mono<User> createUser(User user) {
        getUserGateway.findByName(user.getName()).map(userResponse->{});
        return null;
    }
}
