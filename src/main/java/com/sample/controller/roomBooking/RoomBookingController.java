package com.sample.controller.roomBooking;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sample.model.Status;
import com.sample.model.roomBooking.Facility;
import com.sample.model.roomBooking.Location;
import com.sample.model.roomBooking.Occupieds;
import com.sample.model.roomBooking.Purpose;
import com.sample.model.roomBooking.Room;
import com.sample.services.roomBooking.RoomBookingServices;

@Controller
@RequestMapping("/roomBooking")
public class RoomBookingController {
	
	@Autowired
	RoomBookingServices roombookingServices;

	static final Logger logger = Logger.getLogger(RoomBookingController.class);

	@RequestMapping(value = "/room/book-a-room", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody
	Status bookARoom(@RequestBody Occupieds occupy) {
		try {
			roombookingServices.bookARoom(occupy);
			return new Status(1, "Room booked Successfully !");
		} catch (Exception e) {
			return new Status(0, e.toString());
		}
	}

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
