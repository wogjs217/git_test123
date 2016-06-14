package emp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import board.dto.TB_BoardDTO;
import board.dto.TB_BoardRowMapper;
import emp.dto.MyEmpDTO;
import emp.dto.MyEmpRowMapper;

@Repository("empdao")
public class MyEmpDaoImpl implements MyEmpDAO {

	@Autowired
	private JdbcTemplate template;

	@Override
	public int count() { // 카운트만
		// TODO Auto-generated method stub

		return template.queryForObject("select count(*) from emp",
				Integer.class);
	}

	@Override
	public void insert(MyEmpDTO user) {
		// TODO Auto-generated method stub
		String sql = "insert into myemp values(?,?,?,1000,?,'002',?)";

		int result = template.update(sql, user.getId(), user.getPass(),
				user.getAddr(), user.getGrade(), user.getName());
		System.out.println(result + "개 삽입");
	}

	@Override
	public void update(MyEmpDTO userInfo) {
		// TODO Auto-generated method stub
		String sql = "update myemp set pass=?,addr=?,grade=? where id=?";

		int result = template.update(sql, userInfo.getPass(),
				userInfo.getAddr(),userInfo.getGrade(),userInfo.getId());
		System.out.println(result + "개 수정 ");
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		String sql = "delete from myemp where id=?";
		
		int result = template.update(sql, id);
		System.out.println(result + "개 삭제 ");
	}

	@Override
	public MyEmpDTO login(String id, String pass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MyEmpDTO> getMemberList() {
		// TODO Auto-generated method stub
		return template.query("select * from myemp",new MyEmpRowMapper());
	}

	@Override
	public List<MyEmpDTO> findByAddr(String addr) {
	      
	      return template.query("select * from myemp where addr like ?", new Object[]{"%"+addr+"%"}, 
	            new MyEmpRowMapper());
	      
	      
	   }

	@Override
	public MyEmpDTO read(String id) {
		return template.queryForObject("select * from myemp where id=?", new Object[]{id},new MyEmpRowMapper());
	}

	@Override
	public List<TB_BoardDTO> getboardlist() {
		// TODO Auto-generated method stub
		return template.query("select * from tb_board", new TB_BoardRowMapper());
	}

}
