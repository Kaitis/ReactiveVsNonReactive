package com.example.nonreactivedemo.domain.repository;


import com.example.nonreactivedemo.domain.MeterEvent;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by andreaskaitis on 26/10/2017.
 * reactive-demo
 */
public interface MeterEventRepository extends CrudRepository<MeterEvent, String> {


}
