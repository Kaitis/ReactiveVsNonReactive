package com.example.reactivedemo.domain.repository;

import com.example.reactivedemo.domain.MeterEvent;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

/**
 * Created by andreaskaitis on 26/10/2017.
 * reactive-demo
 */
public interface MeterEventRepository extends ReactiveCrudRepository<MeterEvent, String> {


}
