package com.qjr.photoimport.base.appointment.dao;

import com.qjr.photoimport.base.appointment.entity.Appointment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AppointmentDao {
	int inserAppointment(@Param("bookId") String bookId, @Param("studentId") String studentId);
	 ////测试0403 18:34
	List<Appointment> queryByKeyWithBook(@Param("bookId") String bookId);
}
