package cat.itacademy.barcelonactiva.shimmartinez.nahuel.s04.t01.n02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {

    @GetMapping("/HelloWorld")
    public String saluda (@RequestParam (defaultValue = "UNKNOWN") String nom) {
        return "Hello, " + nom + " you are running a Gradle project.";
    }

    @GetMapping(value = {"/HelloWorld2","/HelloWorld2/{nom}"})
    public String Saluda2(@PathVariable(required = false)String nom){
        if(nom == null) {
            nom = "UNKNOWN";
        }
        return "Hello, " + nom + " you are running a Gradle project.";
    }
}
