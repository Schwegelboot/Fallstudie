package com.casestudy.timetableService.business;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
@AllArgsConstructor
public class CreateLectureImplementation implements CreateLecture {

    @Override
    public Mono<String> createLecture() {

        return Mono.just("Sinnhaft");
    }
}
