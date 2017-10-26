package com.example.nonreactivedemo.controller;


import com.example.nonreactivedemo.domain.MeterEvent;
import com.example.nonreactivedemo.domain.repository.MeterEventRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by andreaskaitis on 26/10/2017.
 * reactive-demo
 */
@SuppressWarnings("unchecked")
@RestController
public class NonReactiveRestController {

    private final MeterEventRepository repository;

    public NonReactiveRestController(MeterEventRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/event")
    void create(@RequestBody MeterEvent meterEvent) {
        this.repository.save(meterEvent);
    }


    @GetMapping(value = "/events")
    List<MeterEvent> getAllEvents() {
        return (List) this.repository.findAll();
    }
}
