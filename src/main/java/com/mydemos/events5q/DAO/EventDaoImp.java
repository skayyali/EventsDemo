package com.mydemos.events5q.DAO;

import com.mydemos.events5q.model.Event;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class EventDaoImp implements EventDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(Event event) {
        sessionFactory.getCurrentSession().save(event);
    }

    @Override
    public List<Event> list() {
        @SuppressWarnings("unchecked")
        TypedQuery<Event> query = sessionFactory.getCurrentSession().createQuery("from Event");
        return query.getResultList();
    }
}
