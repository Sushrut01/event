package com.cf.event.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;

import com.cf.event.service.EventServiceImpl;
import com.cf.event.exception.EventNotFoundException;
import com.cf.event.model.EventModel;

@RestController
public class EventController {
	
	@Autowired
	EventServiceImpl eventService;
	
	//function to add an event
	@PostMapping(value="addevent")
	public EventModel addEvent(@RequestBody EventModel eventModel) {
		return eventService.addEvent(eventModel);
	}
	
	//function for getting all the events
	@GetMapping(value="events", produces = MediaType.APPLICATION_JSON_VALUE)
	public ArrayList<EventModel> getEvents(){
		ArrayList<EventModel> eventModelList = eventService.getEvents();
		return eventModelList;
	}
	
	//function for getting event by id
	@GetMapping(value="event/{eventID}", produces = MediaType.APPLICATION_JSON_VALUE)
	public EventModel getEvent(@PathVariable Integer eventID) throws EventNotFoundException {
		EventModel eventModelID = eventService.getEvent(eventID);
		return eventModelID;
	}
	
	//function for updating event by id
	@PutMapping(value="updateevent/{eventID}")
	public EventModel updateEvent(@PathVariable Integer eventID, @RequestBody EventModel eventModel) throws EventNotFoundException{
		EventModel updateEvent = eventService.updateEvent(eventID, eventModel);
		return updateEvent;
	}
	
	//function for deleting an event by id
	@DeleteMapping(value="deleteevent/{eventID}")
	public boolean removeEvent(@PathVariable Integer eventID){
		return eventService.deleteEvent(eventID);
		
	}
	
}
