package com.casestudy.timetableService.backend;

import com.casestudy.timetableService.business.Lecture;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface CreateLectureGateway extends ReactiveCrudRepository<Lecture,String> {
    Mono<String> findByName(String name);
}
