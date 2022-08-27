package Board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

	@GetMapping("/login")
	public String loginForm() {
		return "login";
	}

	@ResponseBody
	@PostMapping(value = "/login", produces = { "application/json;charset=utf-8" })
	public String loginResult(String id, String pw) {

		String condition = "";

		if (id.equals("abcd") && pw.equals("1234")) {
			condition = "login ok";
		} else {
			condition = "login fail";
		}
		return "{\"result\" : \"" + condition + "\"}";
	}
}
