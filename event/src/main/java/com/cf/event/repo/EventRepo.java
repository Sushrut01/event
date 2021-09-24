package com.cf.event.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cf.event.entity.Event;


@Repository
public interface EventRepo extends JpaRepository<Event, Integer> {

}
