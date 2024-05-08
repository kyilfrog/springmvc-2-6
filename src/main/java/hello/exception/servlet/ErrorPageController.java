package hello.exception.servlet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class ErrorPageController {

	@RequestMapping("/error_page/404")
	public String errorPage404(HttpServletRequest request, HttpServletResponse response) {
		log.info("errorPage 404");
		return "error_page/404";
	}
	
	@RequestMapping("/error_page/500")
	public String errorPage500(HttpServletRequest request, HttpServletResponse response) {
		log.info("errorPage 500");
		return "error_page/500";
	}
}
