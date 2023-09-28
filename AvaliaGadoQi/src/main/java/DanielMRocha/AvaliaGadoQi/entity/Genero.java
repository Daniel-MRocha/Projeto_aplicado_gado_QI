package DanielMRocha.AvaliaGadoQi.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "TB_GENERO")
    public class Genero implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "COD",unique = true)
    private int cod;

    @Column(name = "GENERO",length = 5)
    private String genero;

    @OneToMany
    @JoinColumn(name = "COD_GEN")
    private List<Bovino> bovinos;

    public int getCod() {
        return cod;
    }
    public void setCod(int cod) {
        this.cod = cod;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
}
