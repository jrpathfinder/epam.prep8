package com.epam.learn.impl;

import com.epam.learn.api.EventService;
import com.epam.learn.dto.Event;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class EventServiceImpl implements EventService<Event> {

    private final EventRepository repository;

    @Override
    public void createEvent(Event e) {
        repository.save(e);
    }
    @Override
    public Event updateEvent(Event event, Long eventId) {
        return repository.findById(eventId)
                .map(event1 -> {

                    event1.setEventType(event.getEventType());
                    event1.setDateTime(event.getDateTime());
                    event1.setPlace(event.getPlace());
                    event1.setSpeaker(event.getSpeaker());
                    event1.setTitle(event.getTitle());

                    return repository.save(event);
                })
                .orElseGet(() -> {
                    event.setId(eventId);
                    return repository.save(event);
                });
    }

    @Override
    public Event getEvent(Long id) {
       return repository.findById(id).orElseThrow();
    }

    @Override
    public void deleteEvent(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Event> getAllEvents() {
        return (List<Event>) repository.findAll();
    }

    @Override
    public List<Event> getAllEventsByTitle(String title) {
        return repository.findByTitle(title);
    }
}
