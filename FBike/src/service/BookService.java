package service;

import java.util.List;

public interface BookService {
	public List findAllBookType();
	public List findByType(String type);
}
