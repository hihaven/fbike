package action;

import model.Car;
import service.CarService;
import service.serviceImpl.CarServiceImpl;

import com.opensymphony.xwork2.ActionSupport;

public class CarAction extends ActionSupport{
	
	private String 	userName;		// 用户名
	private String 	bookId;			// 图书Id
	private String 	bookName;		// 图书名
	private Float 	price;			// 图书单价
	private int		quantity;		// 图书数量
	
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String addToCar() {
		
		CarService  cs = new CarServiceImpl();
		
		Car car = new Car();
		
		car.setUserName(userName);
		car.setBookId(bookId);
		car.setBookName(bookName);
		car.setPrice(price);
		car.setQuantity(1);
		
		cs.save(car);
		return "success";
	}
}
