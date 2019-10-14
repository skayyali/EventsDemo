package com.mydemos.events5q.service;

import com.mydemos.events5q.DAO.EventDao;
import com.mydemos.events5q.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EventServiceImp implements EventService {
    @Autowired
    private EventDao eventDao;

    @Transactional
    public void save(Event event) {
        eventDao.save(event);
    }

    @Transactional(readOnly = true)
    public List<Event> list() {
        return eventDao.list();
    }
}
