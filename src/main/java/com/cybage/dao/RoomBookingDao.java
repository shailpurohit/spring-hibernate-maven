package com.cybage.dao;

import java.util.List;

import com.cybage.model.Facility;
import com.cybage.model.Location;
import com.cybage.model.Purpose;
import com.cybage.model.Room;

public interface RoomBookingDao {
	
	public List<Room> getRoomList() throws Exception;
	public List<Purpose> getPurposeList() throws Exception;
	public List<Facility> getFacilityList() throws Exception;
	public List<Location> getLocationList() throws Exception;
}
