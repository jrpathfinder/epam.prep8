package com.epam.learn.impl;

import com.epam.learn.dto.Event;
import com.epam.learn.dto.EventType;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
@Slf4j
public class DbSeeder implements CommandLineRunner {

    private final EventRepository repository;

    @Override
    public void run(String... args) throws Exception {
        Event event1 = new Event(1L,"Concert","Paris","Good speaker", EventType.ONE, LocalDateTime.now());
        Event event2 = new Event(2L,"Show","Berlin","Best speaker", EventType.ONE, LocalDateTime.now());
        Event event3 = new Event(3L,"Circus","Madrid","Nice speaker", EventType.ONE, LocalDateTime.now());
        Event event4 = new Event(4L,"Cinema","Rome","Interesting speaker", EventType.ONE, LocalDateTime.now());
        List<Event> events = new ArrayList<>();
        events.add(event1);
        events.add(event2);
        events.add(event3);
        events.add(event4);
        log.info(String.valueOf(events));
        repository.saveAll(events);
    }
}
