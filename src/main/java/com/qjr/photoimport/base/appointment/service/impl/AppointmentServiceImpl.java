package com.qjr.photoimport.base.appointment.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.qjr.photoimport.base.appointment.dao.AppointmentDao;
import com.qjr.photoimport.base.appointment.entity.Appointment;
import com.qjr.photoimport.base.appointment.service.IAppointmentService;

@Service
public class AppointmentServiceImpl implements IAppointmentService{

	@Autowired
	private AppointmentDao dao;


	@Transactional(propagation=Propagation.REQUIRED)
	public void insertAppointment() {
		String bookUUID=UUID.randomUUID().toString();
		String studentUUID=UUID.randomUUID().toString();
		System.out.println(dao.inserAppointment("1000", studentUUID));
	}

	@Transactional(propagation=Propagation.REQUIRED)
	public void queryByKeyWithBook() {
		long start =System.currentTimeMillis();
		List<Appointment> appointment = dao.queryByKeyWithBook("1000");
		long end =System.currentTimeMillis();
		System.out.println(end-start+":ms");	
		for(Appointment appointment2 : appointment) {
			System.out.println(appointment2.getBookId());
			System.out.println(appointment2.getStudentId());
			System.out.println(appointment2.getAppointTime());
			System.out.println(appointment2.getBook());
			System.out.println("==============");
		}
	}
}
