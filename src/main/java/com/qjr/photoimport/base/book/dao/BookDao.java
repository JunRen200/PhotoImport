package com.qjr.photoimport.base.book.dao;

        import java.util.List;
        import java.util.Map;

        import org.apache.ibatis.annotations.Param;

        import com.qjr.photoimport.base.book.entity.Book;

public interface BookDao {
    Map<Object, Object> queryById(String id);

    List<Book> queryAll(@Param("offset") int offset, @Param("limit") int limit);

    boolean insertBook(Book book);
}
