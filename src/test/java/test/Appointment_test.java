package test;

import com.qjr.photoimport.base.appointment.service.IAppointmentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.UUID;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring/spring-service.xml")
public class Appointment_test {

	private String bookUUID=UUID.randomUUID().toString();
	private String studentUUID=UUID.randomUUID().toString();

	@Autowired
	private IAppointmentService service;

	@Test
	public void insertAppointment() {
		service.insertAppointment();
	}

	@Test
	/*添加事务，创建1次数据库连接(293ms),不添加事务创建2次数据库连接(388ms)*/
	public void queryByKeyWithBook() {
		service.queryByKeyWithBook();
	}
}
