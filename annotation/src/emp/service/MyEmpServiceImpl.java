package emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import board.dto.TB_BoardDTO;
import emp.dao.MyEmpDAO;
import emp.dto.MyEmpDTO;

@Service
public class MyEmpServiceImpl implements MyEmpService {
	
	@Autowired
	@Qualifier("empdao")
	MyEmpDAO dao;
	
	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void insert(MyEmpDTO user) {
		// TODO Auto-generated method stub
		dao.insert(user);
	}

	@Override
	public void update(MyEmpDTO userInfo) {
		// TODO Auto-generated method stub
		dao.update(userInfo);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public MyEmpDTO login(String id, String pass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MyEmpDTO> findByAddr(String addr) {
		// TODO Auto-generated method stub
		return dao.findByAddr(addr);
	}

	@Override
	public List<MyEmpDTO> getMemberList() {
		// TODO Auto-generated method stub
		return dao.getMemberList();
	}

	@Override
	public MyEmpDTO read(String id) {
		// TODO Auto-generated method stub
		
		return dao.read(id);
	}

	@Override
	public List<TB_BoardDTO> getboardlist() {
		return dao.getboardlist();
	}

}
