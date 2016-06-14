package board.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import board.dto.TB_BoardDTO;
import board.dto.TB_BoardRowMapper;

@Repository("boarddao")
public class TB_BoardDaoImpl implements TB_BoardDAO {

	@Autowired
	private JdbcTemplate template;

	@Override
	public List<TB_BoardDTO> getboardlist() {
		// TODO Auto-generated method stub
		return template.query("select * from tb_board", new TB_BoardRowMapper());
	}

}
