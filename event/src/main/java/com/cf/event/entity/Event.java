package com.cf.event.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="event")
public class Event {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Event_ID", nullable = false)
	private Integer event_ID;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Location")
	private String location;
	
	@Column(name="Date")
	private String date;
	
	@Column(name="Adult_Fee")
	private Integer adult_fee;
	
	@Column(name="Child_Fee")
	private Integer child_fee;
	
	@Column(name="Description")
	private String description;
	
	@Column(name="Foods")
	private String foods;
	
	@Column(name="Total_Seats")
	private Integer total_seats;

	
	//getters and setters  for all the attributes 
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

	//toString method
	@Override
	public String toString() {
		return "Event [event_ID=" + event_ID + ", name=" + name + ", location=" + location + ", date=" + date
				+ ", adult_fee=" + adult_fee + ", child_fee=" + child_fee + ", description=" + description + ", foods="
				+ foods + ", total_seats=" + total_seats + ", getEvent_ID()=" + getEvent_ID() + ", getName()="
				+ getName() + ", getLocation()=" + getLocation() + ", getDate()=" + getDate() + ", getAdult_fee()="
				+ getAdult_fee() + ", getChild_fee()=" + getChild_fee() + ", getDescription()=" + getDescription()
				+ ", getFoods()=" + getFoods() + ", getTotal_seats()=" + getTotal_seats() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
