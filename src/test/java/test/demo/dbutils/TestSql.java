package test.demo.dbutils;

public class TestSql<T extends BaseVo> {
	public T begin(Class<T> clazz) throws Exception{
		BaseVo vo = (BaseVo) clazz.newInstance();
		return clazz.newInstance();
	}
}
