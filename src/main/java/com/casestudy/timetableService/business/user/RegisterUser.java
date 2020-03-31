package com.casestudy.timetableService.business.user;

import reactor.core.publisher.Mono;

public interface RegisterUser {
    Mono<User> createUser(User user);
}
