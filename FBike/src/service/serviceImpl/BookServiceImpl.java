package service.serviceImpl;

import java.util.List;

import dao.BookDao;
import dao.daoImpl.BookDaoImpl;
import service.BookService;

public class BookServiceImpl implements BookService {
	BookDao bookDao = new BookDaoImpl();
	@Override
	public List findByType(String type) {
		
		return bookDao.findByType(type);
	}
	@Override
	public List findAllBookType() {
		
		return bookDao.findAllBookType();
	}

}
