package com.project.card_marker.dto;

import java.time.LocalDateTime;

public class AddScheduleRequest {
    private LocalDateTime in;
    private LocalDateTime out;

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
