package top.haostore.admin.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloAction implements Controller{

	public HelloAction(){
		System.out.println("HelloAction创建");
	}
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("handleRequest执行");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("msg","我的第一个SpringMVC请求参数！");
		modelAndView.setViewName("index");
		return modelAndView;
	}


}
