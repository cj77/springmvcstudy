package test.demo.mybaits;

import org.apache.ibatis.jdbc.SQL;
import org.junit.Test;

public class TestSQL {
	@Test
	public void testSQL() throws Exception{
		SQL sql = new SQL(){{
			SELECT("*");
			FROM("TABLE");
		}};
		System.out.println(sql.toString());
	}
	
	
}
