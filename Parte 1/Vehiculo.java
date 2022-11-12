import java.util.ArrayList;

public class Vehiculo {

    public static ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
    public static int idActual = 1;
    private int modelo;
    private ArrayList<Sensor> sensores = new ArrayList<>();
    private String marca;
    private double valorComercial;
    private String color;
    public static ArrayList<Sensor> sensoresMaM = new ArrayList<>();

    // Getters y setters
    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public ArrayList<Sensor> getSensores() {
        return sensores;
    }

    public void setSensores(ArrayList<Sensor> sensores) {
        Vehiculo.vehiculos.add(this);

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getValorComercial() {
        return valorComercial;
    }

    public void setValorComercial(double valorComercial) {
        this.valorComercial = valorComercial;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getId() {
        return idActual;
    }

    // Metodos

    public Vehiculo() {
        Vehiculo.vehiculos.add(this);
        idActual++;
    }

    public Vehiculo(int mo, String ma, double va) {
        this.modelo = mo;
        this.marca = ma;
        this.valorComercial = va;
        this.color = "verde";
        Vehiculo.vehiculos.add(this);
        idActual++;
    }

    public Vehiculo(int mo, String ma, double va, String co) {
        this.modelo = mo;
        this.marca = ma;
        this.valorComercial = va;
        this.color = co;
        Vehiculo.vehiculos.add(this);
        idActual++;
    }

    @Override
    public String toString() {
        return "{" +
                " modelo='" + getModelo() + "'" +
                ", marca='" + getMarca() + "'" +
                ", valorComercial='" + getValorComercial() + "'" +
                ", color='" + getColor() + "'" +
                ", sensores='" + getSensores() + "'" +
                "}";
    }

    public static String toStringVehiculos() {

        String re = "";

        for (Vehiculo vehiculo : vehiculos) {

            re = re + "\n" + vehiculo.toString();

        }

        return re;

    }

    public int cantidadVehiculos() {
        return Vehiculo.vehiculos.size();
    }

    public int cantidadSensores() {
        return this.sensores.size();
    }

    public void anadirSensores(Sensor s) {
        this.sensores.add(s);
    }

}