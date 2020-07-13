/**
 * Package: PACKAGE_NAME
 *
 * @author : Lijin
 * @date :  2020/7/13
 */
public class User {

	private Integer id;
	private String name;
	private Integer age;

	public User(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
