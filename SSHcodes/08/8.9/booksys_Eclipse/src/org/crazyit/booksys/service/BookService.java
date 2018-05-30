package org.crazyit.booksys.service;

import java.util.List;

import org.crazyit.booksys.domain.Book;

/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public interface BookService
{
	// ����ͼ��
	void addBook(Book book);

	List<Book> getAllBooks();
	
	void deleteBook(int id);
}
