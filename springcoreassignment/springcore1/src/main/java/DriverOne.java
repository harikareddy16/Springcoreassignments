import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.third.Triangle;

public class DriverOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("cus.xml");
		Customer cust=(Customer) context.getBean("Customer");
		cust.printDetails();
	}

}
