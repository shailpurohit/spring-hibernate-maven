package com.sample.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Entity
@Table(name = "\"Occupieds\"")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Occupieds extends AbstractTimestampEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", columnDefinition = "serial")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "\"room_id\"")
	private int roomId;

	@Column(name = "\"date\"")
	private Date date;
	
	@Column(name = "\"durationHours\"")
	private int durationHours;
	
	@Column(name = "\"durationMinutes\"")
	private int durationMinutes;
	
	@Column(name = "\"start_time\"")
	private Date startTime;
	
	@Column(name = "\"end_time\"")
	private Date endTime;
	
	@Column(name = "\"meetingSubject\"")
	private String meetingSubject;
	
	@Column(name = "\"timeHours\"")
	private int timeHours;
	
	@Column(name = "\"timeMinutes\"")
	private int timeMinutes;
	
	@Column(name = "\"timeCycle\"")
	private String timeCycle;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getDurationHours() {
		return durationHours;
	}

	public void setDurationHours(int durationHours) {
		this.durationHours = durationHours;
	}

	public int getDurationMinutes() {
		return durationMinutes;
	}

	public void setDurationMinutes(int durationMinutes) {
		this.durationMinutes = durationMinutes;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getMeetingSubject() {
		return meetingSubject;
	}

	public void setMeetingSubject(String meetingSubject) {
		this.meetingSubject = meetingSubject;
	}

	public int getTimeHours() {
		return timeHours;
	}

	public void setTimeHours(int timeHours) {
		this.timeHours = timeHours;
	}

	public int getTimeMinutes() {
		return timeMinutes;
	}

	public void setTimeMinutes(int timeMinutes) {
		this.timeMinutes = timeMinutes;
	}

	public String getTimeCycle() {
		return timeCycle;
	}

	public void setTimeCycle(String timeCycle) {
		this.timeCycle = timeCycle;
	}
	
}
