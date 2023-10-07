package DanielMRocha.AvaliaGadoQi.service;

import DanielMRocha.AvaliaGadoQi.dtos.BovinoDto;
import DanielMRocha.AvaliaGadoQi.dtos.DashBoardDto;
import DanielMRocha.AvaliaGadoQi.entity.Bovino;
import DanielMRocha.AvaliaGadoQi.repository.GadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

import static java.math.RoundingMode.DOWN;

@Service
public class GadoService {

    @Autowired
    GadoRepository gr;

    public List<Bovino> stodos(){
        List<Bovino> lista = new ArrayList<>();
        lista = gr.findAll();
        return lista;
    }

    public DashBoardDto seedDashBoard(){

        DashBoardDto dash = new DashBoardDto();
        List<BovinoDto> lista_processar = gr.findAll().stream()
                                                        .map(BovinoDto::new)
                                                        .toList();
        dash.setTotalRebanho(lista_processar.size());

        dash.setTotalMachos((int) lista_processar.stream()
                .filter(e-> e.getGenero() == 1 )
                .count());

        dash.setTotalFemeas((int) lista_processar.stream()
                .filter(e->e.getGenero() == 2)
                .count());


        //Dados de Machos de 0 a 12
        dash.setTotalMachos0a12((int) lista_processar.stream()
                .filter(e-> e.getGenero() == 1 )
                .filter(e-> e.getMeses()<=12)
                .count());


        dash.setTotalMachos0a12Peso(lista_processar.stream()
                .filter(e -> e.getGenero()==1)
                .filter(e -> e.getMeses()<=12)
                .map(e -> e.getPeso())
                .reduce(BigDecimal.ZERO,BigDecimal::add)
        );

        dash.setTotalMachos0a12Preco(lista_processar.stream()
                .filter(e -> e.getGenero()==1)
                .filter(e -> e.getMeses()<=12)
                .map(e -> e.getPreco())
                .reduce(BigDecimal.ZERO,BigDecimal::add)
        );



        //Dados de Machos com mais de 12
        dash.setTotalMachos12Mais((int) lista_processar.stream()
                .filter(e-> e.getGenero() == 1 )
                .filter(e-> e.getMeses()>12)
                .count());

        dash.setTotalMachos12MaisPeso(lista_processar.stream()
                .filter(e -> e.getGenero()==1)
                .filter(e -> e.getMeses()>12)
                .map(e -> e.getPeso())
                .reduce(BigDecimal.ZERO,BigDecimal::add)
        );

        dash.setTotalMachos12MaisPreco(lista_processar.stream()
                .filter(e -> e.getGenero()==1)
                .filter(e -> e.getMeses()>12)
                .map(e -> e.getPreco())
                .reduce(BigDecimal.ZERO,BigDecimal::add)
        );

        //Dados de Fêmeas de 0 a 12
        dash.setTotalFemeas0a12((int) lista_processar.stream()
                .filter(e-> e.getGenero() == 2 )
                .filter(e-> e.getMeses()<=12)
                .count());


        dash.setTotalFemeas0a12Peso(lista_processar.stream()
                .filter(e -> e.getGenero()==2)
                .filter(e -> e.getMeses()<=12)
                .map(e -> e.getPeso())
                .reduce(BigDecimal.ZERO,BigDecimal::add)
        );

        dash.setTotalFemeas0a12Preco(lista_processar.stream()
                .filter(e -> e.getGenero()==2)
                .filter(e -> e.getMeses()<=12)
                .map(e -> e.getPreco())
                .reduce(BigDecimal.ZERO,BigDecimal::add)
        );


        //Dados de Fêmeas com mais de 12
        dash.setTotalFemeas12Mais((int) lista_processar.stream()
                .filter(e-> e.getGenero() == 2 )
                .filter(e-> e.getMeses()>12)
                .count());

        dash.setTotalFemeas12MaisPeso(lista_processar.stream()
                .filter(e -> e.getGenero()==2)
                .filter(e -> e.getMeses()>12)
                .map(e -> e.getPeso())
                .reduce(BigDecimal.ZERO,BigDecimal::add)
        );

        dash.setTotalFemeas12MaisPreco(lista_processar.stream()
                .filter(e -> e.getGenero()==2)
                .filter(e -> e.getMeses()>12)
                .map(e -> e.getPreco())
                .reduce(BigDecimal.ZERO,BigDecimal::add)
        );

        dash.setTotalRebanhoPreco(lista_processar.stream()
                .map(e -> e.getPreco())
                .reduce(BigDecimal.ZERO,BigDecimal::add)
        );


        return dash;
    }
}
