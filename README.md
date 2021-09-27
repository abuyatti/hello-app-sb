# hello-app-sb
Demo project for Spring Boot

http://localhost:8082/health
http://localhost:8082/info

http://localhost:8080/swagger
http://localhost:8080/swagger-ui/index.html

# workaround for /swagger

@Controller
public class SwaggerController {

	@GetMapping("/swagger")
	public String swagger() {
		return "redirect:/v2/api-docs";
	}

}

docker build -t abuyatti/hello-app-sb:1.0.0 .
docker run -d -p 8080:8080 -p 8082:8082 abuyatti/hello-app-sb:1.0.0