package org.example;

import java.time.LocalDateTime;

public class FakeTimeMaster implements TimeMaster{
    @Override
    public LocalDateTime getTime() {
        return LocalDateTime.now();
    }
}
