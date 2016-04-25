package com.sample.services.roomBooking;

import java.util.List;

import com.sample.model.roomBooking.Facility;
import com.sample.model.roomBooking.Location;
import com.sample.model.roomBooking.Occupieds;
import com.sample.model.roomBooking.Purpose;
import com.sample.model.roomBooking.Room;

public interface RoomBookingServices {
	
	public boolean bookARoom(Occupieds occupy) throws Exception;
	public List<Room> getRoomList() throws Exception;
	public List<Facility> getFacilityList() throws Exception;
	public List<Purpose> getPurposeList() throws Exception;
	public List<Location> getLocationList() throws Exception;
}
