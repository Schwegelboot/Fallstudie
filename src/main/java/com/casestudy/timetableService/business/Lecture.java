package com.casestudy.timetableService.business;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Lecture {
    String name;
    String dozent;
    int dauer;

}
