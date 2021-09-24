package com.cf.event.service;

import java.util.ArrayList;

import com.cf.event.exception.EventNotFoundException;
import com.cf.event.model.EventModel;

public interface EventService {
	
	EventModel addEvent(EventModel eventModel);
	EventModel getEvent(Integer eventID) throws EventNotFoundException;
	ArrayList<EventModel>getEvents();
	boolean deleteEvent(Integer eventID);
	EventModel updateEvent(Integer eventID, EventModel eventModel) throws EventNotFoundException; 
	
}
