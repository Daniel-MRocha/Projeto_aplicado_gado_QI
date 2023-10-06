package DanielMRocha.AvaliaGadoQi.dtos;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;

public class DashBoardDto {


    private int totalRebanho;
    private int totalMachos;
    private int totalFemeas;




    private int totalMachos0a12;
    private BigDecimal totalMachos0a12Peso;
    private BigDecimal totalMachos0a12Preco;

    private int totalMachos12Mais;
    private int totalMachos12MaisPeso;
    private int totalMachos12MaisPreco;


    private int totalFemeas0a12;
    private int totalFemeas0a12Peso;
    private int totalFemeas0a12Preco;

    private int totalFemeas12Mais;
    private int totalFemeas12MaisPeso;
    private int totalFemeas12MaisPreco;


    public int getTotalRebanho() {
        return totalRebanho;
    }
    public void setTotalRebanho(int totalRebanho) {
        this.totalRebanho = totalRebanho;
    }
    public int getTotalMachos() {
        return totalMachos;
    }
    public void setTotalMachos(int totalMachos) {
        this.totalMachos = totalMachos;
    }
    public int getTotalFemeas() {
        return totalFemeas;
    }
    public void setTotalFemeas(int totalFemeas) {
        this.totalFemeas = totalFemeas;
    }

    public int getTotalMachos0a12() {
        return totalMachos0a12;
    }
    public void setTotalMachos0a12(int totalMachos0a12) {
        this.totalMachos0a12 = totalMachos0a12;
    }

    public BigDecimal getTotalMachos0a12Peso() {
        return totalMachos0a12Peso;
    }
    public void setTotalMachos0a12Peso(BigDecimal totalMachos0a12Peso) {
        this.totalMachos0a12Peso = totalMachos0a12Peso;
    }

    public int getTotalMachos12Mais() {
        return totalMachos12Mais;
    }
    public void setTotalMachos12Mais(int totalMachos12Mais) {
        this.totalMachos12Mais = totalMachos12Mais;
    }

    public BigDecimal getTotalMachos0a12Preco() {
        return totalMachos0a12Preco.setScale( 2, RoundingMode.DOWN);
    }
    public void setTotalMachos0a12Preco(BigDecimal totalMachos0a12Preco) {
        this.totalMachos0a12Preco = totalMachos0a12Preco;
    }
}
