package test.demo.dbutils;

public class BaseVo<T> {
	private T selectObject=null;
	public final T WHERE() throws Exception{
		BaseVo vo  = (BaseVo) this.getClass().newInstance();
		vo.selectObject = this;
		return (T)vo;
	}
	
}
