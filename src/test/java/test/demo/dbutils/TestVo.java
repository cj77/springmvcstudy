package test.demo.dbutils;

import org.junit.Test;

public class TestVo {
	@Test
	public void testVo() throws Exception{
		UserVo vo =new UserVo();
		vo.setId(1L);
		vo.setName("TEst");
		vo = vo.WHERE();
		vo.setName("Test2");
		System.out.println(vo);
	}
}
