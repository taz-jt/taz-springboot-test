package profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class RegistrationController {
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/register")
	public @ResponseBody String register(
			@RequestParam String email,
			@RequestParam String password
	) {
		User newUser = new User();
		newUser.setEmail(email);
		newUser.setPassword(password);
		System.out.println(email);
		System.out.print(password);
		userRepository.save(newUser);
		return "new user saved";
	}

}
