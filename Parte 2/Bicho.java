import java.util.ArrayList;

public class Bicho {
    public static ArrayList<Bicho> bichos = new ArrayList<>();
    public String tipo;
    public int salud;

    // Getters y Setters

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    // Metodos

    public Bicho(String ti, int sal) {
        tipo = ti;
        salud = sal;
    }

    public Bicho(String a) {
        tipo = a;
    }

    @Override
    public String toString() {
        if (salud > 0) {
            return getTipo() + "-" + getSalud();
        } else {
            return "     ";
        }
    }

}
