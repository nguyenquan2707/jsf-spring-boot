package nl.georg.jsfspringboot.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ApiRestController {

    @Value("${custom.property:not found}")
    private String message;

    @GetMapping(
            path = "/message"
    )
    public ResponseEntity<String> getMessage() {
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
