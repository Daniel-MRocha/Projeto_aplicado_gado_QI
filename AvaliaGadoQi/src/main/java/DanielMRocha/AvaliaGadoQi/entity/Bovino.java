package DanielMRocha.AvaliaGadoQi.entity;

import jakarta.persistence.*;
import org.springframework.format.annotation.NumberFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "TB_BOVINO")
public class Bovino implements Serializable {
    public static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD",unique = true,nullable = false)
    private long cod;

    @Column(name = "PESO",nullable = true,columnDefinition = "decimal(7,3)")
    private BigDecimal peso;

    @Column(name = "DATA_NASC")
    private LocalDate  data_nasc;

    @ManyToOne
    @JoinColumn(name = "COD_GEN")
    private Genero cod_gen;

    public long getCod() {
        return cod;
    }

    public void setCod(long cod) {
        this.cod = cod;
    }

    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    public LocalDate getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(LocalDate data_nasc) {
        this.data_nasc = data_nasc;
    }

    public Genero getCod_gen() {
        return cod_gen;
    }

    public void setCod_gen(Genero cod_gen) {
        this.cod_gen = cod_gen;
    }
}
