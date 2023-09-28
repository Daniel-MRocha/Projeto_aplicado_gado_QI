package DanielMRocha.AvaliaGadoQi.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Bovino {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD",unique = true,nullable = false)
    private long cod;

    @Column(name = "PESO")
    private BigDecimal peso;

    @Column(name = "DATA_NASC")
    private LocalDate  data_nasc;

    @ManyToOne
    @JoinColumn(name = "COD_GEN")
    private Genero cod_gen;

}
