package com.casestudy.timetableService.web;

import com.casestudy.timetableService.business.CreateLecture;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@AllArgsConstructor
@RestController
public class CreateLectureController {

    CreateLecture createLecture;

    @GetMapping(path = "lecture-create")
    public Mono<String> createLecture(){
        return createLecture.createLecture();
    }

}
