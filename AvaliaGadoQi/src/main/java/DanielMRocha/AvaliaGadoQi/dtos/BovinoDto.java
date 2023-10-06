package DanielMRocha.AvaliaGadoQi.dtos;

import DanielMRocha.AvaliaGadoQi.entity.Bovino;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class BovinoDto {

    public static BigDecimal cotBoi = new BigDecimal("7.05").setScale(2, RoundingMode.HALF_DOWN);
    public static BigDecimal cotVac = new BigDecimal("6.1").setScale(2,RoundingMode.HALF_DOWN);
    public static BigDecimal cotBezMach = new BigDecimal("7.9").setScale(2,RoundingMode.HALF_DOWN);
    public static BigDecimal cotBezFem = new BigDecimal("7.6").setScale(2,RoundingMode.HALF_DOWN);

    private long id;
    private long meses;
    private BigDecimal peso;
    private int genero;
    private BigDecimal preco;


    public BovinoDto(Bovino bov){
        id = bov.getCod();
        meses = ChronoUnit.MONTHS.between(bov.getData_nasc(),LocalDate.now());
        genero = bov.getCod_gen().getCod();
        peso = bov.getPeso();
            if(genero == 1){
              if(meses<12){
                  preco = peso.multiply(cotBezMach).setScale(2,RoundingMode.DOWN);
              }else{
                  preco = peso.multiply(cotBoi).setScale(2,RoundingMode.DOWN);
              }
            }else{
                if(meses<12){
                    preco = peso.multiply(cotBezFem).setScale(2,RoundingMode.DOWN);
                }else{
                    preco = peso.multiply(cotVac).setScale(2,RoundingMode.DOWN);
                }
            }
    }


    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getMeses() {
        return meses;
    }
    public void setMeses(long meses) {
        this.meses = meses;
    }
    public BigDecimal getPeso() {
        return peso;
    }
    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }
    public int getGenero() {
        return genero;
    }
    public void setGenero(int genero) {
        this.genero = genero;
    }
    public BigDecimal getPreco() {
        return preco;
    }
}
