package com.sample.dao.roomBooking;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.sample.model.roomBooking.Facility;
import com.sample.model.roomBooking.Location;
import com.sample.model.roomBooking.Occupieds;
import com.sample.model.roomBooking.Purpose;
import com.sample.model.roomBooking.Room;

public class RoomBookingDaoImpl implements RoomBookingDao {

	@Autowired
	SessionFactory sessionFactory;

	Session session = null;
	Transaction tx = null;

	
	@SuppressWarnings("unchecked")
	@Override
	public List<Room> getRoomList() throws Exception {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		List<Room> roomList = session.createCriteria(Room.class)
				.list();
		tx.commit();
		return roomList;
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<Purpose> getPurposeList() throws Exception {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		List<Purpose> purposeList = session.createCriteria(Purpose.class)
				.list();
		tx.commit();
		return purposeList;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Facility> getFacilityList() throws Exception {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		List<Facility> facilityList = session.createCriteria(Facility.class)
				.list();
		tx.commit();
		return facilityList;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Location> getLocationList() throws Exception {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		List<Location> locationList = session.createCriteria(Location.class)
				.list();
		tx.commit();
		return locationList;
	}

	@Override
	public boolean bookARoom(Occupieds occupy) throws Exception {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		session.save(occupy);
		tx.commit();
		session.close();

		return false;
	}

}
