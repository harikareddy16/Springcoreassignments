package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class TestDriver {

	@Test
	void test() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("cus.xml");
		Customer customeromer=(Customer) context.getBean("Customer");
		assertAll(
		()->assertEquals(customeromer.getCustomerName(),"harika""),
		()->assertEquals(customeromer.getCustomerId(),1234),
		()->assertEquals(customeromer.getCustomerContact(),8919071058),
		()->assertEquals(customeromer.getCustomerAddress().getStreet(),"kovur"),
		()->assertEquals(customeromer.getCustomerAddress().getCity(),"Nellore"),
		()->assertEquals(customeromer.getCustomerAddress().getZip(),567891),
		()->assertEquals(customeromer.getCustomerAddress().getCountry(),"India")
	);
	}

}
