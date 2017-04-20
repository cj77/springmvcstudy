package com.springdemo.eform;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.springdemo.eform.entity.Book;
import com.springdemo.eform.service.BookService;

public class BookDaoTest extends BaseTest {

    @Autowired
    private BookService bookService;
  

    @Test
    public void testQueryAll() throws Exception {
        List<Book> books = bookService.queryAll(0, 4);
        System.out.println("begin-test");
        for (Book book : books) {
            System.out.println(book.getName()+ ","+book.getNumber());
        }
    }
    
    @Test
    public void testUpdate() throws Exception{
    	bookService.update4();
    	System.out.println("testUpdate");
    }
    
    @Test
    public void testPage() throws Exception{
    	List<Book> list = bookService.queryPage(1, 2);
    	System.out.println(list);
    }
}
