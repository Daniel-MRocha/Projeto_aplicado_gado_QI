package DanielMRocha.AvaliaGadoQi.controllers;

import DanielMRocha.AvaliaGadoQi.dtos.BovinoDto;
import DanielMRocha.AvaliaGadoQi.dtos.DashBoardDto;
import DanielMRocha.AvaliaGadoQi.entity.Bovino;
import DanielMRocha.AvaliaGadoQi.service.GadoService;
import DanielMRocha.AvaliaGadoQi.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class GadoController {

    @Autowired
    GadoService gs;

    @Autowired
    GeneroService genServ;

    @GetMapping("/Bovinos")
    public List<BovinoDto> ctodos(){

        List<BovinoDto> todosDtos = new ArrayList<>();
        List<Bovino> todos =  gs.stodos();

        todosDtos = todos.stream()
                        .map(BovinoDto::new)
                        .toList();
        return todosDtos;
    }

    @GetMapping("/Bovinos/{numero}")
    public BovinoDto trazUm(@PathVariable long numero){
        var elemento = gs.apenasUm(numero);
        if(elemento.isPresent()){
            return new BovinoDto(elemento.get());
        }else{
            return null;
        }
    }
    @PostMapping("/Bovinos")
    public ModelAndView grava(@RequestParam int btn_id_escondido, @RequestParam LocalDate form_datanas, @RequestParam int form_genero, @RequestParam String form_peso){


        Bovino bov = new Bovino();
            bov.setCod(btn_id_escondido);
            bov.setData_nasc(form_datanas);
            bov.setCod_gen(genServ.s_genero(form_genero));
            bov.setPeso(new BigDecimal(form_peso).setScale(3, RoundingMode.DOWN));
        gs.s_Cadastra(bov);
        return new ModelAndView("redirect:/index.html");
    }

    @GetMapping("/Dashboard")
    public DashBoardDto dash_dados(){
        return gs.seedDashBoard();
    }
}
