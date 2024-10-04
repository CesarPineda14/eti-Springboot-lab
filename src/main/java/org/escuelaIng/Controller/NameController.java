package org.escuelaIng.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class NameController {

    @GetMapping("/myname")
    public String getMyName() {
        return "César Javier Pineda Delgado";
    }
}
