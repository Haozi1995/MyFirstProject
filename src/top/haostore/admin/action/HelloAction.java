package top.haostore.admin.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloAction implements Controller{

	public HelloAction(){
		System.out.println("HelloAction����");
	}
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("handleRequestִ��");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("msg","�ҵĵ�һ��SpringMVC���������");
		modelAndView.setViewName("index");
		return modelAndView;
	}


}
