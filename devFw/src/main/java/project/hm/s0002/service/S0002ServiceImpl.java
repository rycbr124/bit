package project.hm.s0002.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import project.hm.s0002.dao.S0002DAO;
import project.hm.s0002.vo.S0002VO;

@Service("s0002Service")
public class S0002ServiceImpl implements S0002Service{
	@Autowired
	private S0002DAO s0002DAO;
	
	@Override
	public List<S0002VO> searchList(Map<String, Object> searchMap) throws DataAccessException {
		List<S0002VO> list = s0002DAO.searchList(searchMap);
		return list;
	}

	@Override
	public void saveData(Map<String, String[]> dataMap) throws DataAccessException {
		// TODO Auto-generated method stub
		
	}

}
