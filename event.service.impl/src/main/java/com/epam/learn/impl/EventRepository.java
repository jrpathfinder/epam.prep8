package com.epam.learn.impl;

import com.epam.learn.dto.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends CrudRepository<Event, Long> {


    List<Event> findByTitle(String title);

}
