package Entities;

public class PessoaFisica extends Contribuinte
{

    private Double gastoSaude;

    public PessoaFisica(Double rendaAnual, String nome, Double gastoSaude) {
        super(rendaAnual, nome);
        this.gastoSaude = gastoSaude;
    }

    public Double getGastoSaude() {
        return gastoSaude;
    }

    public void setGastoSaude(Double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }


    @Override
    public Double rendaTotal() {
        double imposto;

        if (getRendaAnual() < 20000.00) {
            // Aplica taxa de 15%
            imposto = getRendaAnual() * 0.15;
        } else {
            // Aplica taxa de 25%
            imposto = getRendaAnual() * 0.25;
        }

        // Abatimento de 50% dos gastos com saúde
        if (gastoSaude > 0) {
            imposto -= gastoSaude * 0.5;
        }

        // Garantir que o imposto não seja negativo
        return Math.max(imposto, 0.0);
    }


}
