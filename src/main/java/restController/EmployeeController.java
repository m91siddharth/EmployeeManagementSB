package restController;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import data.Employees;

@RestController
public class EmployeeController {

	public static final String empName = "Hello %s ";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/employee")
	public Employees employee(@RequestParam(value = "name", defaultValue = "Shivam") String name) {
		return new Employees(counter.incrementAndGet(), String.format(empName, name));
	}
}
