package model;

public class User {
	private int id;
	private String UserName;
	private int UserMum;
	private int UserRole;
	private String UserPwd;
	private String UserAddress;
	private String UserImage;
	private int UserBikenum;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public int getUserMum() {
		return UserMum;
	}
	public void setUserMum(int userMum) {
		UserMum = userMum;
	}
	public int getUserRole() {
		return UserRole;
	}
	public void setUserRole(int userRole) {
		UserRole = userRole;
	}
	public String getUserPwd() {
		return UserPwd;
	}
	public void setUserPwd(String userPwd) {
		UserPwd = userPwd;
	}
	public String getUserAddress() {
		return UserAddress;
	}
	public void setUserAddress(String userAddress) {
		UserAddress = userAddress;
	}
	public String getUserImage() {
		return UserImage;
	}
	public void setUserImage(String userImage) {
		UserImage = userImage;
	}
	public int getUserBikenum() {
		return UserBikenum;
	}
	public void setUserBikenum(int userBikenum) {
		UserBikenum = userBikenum;
	}
	
}
