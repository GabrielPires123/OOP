package Entities;

public class Trabalhador {

    private String nome;
    private Integer horas;
    private Double valorHoras;

    public Trabalhador(String nome, Integer horas, Double valorHoras) {
        this.nome = nome;
        this.horas = horas;
        this.valorHoras = valorHoras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public Double getValorHoras() {
        return valorHoras;
    }

    public void setValorHoras(Double valorHoras) {
        this.valorHoras = valorHoras;
    }

    public Double pagamento()
    {
        return horas * valorHoras;
    }

}
