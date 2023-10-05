package DanielMRocha.AvaliaGadoQi.repository;

import DanielMRocha.AvaliaGadoQi.entity.Bovino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface GadoRepository extends JpaRepository<Bovino,Long>{}
