package entites;

import java.util.Date;

public class Client {
    private String name;
    private String emial;
    private Date aniversario;

    public Client(String name, String emial, Date aniversario) {
        this.name = name;
        this.emial = emial;
        this.aniversario = aniversario;
    }

    public String getNome() {
        return name;
    }

    public void setNome(String name) {
        this.name = name;
    }

    public String getEmial() {
        return emial;
    }

    public void setEmial(String emial) {
        this.emial = emial;
    }

    public Date getAniversario() {
        return aniversario;
    }

    public void setAniversario(Date aniversario) {
        this.aniversario = aniversario;
    }
}
