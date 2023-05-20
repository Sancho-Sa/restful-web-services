package com.rest.webservice.restfulwebservices.world.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionPersonController {
    @GetMapping("/v1/person")
    public PersonV1 getPerson1stV(){
        return new PersonV1("Guts Berserk");
    }

    @GetMapping("/v2/person")
    public PersonV2 getPerson2ndV(){
        return new PersonV2(new Name("Guts", "Berserk"));
    }

    @GetMapping(path = "/person/param", params = "version=1")
    public PersonV1 getPerson1stVRequestParameter(){
        return new PersonV1("Guts Berserk");
    }

    @GetMapping(path = "/person/param", params = "version=2")
    public PersonV2 getPerson2ndVRequestParameter(){
        return new PersonV2(new Name("Guts", "Berserk"));
    }

    @GetMapping(path = "/person/header", headers = "X-API-VERSION=1")
    public PersonV1 getPerson1stVHeadersParameter(){
        return new PersonV1("Guts Berserk");
    }

    @GetMapping(path = "/person/header", headers = "X-API-VERSION=2")
    public PersonV2 getPerson2ndVHeadersParameter(){
        return new PersonV2(new Name("Guts", "Berserk"));
    }

    @GetMapping(path = "/person/accept", produces = "application/vnd.company.app-v1+jason")
    public PersonV1 getPerson1stVAcceptParameter(){
        return new PersonV1("Guts Berserk");
    }

    @GetMapping(path = "/person/accept", produces = "application/vnd.company.app-v2+jason")
    public PersonV2 getPerson2ndVAcceptParameter(){
        return new PersonV2(new Name("Guts", "Berserk"));
    }
}
