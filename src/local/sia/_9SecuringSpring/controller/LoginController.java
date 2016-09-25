package local.sia._9SecuringSpring.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/login")
public class LoginController {

	private static final RequestMethod[] POST = null;

	@RequestMapping(method=GET)
	public void showLoginForm() {
		//http://www.cnblogs.com/xiepeixing/p/4243801.html
		//如果返回值为空，则响应的视图页面对应为访问地址,对应的逻辑视图名为 "login"
	}
	
//	@RequestMapping(method=RequestMethod.POST)
//	public void showuser() {
//		//http://www.cnblogs.com/xiepeixing/p/4243801.html
//		//如果返回值为空，则响应的视图页面对应为访问地址,对应的逻辑视图名为 "login"
//		
//	}
	
}
