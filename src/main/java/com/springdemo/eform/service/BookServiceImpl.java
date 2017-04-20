package com.springdemo.eform.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageRowBounds;
import com.springdemo.eform.dao.BookDao;
import com.springdemo.eform.entity.Book;


@Service
public class BookServiceImpl implements BookService {
	@Autowired
    private BookDao bookDao;
	
	public List<Book> queryAll(int offset,int limit){
		
		return bookDao.queryAll(offset, limit);
	}
	
	public List<Book> queryPage(int offset,int limit){
		PageRowBounds pageRowBounds = new PageRowBounds(offset, limit);
		
		List<Book> list = bookDao.getPage(pageRowBounds);
		System.out.println(list);
		
		return list;
	}
	
	@Transactional(rollbackFor=RuntimeException.class)
	public void update(){
		bookDao.reduceNumber(1000);
		//throw new RuntimeException("test");  
	}
	
	public void update2() throws Exception{
		bookDao.reduceNumber(1000);
		//throw new RuntimeException("test");  
	}
	
	public void update3() throws Exception{
		update();
		System.out.println("update1");
		update2();
		System.out.println("update2");
	}
	
	public void update4() throws Exception{
		update2();
		System.out.println("update2");
		update();
		System.out.println("update1");
	}
	
}
