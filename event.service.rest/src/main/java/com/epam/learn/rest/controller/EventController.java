package com.epam.learn.rest.controller;

import com.epam.learn.dto.Event;
import com.epam.learn.impl.EventServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/event")
@RequiredArgsConstructor
@Api("Контроллер для событий")
public class EventController {

    private final EventServiceImpl service;

    @GetMapping
    @ApiOperation("Получение списка событий")
    public List<Event> getAllEvents(){
        return service.getAllEvents();
    }

    @PostMapping
    @ApiOperation("Создание списка событий")
    public void createEvent(@RequestBody Event event){
        service.createEvent(event);
    }

    @PutMapping("/{id}")
    @ApiOperation("Обновление списка событий")
    public Event updateEvent(@RequestBody Event event, @PathVariable Long id){
        return service.updateEvent(event, id);
    }

    @GetMapping("/{id}")
    @ApiOperation("Получение события по id")
    public Event getEvent(@PathVariable Long id){
        return service.getEvent(id);
    }

    @DeleteMapping("/{id}")
    @ApiOperation("Удаление события")
    public void deleteById(@PathVariable Long id){
        service.deleteEvent(id);
    }

    @GetMapping("/by-title/{title}")
    @ApiOperation("Получение списка событий по title")
    public List<Event> findAllByTitle(@PathVariable String title){
        return service.getAllEventsByTitle(title);
    }

}
