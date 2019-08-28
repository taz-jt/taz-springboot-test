package profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@Autowired
	private UserRepository userRepository;

	@RequestMapping
	public String index() {
		return "Congrats on booting up";
	}

	@GetMapping("/user")
	public @ResponseBody Iterable<User> getAllUser() {
		return userRepository.findAll();
	}
}
