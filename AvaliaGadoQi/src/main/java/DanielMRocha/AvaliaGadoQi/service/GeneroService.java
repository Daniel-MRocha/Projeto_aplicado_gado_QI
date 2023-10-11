package DanielMRocha.AvaliaGadoQi.service;

import DanielMRocha.AvaliaGadoQi.entity.Genero;
import DanielMRocha.AvaliaGadoQi.repository.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class GeneroService {

    @Autowired
    GeneroRepository genRep;

    public Genero s_genero(Integer i){
        var genero = genRep.findById(i);
        return genero.get();
    }
}
