package pro.sky.secondTerm.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class RandomAmountGreaterThanTotal extends IllegalArgumentException {
    public RandomAmountGreaterThanTotal(String s) {
        super(s);
    }
}
