package edu.unbosque.Workshop4;

public  class lista {

    String name = "";
    String comentario ="";

    public lista(String name, String comentario) {
        this.name = name;
        this.comentario = comentario;
    }

    public lista() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}