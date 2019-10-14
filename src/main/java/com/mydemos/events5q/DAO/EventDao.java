package com.mydemos.events5q.DAO;

import com.mydemos.events5q.model.Event;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventDao {
    void save(Event event);
    List<Event> list();
}
