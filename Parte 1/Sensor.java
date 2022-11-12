public class Sensor implements Comparable<Sensor> {

    private String tipo;
    private double valor;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Sensor() {

    }

    public Sensor(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "{" +
                " tipo='" + getTipo() + "'" +
                ", valor='" + getValor() + "'" +
                "}";
    }

    @Override
    public int compareTo(Sensor o) {
        // TODO Auto-generated method stub
        int compare = Integer.compare((int) valor, (int) o.valor);
        return compare;
    }

}