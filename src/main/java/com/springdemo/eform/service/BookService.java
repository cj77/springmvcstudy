package com.springdemo.eform.service;

import java.util.List;

import com.springdemo.eform.entity.Book;

public interface BookService {
	public List<Book> queryAll(int offset,int limit);
	public void update();
	public void update3() throws Exception;
	public void update4() throws Exception;
	
	public List<Book> queryPage(int page,int pageSize);
}
