package yu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
	
	@Autowired
	private HelloRemo helloRemo;
	
	@RequestMapping("/hello/{name}")
	public String index(@PathVariable("name") String name) {
		return helloRemo.hello(name);
	}

}
