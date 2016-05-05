package dao;

import java.util.List;

public interface BookDao {
	public List findAllBookType();
	public List findByType(String type);
}	
