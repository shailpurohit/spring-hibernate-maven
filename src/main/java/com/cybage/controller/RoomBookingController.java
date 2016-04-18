package com.cybage.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cybage.model.Facility;
import com.cybage.model.Location;
import com.cybage.model.Purpose;
import com.cybage.model.Room;
import com.cybage.services.RoomBookingServices;

@Controller
@RequestMapping("/roomBooking")
public class RoomBookingController {
	
	@Autowired
	RoomBookingServices roombookingServices;

	static final Logger logger = Logger.getLogger(RestController.class);

	@RequestMapping(value = "/room/list", method = RequestMethod.GET)
	public @ResponseBody
	List<Room> getRooms() {
		List<Room> roomList = null;
		try {
			roomList = roombookingServices.getRoomList();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return roomList;
	}
	
	@RequestMapping(value = "/facility/list", method = RequestMethod.GET)
	public @ResponseBody
	List<Facility> getFacilities() {
		List<Facility> facilityList = null;
		try {
			facilityList = roombookingServices.getFacilityList();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return facilityList;
	}
	
	@RequestMapping(value = "/purpose/list", method = RequestMethod.GET)
	public @ResponseBody
	List<Purpose> getPurposes() {
		List<Purpose> purposeList = null;
		try {
			purposeList = roombookingServices.getPurposeList();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return purposeList;
	}
	
	@RequestMapping(value = "/location/list", method = RequestMethod.GET)
	public @ResponseBody
	List<Location> getLocations() {
		List<Location> locationList = null;
		try {
			locationList = roombookingServices.getLocationList();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return locationList;
	}
	
}
