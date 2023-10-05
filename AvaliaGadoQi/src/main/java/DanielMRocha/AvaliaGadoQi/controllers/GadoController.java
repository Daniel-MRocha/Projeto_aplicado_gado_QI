package DanielMRocha.AvaliaGadoQi.controllers;

import DanielMRocha.AvaliaGadoQi.entity.Bovino;
import DanielMRocha.AvaliaGadoQi.service.GadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class GadoController {

    @Autowired
    GadoService gs;

    @GetMapping("/Bovinos")
    public List<Bovino> ctodos(){
        List<Bovino> todos =  gs.stodos();
        return todos;
    }
}
