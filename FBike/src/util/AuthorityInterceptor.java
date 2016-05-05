package util;

import java.util.Map;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class AuthorityInterceptor extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {

		Map session = arg0.getInvocationContext().getSession();
		String loginName = (String)session.get("loginName");
		
		if ( null == loginName )
			return "authorityError";
		
		return arg0.invoke();
	}

}
