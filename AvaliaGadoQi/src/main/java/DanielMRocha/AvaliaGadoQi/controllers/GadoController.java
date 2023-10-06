package DanielMRocha.AvaliaGadoQi.controllers;

import DanielMRocha.AvaliaGadoQi.dtos.BovinoDto;
import DanielMRocha.AvaliaGadoQi.dtos.DashBoardDto;
import DanielMRocha.AvaliaGadoQi.entity.Bovino;
import DanielMRocha.AvaliaGadoQi.service.GadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class GadoController {

    @Autowired
    GadoService gs;

    @GetMapping("/Bovinos")
    public List<BovinoDto> ctodos(){

        List<BovinoDto> todosDtos = new ArrayList<>();
        List<Bovino> todos =  gs.stodos();

        todosDtos = todos.stream()
                        .map(BovinoDto::new)
                        .toList();
        return todosDtos;
    }

    @GetMapping("/Dashboard")
    public DashBoardDto dash_dados(){
        return gs.seedDashBoard();
    }
}
