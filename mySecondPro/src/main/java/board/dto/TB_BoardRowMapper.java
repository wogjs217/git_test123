package board.dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
//JdbcTemplate같은 스프링 jdbc템플릿 클래스에서 select를 수행한 후 처리할 수 있도록
//하나의 row에 대한 처리 정보를 담고 있는 객체로 query메소드 내부에서 호출할 객체
public class TB_BoardRowMapper implements RowMapper<TB_BoardDTO> {

	@Override
	public TB_BoardDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		//List의 한 요소로 add시킬 레코드를 dto로 변환하는 작업을 수행
		//System.out.println("mapRow()===> "+rowNum);
		TB_BoardDTO board  = new TB_BoardDTO(rs.getString(1), rs.getString(2), rs.getString(3),
				rs.getString(4),rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8));
		//System.out.println(emp);
		return board;
	}
}
