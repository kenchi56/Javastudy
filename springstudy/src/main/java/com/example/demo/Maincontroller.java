package com.example.demo;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class Maincontroller {
	
//@RequestMapping(value="/", method=RequestMethod.GET)
//public ModelAndView indexGet(ModelAndView mv) {
////	mv.addObject("name", "名前がここに入ります");
////	mv.addObject("age", "年齢がここに入ります");
////	mv.addObject("height", "身長がここに入ります");
////	mv.setViewName("index");
////	return mv;
//	
//	mv.addObject("text","階乗の計算をします。");
//	mv.setViewName("kaijo");
//	return mv;
//}
//@RequestMapping(value ="/", method=RequestMethod.POST)
//public ModelAndView indexPost(ModelAndView mv, @RequestParam("nameVal") String name,
//		@RequestParam("ageVal") String age, @RequestParam("heightVal") String height){
//	mv.addObject("name",name);
//	mv.addObject("age",age);
//	mv.addObject("height",height);
//	mv.setViewName("index");
//	return mv;
	
//public ModelAndView indexPost(ModelAndView mv, @RequestParam("number") int num) {
//
////	for(int i = 1;i < number;i++) {
////		number =  number + i;
////	}
////	mv.addObject("text1",num + "だー！" );
//	mv.addObject("text",num + "の階乗は" + result(num) + "です！");
////	mv.addObject("num", 5);
//	mv.setViewName("kaijo");
//	return mv;
// }
//
//	static int result(int number) {
//		int total=1;
//		int i = 1;
////		StringBuilder x = null;
//		while(number>=i) {
//			total = total * i;
////			if(number==i) {
////				x.append(String.valueOf(i) + "=" + total);
////			}else {
////				x.append(String.valueOf(i) + "x");
////			}
//			i++;
//		}
//		return total;
//	}
	
	

//		@RequestMapping(value="/if", method=RequestMethod.GET)
//		public ModelAndView ifGet(ModelAndView mv) {
//			mv.addObject("suzuki", 1);
//			mv.setViewName("ifstudy");
//			return mv;
//		}
//		@RequestMapping(value="/if", method=RequestMethod.POST)
//		public ModelAndView ifPost(ModelAndView mv) {
//			mv.addObject("suzuki", 0);
//			mv.setViewName("ifstudy");
//			return mv;
//		}
		
//		@RequestMapping("/{name}")
//		public ModelAndView header(@PathVariable String name, ModelAndView mv) {
//			mv.addObject("name", name);
//			mv.setViewName("urlstudy");
//			return mv;
//		}
		
//		@RequestMapping("/{num}")
//		public ModelAndView num(@PathVariable int num, ModelAndView mv) {
//		String line="";
//		for(int i=0;i<num;i++) line+="あ";
//		mv.addObject("name", line);
//		mv.setViewName("urlstudy");
//		return mv;
//		}
		
//		@RequestMapping("/{n}")
//		public ModelAndView sosu(@PathVariable int n, ModelAndView mv) {
//			boolean v = true;
//			for(int i = 2; i < n; i++) {
//				if(n % i == 0) {
//					v = false; 		
//				}
//			}
//			if(v == false || n == 1 || n == 0) {		
//					mv.addObject("sosu", n + "は素数ではありません");
//			} else {
//					mv.addObject("sosu", n + "は素数です");
//			}
//			mv.setViewName("sosu");
//			return mv;
//		}
//		@RequestMapping(value="/customers")
//		public ModelAndView customers(ModelAndView mv) {
//			ArrayList<String[]>customers = new ArrayList<String[]>();
//			customers.add(new String[] {"佐藤HTML太郎","35歳","男性","東京都"});
//			customers.add(new String[] {"鈴木Java吾郎","24歳","男性","福岡県"});
//			customers.add(new String[] {"高橋CSS子","29歳","女性","北海道"});
//			customers.add(new String[] {"井澤憲一","29歳","男性","三重県"});
//			mv.addObject("customers", customers);
//			mv.setViewName("customers");
//			return mv;
//		}
		
	@Autowired
	UserDataRepository repository;
	@RequestMapping(value="/", method = RequestMethod.GET)
	public ModelAndView indexGet(ModelAndView mv){
	List<UserData> customers = repository.findAll();
	mv.addObject("customers", customers);
	mv.setViewName("index");
	return mv;
	}
	
	@RequestMapping(value="/mypage/{id}", method = RequestMethod.GET)
	public ModelAndView mypageGet(@ModelAttribute UserData userData,ModelAndView mv,@PathVariable long id){
	Optional<UserData> user = repository.findById(id);
	mv.addObject("userData", user.get());
	mv.setViewName("mypage");
	return mv;
	}
	
	
	@RequestMapping(value="/", method = RequestMethod.POST)
	public ModelAndView indexPost(@ModelAttribute("formModel") UserData
	userData, ModelAndView mv){
	repository.saveAndFlush(userData);
	return new ModelAndView("redirect:/");
	}
	
	@RequestMapping(value="/mypage/", method = RequestMethod.POST)
	public ModelAndView mypagePost(@ModelAttribute UserData userData,ModelAndView mv){
	repository.saveAndFlush(userData);
	return new ModelAndView("redirect:/");
	}
	
	@RequestMapping(value="/delete/", method =RequestMethod.POST)
	public ModelAndView delete(@RequestParam("id")
	long id, ModelAndView mv){
	repository.deleteById(id);
	return new ModelAndView("redirect:/");
	}
	
	@RequestMapping(value="/kaitori", method = RequestMethod.GET)
	public ModelAndView kaitoriGet(ModelAndView mv){
	mv.setViewName("kaitori");
	return mv;
	}
	
//	@RequestMapping(value="/", method = RequestMethod.POST)
//	public ModelAndView kaitoriPost(@ModelAttribute("formModel") UserData
//	userData, ModelAndView mv){
//	return new ModelAndView("redirect:/kaitori");
	
	
}