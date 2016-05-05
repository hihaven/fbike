package action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import model.User;
import service.UserService;
import service.serviceImpl.UserServiceImpl;

public class register extends ActionSupport {
	private String yonghuming;
	private String password;
	private String checkpassword;
	private String useraddress;
	private String userimage;
	private Integer userrole;
	public String getYonghuming() {
		return yonghuming;
	}

	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCheckpassword() {
		return checkpassword;
	}

	public void setCheckpassword(String checkpassword) {
		this.checkpassword = checkpassword;
	}

	public String getUseraddress() {
		return useraddress;
	}

	public void setUseraddress(String useraddress) {
		this.useraddress = useraddress;
	}

	public String getUserimage() {
		return userimage;
	}

	public void setUserimage(String userimage) {
		this.userimage = userimage;
	}

	public Integer getUserrole() {
		return userrole;
	}

	public void setUserrole(Integer userrole) {
		this.userrole = userrole;
	}

	
	
	// зЂВс
	public String regist() {
		UserService userService = new UserServiceImpl();
		if (userService.register(yonghuming, password, useraddress, userimage, userrole)) {
			return "success";
		} else {
			return "error";
		}
	}
}
