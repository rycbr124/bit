package project.hm.s0002.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

public interface S0002Controller {
	public ModelAndView searchInit(HttpServletRequest request, HttpServletResponse response) throws Exception;
	public Map searchList(String p_id, HttpServletRequest request, HttpServletResponse response) throws Exception;
	
	public Map saveData(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
