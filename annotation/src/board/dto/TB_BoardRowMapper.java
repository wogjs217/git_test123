package board.dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
//JdbcTemplate���� ������ jdbc���ø� Ŭ�������� select�� ������ �� ó���� �� �ֵ���
//�ϳ��� row�� ���� ó�� ������ ��� �ִ� ��ü�� query�޼ҵ� ���ο��� ȣ���� ��ü
public class TB_BoardRowMapper implements RowMapper<TB_BoardDTO> {

	@Override
	public TB_BoardDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		//List�� �� ��ҷ� add��ų ���ڵ带 dto�� ��ȯ�ϴ� �۾��� ����
		//System.out.println("mapRow()===> "+rowNum);
		TB_BoardDTO board  = new TB_BoardDTO(rs.getString(1), rs.getString(2), rs.getString(3),
				rs.getString(4),rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8));
		//System.out.println(emp);
		return board;
	}
}
