package test;

import com.qjr.photoimport.base.book.dao.BookDao;
import com.qjr.photoimport.base.book.entity.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Map;
import java.util.UUID;


@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration("/spring/spring-service.xml") 
public class Book_test {

		
	private String bookUUID=UUID.randomUUID().toString();
	
	@Autowired
	private BookDao dao;
	
	@Test
	public void bookQueryById() {
		Map<Object,Object> map = dao.queryById("1001");
		System.out.println(map);
	}
	
	@Test
	public void bookQueryAll() {
		List<Book> books = dao.queryAll(0, 100);
		for(Book book: books) {
			System.out.println(book);
		}
	}
	
	@Test
	public void insertBook() {
		Book book = new Book();
		
		bookUUID=bookUUID.replace("-", "");
		
		book.setBookId(bookUUID);
		book.setName("php");
		book.setNumber(1000);
		System.out.println(dao.insertBook(book));
	}
	
}
