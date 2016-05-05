package action;

import java.io.Console;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.catalina.connector.Request;

import model.User;
import service.UserService;
import service.serviceImpl.UserServiceImpl;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	private String inputUserName;
	private String inputPassword;

	public String getInputUserName() {
		return inputUserName;
	}

	public void setInputUserName(String inputUserName) {
		this.inputUserName = inputUserName;
	}

	public String getInputPassword() {
		return inputPassword;
	}

	public void setInputPassword(String inputPassword) {
		this.inputPassword = inputPassword;
	}

	// µÇÂ½
	public String login() {
		UserService userService = new UserServiceImpl();
		Map session = (Map) ActionContext.getContext().getSession();

		if (userService.exist(inputUserName, inputPassword)) {
			session.put("loginName", inputUserName);

			return "success";
		} else {
			return "fail";
		}
	}

	// ÍË³ö
	public String logout() {
		Map session = (Map) ActionContext.getContext().getSession();
		if (session.get("loginName") != null) {
			session.remove("loginName");
			return "success";
		} else {
			return "fail";
		}
	}
}
