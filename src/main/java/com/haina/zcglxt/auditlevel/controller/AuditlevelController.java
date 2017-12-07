package com.haina.zcglxt.auditlevel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.haina.zcglxt.auditlevel.domain.Auditlevel;
import com.haina.zcglxt.auditlevel.service.AuditlevelService;

@Controller
@SessionAttributes(value={"newslist"})
public class AuditlevelController {
	@Autowired
	private AuditlevelService auditlevelService;
	@RequestMapping("/findall")
	public ModelAndView findall(){
		List<Auditlevel> list = auditlevelService.findAll();
		System.out.println(list);
		ModelAndView mav = new ModelAndView("newslist");
		mav.addObject("newslist",list);
		return mav;
	}

}
