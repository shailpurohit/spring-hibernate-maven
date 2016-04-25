package com.sample.services.roomBooking;

import java.sql.Date;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sample.dao.roomBooking.RoomBookingDao;
import com.sample.model.roomBooking.Facility;
import com.sample.model.roomBooking.Location;
import com.sample.model.roomBooking.Occupieds;
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

	@Override
	public boolean bookARoom(Occupieds occupy) throws Exception {
		Date start_time = getFormattedTime(occupy.getTimeHours(), occupy.getTimeMinutes(), occupy.getTimeCycle());
		occupy.setStartTime(new Time(start_time.getTime()));
		Time end_time = new Time(start_time.getTime() + (occupy.getDurationHours() * 3600000) + (occupy.getDurationMinutes() * 60000));
		occupy.setEndTime(end_time);

		return roomBookingDao.bookARoom(occupy);
	}

	private Date getFormattedTime(int hours, int minutes, String timeCycle) throws ParseException {
		String s_time = hours + ":" + minutes + " " + timeCycle;
		SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm aa");
		java.util.Date date = dateFormat.parse(s_time);
		Date start_date = new Date(date.getTime());

		return start_date;
	}

}
