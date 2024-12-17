package entites;

import java.util.Date;

public class Contratos {

    private Date data;
    private Double valorHora;
    private Integer horas;

    public Contratos(Date data, Double valorHora, Integer horas) {
        this.data = data;
        this.valorHora = valorHora;
        this.horas = horas;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double TotalContrato()
    {
        return valorHora*horas;
    }
}
