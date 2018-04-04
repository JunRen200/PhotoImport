package com.qjr.photoimport.base.appointment.entity;

import com.qjr.photoimport.base.book.entity.Book;

public class Appointment {

	private String bookId;// ͼ��ID

	private String studentId;// ѧ��

	private String appointTime;// ԤԼʱ��

	// ���һ�ĸ�������
	private Book book;// ͼ��ʵ��

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getAppointTime() {
		return appointTime;
	}

	public void setAppointTime(String appointTime) {
		this.appointTime = appointTime;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
}
