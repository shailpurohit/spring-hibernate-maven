package com.sample.services.roomBooking;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sample.dao.roomBooking.RoomBookingDao;
import com.sample.model.roomBooking.Facility;
import com.sample.model.roomBooking.Location;
import com.sample.model.roomBooking.Purpose;
import com.sample.model.roomBooking.Room;

public class RoomBookingServicesImpl implements RoomBookingServices {

	@Autowired
	RoomBookingDao roomBookingDao;

	@Override
	public List<Room> getRoomList() throws Exception {
		return roomBookingDao.getRoomList();
	}

	@Override
	public List<Facility> getFacilityList() throws Exception {
		return roomBookingDao.getFacilityList();
	}

	@Override
	public List<Purpose> getPurposeList() throws Exception {
		return roomBookingDao.getPurposeList();
	}

	@Override
	public List<Location> getLocationList() throws Exception {
		return roomBookingDao.getLocationList();
	}

}
