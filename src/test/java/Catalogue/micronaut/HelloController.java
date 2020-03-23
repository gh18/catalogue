package Catalogue.micronaut;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/request")
public class HelloController {

    @Get
    public HttpResponse<String> hello(HttpRequest<?> request) {
        String name = request.getParameters()
                            .getFirst("name")
                            .orElse("Nobody");
        return HttpResponse.ok("Hello" + name + "!")
                .header("X-My-Header", "Foo");
    }
}
