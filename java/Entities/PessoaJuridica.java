package Entities;

public class PessoaJuridica extends Contribuinte
{
    private Integer numFuncionario;

    public PessoaJuridica(Double rendaAnual, String nome,Integer numFuncionario) {
        super(rendaAnual, nome);
        this.numFuncionario = numFuncionario;
    }

    public Integer getNumFuncionario() {
        return numFuncionario;
    }

    public void setNumFuncionario(Integer numFuncionario) {
        this.numFuncionario = numFuncionario;
    }

    @Override
    public Double rendaTotal() {
        if (numFuncionario>10)
        {
            return getRendaAnual()*0.14;
        }
        else
        {
            return getRendaAnual()*0.16;
        }
    }
}
