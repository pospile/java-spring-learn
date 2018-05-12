package cz.underholding.burgerovac.exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class IllegalCRUDMethod extends RuntimeException {

    public IllegalCRUDMethod() {
        super(String.format("Updating with id is not supported in create method"));
    }

}