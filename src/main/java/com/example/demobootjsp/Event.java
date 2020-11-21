package com.example.demobootjsp;

import java.time.LocalDateTime;

/**
 * @author swlee
 * @contact frenchline707@gmail.com
 * @since 2019-11-21
 */
public class Event {

    private String name;

    private LocalDateTime starts;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getStarts() {
        return starts;
    }

    public void setStarts(LocalDateTime starts) {
        this.starts = starts;
    }
}
