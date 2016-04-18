package com.sample.services;

import java.util.List;

import com.sample.model.Facility;
import com.sample.model.Location;
import com.sample.model.Purpose;
import com.sample.model.Room;

public interface RoomBookingServices {
	
	public List<Room> getRoomList() throws Exception;
	public List<Facility> getFacilityList() throws Exception;
	public List<Purpose> getPurposeList() throws Exception;
	public List<Location> getLocationList() throws Exception;
}
