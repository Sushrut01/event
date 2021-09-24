package com.cf.event.JpaUtils;

import java.util.ArrayList;

import com.cf.event.entity.Event;
import com.cf.event.model.EventModel;

public class EventUtils {
	
	public static Event convertToEvent(EventModel eventModel) {
		Event event = new Event();
		event.setEvent_ID(eventModel.getEvent_ID());
		event.setName(eventModel.getName());
		event.setLocation(eventModel.getLocation());
		event.setDate(eventModel.getDate());
		event.setAdult_fee(eventModel.getAdult_fee());
		event.setChild_fee(eventModel.getChild_fee());
		event.setDescription(eventModel.getDescription());
		event.setFoods(eventModel.getFoods());
		event.setTotal_seats(eventModel.getTotal_seats());
		return event;
	}
	
	public static EventModel convertToEventModel(Event event) {
		EventModel eventModel = new EventModel();
		eventModel.setEvent_ID(event.getEvent_ID());
		eventModel.setName(event.getName());
		eventModel.setLocation(event.getLocation());
		eventModel.setDate(event.getDate());
		eventModel.setAdult_fee(event.getAdult_fee());
		eventModel.setChild_fee(event.getChild_fee());
		eventModel.setDescription(event.getDescription());
		eventModel.setFoods(event.getFoods());
		eventModel.setTotal_seats(event.getTotal_seats());
		return eventModel;
	}
	
	public static ArrayList<EventModel> convertToEventModelList(ArrayList<Event> event){
		ArrayList<EventModel> eventModel = new ArrayList<EventModel>();
		for(Event temp : event ) {
			eventModel.add(convertToEventModel(temp));
		}
		return eventModel;
	}
	
	public static ArrayList<Event> convertToEventList(ArrayList<EventModel> eventModel){
		ArrayList<Event> event = new ArrayList<Event>();
		for(EventModel temp : eventModel ) {
			event.add(convertToEvent(temp));
		}
		return event;
	}
	
}
