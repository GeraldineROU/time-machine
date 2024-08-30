package org.example;

import java.time.LocalDateTime;

public class RealTimeMaster implements TimeMaster{
    @Override
    public LocalDateTime getTime() {
        return LocalDateTime.now();
    }
}
