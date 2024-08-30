package org.example;

import java.time.LocalDateTime;

public class TimeMasterForTests implements TimeMaster {
    LocalDateTime time;

    public TimeMasterForTests (LocalDateTime time) {
        this.time = time;
    }

    @Override
    public LocalDateTime getTime() {
        return time;
    }
}
