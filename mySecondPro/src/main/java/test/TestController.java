package test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class TestController {
	@RequestMapping("/test.do")
	public ModelAndView test(){
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg","스프링에서 넘오온 어토테인션 데이터");
		mav.setViewName("test");
		System.out.println("fdfds");
		return mav;
	}
}
