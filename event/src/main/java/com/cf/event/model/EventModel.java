package com.cf.event.model;

import org.springframework.stereotype.Component;

@Component
public class EventModel {
	
	private Integer event_ID;
	private String name;
	private String location;
	private String date;
	private Integer adult_fee;
	private Integer child_fee;
	private String description;
	private String foods;
	private Integer total_seats;
	public Integer getEvent_ID() {
		return event_ID;
	}
	public void setEvent_ID(Integer event_ID) {
		this.event_ID = event_ID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Integer getAdult_fee() {
		return adult_fee;
	}
	public void setAdult_fee(Integer adult_fee) {
		this.adult_fee = adult_fee;
	}
	public Integer getChild_fee() {
		return child_fee;
	}
	public void setChild_fee(Integer child_fee) {
		this.child_fee = child_fee;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getFoods() {
		return foods;
	}
	public void setFoods(String foods) {
		this.foods = foods;
	}
	public Integer getTotal_seats() {
		return total_seats;
	}
	public void setTotal_seats(Integer total_seats) {
		this.total_seats = total_seats;
	}
	@Override
	public String toString() {
		return "EventModel [event_ID=" + event_ID + ", name=" + name + ", location=" + location + ", date=" + date
				+ ", adult_fee=" + adult_fee + ", child_fee=" + child_fee + ", description=" + description + ", foods="
				+ foods + ", total_seats=" + total_seats + "]";
	}
	
	
	
}
