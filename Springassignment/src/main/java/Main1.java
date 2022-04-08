import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Assignment1.xml");
		
		
		
		  Customer customer = (Customer) context.getBean("Customer2");
		  customer.detailsof();
		 		 
		
		
		
			
	}

}