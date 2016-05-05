package service.serviceImpl;

import model.User;
import dao.UserDao;
import dao.daoImpl.UserDaoImpl;
import service.UserService;

public class UserServiceImpl implements UserService{
	UserDao userDao = new UserDaoImpl();
	@Override
	public boolean exist(String name) {
		
		return userDao.exist(name);
	}

	@Override
	public boolean exist(String name, String pswd) {
		
		return userDao.exist(name, pswd);
	}

	@Override
	public void save(User user) {
		
		userDao.save(user); 
	}

	@Override
	public boolean register(String yonghuming, String password, String useraddress, String userimage,
			int ueserrole) {
		if(userDao.register(yonghuming, password, useraddress, userimage, ueserrole))
		return true;
		else
			return false;
	}

}
