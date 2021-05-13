package Harika;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("company")
public class Company {
	@Value("888")
	private Integer id;
	@Value("yes yy.")
	private String name;

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
