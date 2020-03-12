package com.casestudy.timetableService.business;

import com.casestudy.timetableService.backend.CreateLectureGateway;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public class CreateLectureImplementation implements CreateLecture {

    @Autowired
    CreateLectureGateway gateway;

    @Override
    public Mono<Lecture> createLecture(Lecture lecture) {
        return gateway.save(lecture);
    }
}
