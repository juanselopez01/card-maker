package com.project.card_marker.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Schedule {
    private LocalDateTime in;
    private LocalDateTime out;


    public Schedule() {}

    public Schedule(LocalDateTime in, LocalDateTime out) {
        this.in = in;
        this.out = out;
    }

    public LocalDateTime getIn() {
        return in;
    }

    public void setIn(LocalDateTime in) {
        this.in = in;
    }

    public LocalDateTime getOut() {
        return out;
    }

    public void setOut(LocalDateTime out) {
        this.out = out;
    }
}
