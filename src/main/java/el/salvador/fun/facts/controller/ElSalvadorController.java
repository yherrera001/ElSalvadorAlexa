package el.salvador.fun.facts.controller;


import el.salvador.fun.facts.model.AlexaRequest;
import el.salvador.fun.facts.service.ElSalvadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
public class ElSalvadorController {

    private ElSalvadorService elSalvadorService;

    @Autowired
    public ElSalvadorController(ElSalvadorService elSalvadorService) {
        this.elSalvadorService = elSalvadorService;
    }

    @PostMapping(value = "/funFact", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String getFunFact(@RequestBody AlexaRequest alexaRequest) {
       return elSalvadorService.getFunFact(alexaRequest);
    }
}
