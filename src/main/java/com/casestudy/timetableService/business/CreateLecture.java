package com.casestudy.timetableService.business;

import reactor.core.publisher.Mono;

public interface CreateLecture {

    Mono<String> createLecture();


}
