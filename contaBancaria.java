package entities;

public class contaBancaria {
    private int numeroConta;
    private String titular;
    private double saldo;

    public contaBancaria(int numeroConta,String titular,double saldo)
    {
        this.numeroConta=numeroConta;
        this.titular=titular;
        this.saldo=saldo;
    }

    public int getNumeroConta()
    {
        return numeroConta;
    }

    public String getTitular()
    {
        return titular;
    }
    public double getSaldo()
    {
        return saldo;
    }
    public double depositar(double valor)
    {
        System.out.println("Valor depositado: "+(saldo +=valor));
        return saldo+=valor;
    }
    public double sacar(double valor)
    {
        if(valor>saldo)
        {
            System.out.println("Valor indisponível em conta");
        }
        else
        {
            System.out.println("Valor sacado: " +valor+
                    "Saldo em conta: "+(saldo -=valor));
            saldo-=valor;
        }

        return saldo;
    }

}
