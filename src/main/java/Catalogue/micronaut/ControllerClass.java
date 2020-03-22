package Catalogue.micronaut;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

@Controller("/hello")
public class ControllerClass {

    @Get
    @Produces(MediaType.TEXT_PLAIN)
    public String index() {
        return "Hello!";
    }
}
