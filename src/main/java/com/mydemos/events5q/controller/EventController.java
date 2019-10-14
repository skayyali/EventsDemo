package com.mydemos.events5q.controller;

import java.util.Locale;
import javax.validation.Valid;

import com.mydemos.events5q.model.Event;
import com.mydemos.events5q.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class EventController {

    @Autowired
    private EventService eventService;

    @GetMapping("/")
    public String eventForm(Locale locale, Model model) {
        model.addAttribute("events", eventService.list());
        return "editEvents";
    }

    @ModelAttribute("event")
    public Event formBackingObject() {
        return new Event();
    }

    @PostMapping("/addEvent")
    public String saveUser(@ModelAttribute("event") @Valid Event event,
                           BindingResult result, Model model) {

        if (result.hasErrors()) {
            model.addAttribute("users", eventService.list());
            return "editEvents";
        }

        eventService.save(event);
        return "redirect:/";
    }
}