package com.cybage.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cybage.dao.RoomBookingDao;
import com.cybage.model.Facility;
import com.cybage.model.Location;
import com.cybage.model.Purpose;
import com.cybage.model.Room;

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
