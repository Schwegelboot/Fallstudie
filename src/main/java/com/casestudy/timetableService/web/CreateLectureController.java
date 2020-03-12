package com.casestudy.timetableService.web;

import com.casestudy.timetableService.business.CreateLecture;
import com.casestudy.timetableService.business.Lecture;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;

@AllArgsConstructor
@RestController
public class CreateLectureController {
    @Autowired
    CreateLecture createLecture;

    @PostMapping (path = "lecture-create")
    public Mono<Lecture> createLecture(@RequestBody CreateLectureRequest request){

        Lecture lecture = Lecture.builder()
                .name(request.getName())
                .timeslot(request.getTimeslot())
                .duration(request.getDuration())
                .lecturer(request.getLecturer())
                .location(request.getLocation())
                .build();

        return createLecture.createLecture(lecture);
    }
}