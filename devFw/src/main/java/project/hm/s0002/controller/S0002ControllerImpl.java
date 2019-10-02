package project.hm.s0002.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import project.hm.s0002.service.S0002Service;
import project.hm.s0002.vo.S0002VO;



@Controller("s0002Controller")
public class S0002ControllerImpl implements S0002Controller{
	private static final Logger logger = LoggerFactory.getLogger(S0002ControllerImpl.class);
	@Autowired
	S0002Service s0002Service;
	@Autowired
	S0002VO s0002VO;
	
	
	@Override
	@RequestMapping(value="/hm/s0002/searchInit.do",method= {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView searchInit(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		ModelAndView mav = new ModelAndView("hm/ibsheet_customers");
		return mav;
	}

	@Override
	@RequestMapping(value="/hm/s0002/searchList.do",method= {RequestMethod.GET, RequestMethod.POST})
	@ResponseBody
	public Map searchList(@RequestParam(value="p_id", required=false) String p_id, HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		Map<String,Object> searchMap = new HashMap<String, Object>();
		Map<String,Object> resultMap = new HashMap<String, Object>();
		
		searchMap.put("p_id", p_id);
		
		List<S0002VO> data = s0002Service.searchList(searchMap);
		resultMap.put("Data", data);
				
		return resultMap;
	}

	@Override
	@RequestMapping(value="/hm/s0002/saveData.do",method= {RequestMethod.GET, RequestMethod.POST})
	@ResponseBody
	public Map saveData(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
