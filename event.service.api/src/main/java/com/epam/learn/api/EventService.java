package com.epam.learn.api;


import java.util.List;

public interface EventService<T> {
    void createEvent(T event);
    T updateEvent(T event, Long id);
    T getEvent(Long id);
    void deleteEvent(Long id);
    List<T> getAllEvents();
    List<T> getAllEventsByTitle(String title);
}
