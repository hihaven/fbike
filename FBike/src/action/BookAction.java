package action;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import service.BookService;
import service.serviceImpl.BookServiceImpl;

public class BookAction {
	private String type;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String preAllBookType() {
		
		BookService bs = new BookServiceImpl();
		List list = bs.findAllBookType();
		
		Map request = (Map)ActionContext.getContext().get("request");
		request.put("bookTypeList", list);
		return "success";
	}
	
	
	public String preBooks() {

		BookService bookService = new BookServiceImpl();
		List list = bookService.findByType(type);
		Map request = (Map)ActionContext.getContext().get("request");
		request.put("bookList", list);		
		return "success";
	}
}
