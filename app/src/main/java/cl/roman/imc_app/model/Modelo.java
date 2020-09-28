package cl.roman.imc_app.model;

public class Modelo {
    public String nomnbre;
    public String apellido;
    public int edad;

    public Modelo(String nomnbre, String apellido) {
        this.nomnbre = nomnbre;
        this.apellido = apellido;
    }

    public String getNomnbre() {
        return nomnbre;
    }

    public void setNomnbre(String nomnbre) {
        this.nomnbre = nomnbre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
