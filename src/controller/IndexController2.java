package controller;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class IndexController2 
{
	@RequestMapping("/index")
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
//		ModelAndView mav=new ModelAndView("index.jsp");
		ModelAndView mav=new ModelAndView("index");
		mav.addObject("message","hello spring mvc......");
		return mav;
	}

}
