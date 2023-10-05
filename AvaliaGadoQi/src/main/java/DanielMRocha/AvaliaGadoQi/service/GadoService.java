package DanielMRocha.AvaliaGadoQi.service;

import DanielMRocha.AvaliaGadoQi.entity.Bovino;
import DanielMRocha.AvaliaGadoQi.repository.GadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GadoService {

    @Autowired
    GadoRepository gr;

    public List<Bovino> stodos(){
        List<Bovino> lista = new ArrayList<>();
        lista = gr.findAll();
        return lista;
    }
}
