package com.cf.event.service;

import java.util.ArrayList;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cf.event.JpaUtils.EventUtils;
import com.cf.event.entity.Event;
import com.cf.event.exception.EventNotFoundException;
import com.cf.event.model.EventModel;
import com.cf.event.repo.EventRepo;

@Service
@Transactional
public class EventServiceImpl implements EventService {
	
	@Autowired
	private EventRepo eventRepo;

	@Override
	public EventModel addEvent(EventModel eventModel) {
		Event event = eventRepo.saveAndFlush(EventUtils.convertToEvent(eventModel));
		return EventUtils.convertToEventModel(event);
	}

	@Override
	public EventModel getEvent(Integer eventID) throws EventNotFoundException {
		Optional<Event> optional = eventRepo.findById(eventID);
		if(optional.isPresent()) {
			Event event = optional.get();
			return EventUtils.convertToEventModel(event);
		}
		else {
			throw new EventNotFoundException("Event with this id is not available");
		}
	}

	@Override
	public ArrayList<EventModel> getEvents() {
		ArrayList<Event> event = (ArrayList<Event>) eventRepo.findAll();
		ArrayList<EventModel> eventModelList = EventUtils.convertToEventModelList(event);
		return eventModelList;
	}

	@Override
	public boolean deleteEvent(Integer eventID) {
//		Optional<Event> deleteEvent = eventRepo.findById(eventID);
//		Event event = null;
//		if(deleteEvent.isPresent()) {
//			event = deleteEvent.get();
//		}
//		else {
//			throw new EventNotFoundException("Event with given id not found");
//		}
		
//		eventRepo.delete(event);
//		
//		Event eventCheck = eventRepo.findById(eventID).get();
//		
//		if(null == eventCheck) {
//			return true;
//		}
//		return false;
		
		eventRepo.deleteById(eventID);
		
		Optional<Event> deleteEvent = eventRepo.findById(eventID);
		
		if(deleteEvent.isPresent()) {
			return false;
		}
		
		else {
			return true;
		}
		
	}

	@Override
	public EventModel updateEvent(Integer eventID, EventModel eventModel) throws EventNotFoundException {
		Optional<Event> updateEvent = eventRepo.findById(eventID);
		Event event = null;
		if(updateEvent.isPresent()) {
			event = updateEvent.get();
			event.setName(eventModel.getName());
			event.setAdult_fee(eventModel.getAdult_fee());
			event.setChild_fee(eventModel.getChild_fee());
			event.setDate(eventModel.getDate());
			event.setDescription(eventModel.getDescription());
			event.setFoods(eventModel.getFoods());
			event.setLocation(eventModel.getLocation());
			event.setTotal_seats(eventModel.getTotal_seats());
		}
		else {
			throw new EventNotFoundException("Event with given id not found");
		}
		eventRepo.flush();
		return EventUtils.convertToEventModel(event);
	}
	
	
	
}
