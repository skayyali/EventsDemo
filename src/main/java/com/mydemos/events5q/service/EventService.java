package com.mydemos.events5q.service;

import com.mydemos.events5q.model.Event;

import java.util.List;

public interface EventService {
    void save(Event event);

    List<Event> list();
}