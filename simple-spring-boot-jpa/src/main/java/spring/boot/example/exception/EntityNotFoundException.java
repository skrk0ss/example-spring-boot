package spring.boot.example.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "entity not found ..")
public class EntityNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 113875347726298435L;

	public EntityNotFoundException(String key) {
		super(key + " not available");
	}
}