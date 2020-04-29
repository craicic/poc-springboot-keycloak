package org.motoc.keycloaksecondpoc;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping(path = { "/", "/unsecured"})
    public String noSecuredEndpoint() {
        return "This is an unsecured endpoint payload";
    }

    @GetMapping(
            path="/admin",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public String adminSecuredEndpoint() {
        return "admin secured endpoint payload";
    }

    @GetMapping("/user")
    public String userSecuredEndpoint(){
        return "user secured endpoint payload";
    }
        

}
