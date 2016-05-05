package service;

import java.util.List;

import model.User;

public interface UserService {
	public boolean exist(String name);
	public boolean exist(String name, String pswd);
	public void save(User user);
	public boolean register(String yonghuming,String password,String useraddress,String userimage,int ueserrole);
}
