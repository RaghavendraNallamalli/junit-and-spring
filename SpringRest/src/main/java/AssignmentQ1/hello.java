package AssignmentQ1;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class hello {
	
	@GetMapping("/Q1")
	public String Q1(){return "Hello World";
	}
	}