package com.sample.dao.roomBooking;

import java.util.List;

import com.sample.model.roomBooking.Facility;
import com.sample.model.roomBooking.Location;
import com.sample.model.roomBooking.Purpose;
import com.sample.model.roomBooking.Room;

public interface RoomBookingDao {
	
	public List<Room> getRoomList() throws Exception;
	public List<Purpose> getPurposeList() throws Exception;
	public List<Facility> getFacilityList() throws Exception;
	public List<Location> getLocationList() throws Exception;
}
