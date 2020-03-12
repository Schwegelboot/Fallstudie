package com.casestudy.timetableService.web;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.Value;

import java.time.LocalDateTime;

@JsonIgnoreProperties(
        ignoreUnknown = true
)
@RequiredArgsConstructor
@Data
@Value
public class CreateLectureRequest {
    String name;
    String lecturer;
    String location;
    int duration;
    String timeslot;
}
