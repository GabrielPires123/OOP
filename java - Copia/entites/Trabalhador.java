package entites;
import entitiesEnums.Funcao;

import java.time.Month;
import java.time.Year;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalhador {

    private String nome;
    private Funcao nivel;
    private Double salario;

    private Departamento departamento;
    private List<Contratos> contratoslist = new ArrayList<>();

    public Trabalhador(String nome, Funcao nivel, Double salario, Departamento departamento) {
        this.nome = nome;
        this.nivel = nivel;
        this.salario = salario;
        this.departamento = departamento;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Funcao getNivel() {
        return nivel;
    }

    public void setNivel(Funcao nivel) {
        this.nivel = nivel;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<Contratos> getContratoslist() {
        return contratoslist;
    }

    public void addContrato(Contratos contratos)
    {
        contratoslist.add(contratos);
    }

    public void removerContrato(Contratos contratos)
    {
        contratoslist.remove(contratos);
    }

    public Double calculo(int ano, int mes) {
        double sum = salario;
        Calendar cal = Calendar.getInstance();

        for (Contratos c : contratoslist) {
            cal.setTime(c.getData());
            int contratoAno = cal.get(Calendar.YEAR);
            int contratoMes = cal.get(Calendar.MONTH) + 1; // Meses começam de 0 em Calendar

            if (contratoAno == ano && contratoMes == mes) {
                sum += c.TotalContrato();
            }
        }
        return sum;
    }





}
