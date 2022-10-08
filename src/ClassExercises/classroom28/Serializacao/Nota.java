package Serializacao;

import java.io.Serializable;

public class Nota implements Serializable {
    private String user;
    private String titulo;
    private String nota;



    public Nota(String user, String titulo, String nota) {
        this.user = user;
        this.titulo = titulo;
        this.nota = nota;


    }
    @Override
    public String toString() {
        return "nota{" +
                "user='" + user + '\'' +
                ", titulo='" + titulo + '\'' +
                ", nota='" + nota + '\'' +
                '}';
    }
}
