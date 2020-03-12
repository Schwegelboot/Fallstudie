package com.casestudy.timetableService.business;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Lecture {
    String name;
    String lecturer;
    String location;
    int duration;
    String timeslot;
}