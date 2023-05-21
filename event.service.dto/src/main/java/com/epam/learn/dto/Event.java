package com.epam.learn.dto;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Accessors(chain = true)
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    String title;
    String place;
    String speaker;
    EventType eventType;
    LocalDateTime dateTime;
}
