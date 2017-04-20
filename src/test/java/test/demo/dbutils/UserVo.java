package test.demo.dbutils;

public class UserVo extends BaseVo<UserVo>{
	private Long id;
	private String name=null;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
