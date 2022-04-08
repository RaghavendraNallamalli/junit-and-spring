package springassignment6;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan
@PropertySource("dbconfig.properties")
public class configmain {
    public static void main(String[] args) {
     ApplicationContext context=new ClassPathXmlApplicationContext("Q6.xml");
     config obj=(config) context.getBean("config");
     obj.display();

      //  System.out.println(obj.user());
    }
}