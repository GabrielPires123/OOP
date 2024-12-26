package Entities;

public class Terceirizado extends Trabalhador
{
    private Integer horaADD;


    public Terceirizado(String nome, Integer horas, Double valorHoras,Integer horaADD) {
        super(nome, horas, valorHoras);
        this.horaADD = horaADD;
    }

    public Integer getHoraADD() {
        return horaADD;
    }

    public void setHoraADD(Integer horaADD) {
        this.horaADD = horaADD;
    }

    @Override
    public final Double pagamento()
    {
        return super.pagamento()+ horaADD * 1.1;
    }



}
