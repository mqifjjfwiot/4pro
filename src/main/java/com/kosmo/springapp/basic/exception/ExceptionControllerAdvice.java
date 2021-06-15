package com.kosmo.springapp.basic.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
/*
 * @ControllerAdvice 를 통해 모든 컨트롤러에서 발생하는 예외 처리
 * @ExceptionHandler 를 통해 발생하는 예외 종류에 따른 메소드 정의
 */

//개발시는 아래 주석
@ControllerAdvice
public class ExceptionControllerAdvice {
	
	@ExceptionHandler({Exception.class})
	public String error(Model model,Exception e) {
		model.addAttribute("errors",String.format("<h4>담당자에게 연락하세요.연락처는 010-1234-5678입니다</h4><h5>예외 메시지:%s</h5>",e.getMessage()));
		//뷰정보 반환]
		return "exception13/Errors";
	}//////////////
	
}
