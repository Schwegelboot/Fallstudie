package com.casestudy.timetableService.backend;

import com.casestudy.timetableService.business.user.User;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface GetUserGateway extends ReactiveCrudRepository<User,String> {
    Mono<String> findByName(String name);
}
