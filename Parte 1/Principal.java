import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Opciones();
        mostrarMenu();

    }

    public static void Opciones() {
        System.out.println("Ingrese 0 para cerrar el programa");
        System.out.println("Ingrese 1 para crear un vehiculo");
        System.out.println("Ingrese 2 para ver la información de todos los vehiculos guardados");
        System.out.println("Ingrese 3 para ver la cantidad de vehiculos guardados");
        System.out.println("Ingrese 4 para ver la información de todos los vehiculos verdes");
        System.out.println("Ingrese 5 para ver la información de un carro segun el id que quiera");
        System.out.println("Ingrese 6 para agregrle sensor a un vehiculo al id que quiera");
        System.out.println("Ingrese 7 para ver la informacion de los sesnores segun un id de vehiculo");
        System.out.println("Ingrese 8 para ver la informacion de todos los sensores de tipo de temperatura");
        System.out.println("Ingrese 9 para ver la informacion del vehiculo que tiene mas sensores");
        System.out.println("Ingrese 10 para crear 5 vehiculos");
        System.out.println(
                "Ingrese 666 para para ver los sensores de tipo temperatura ordenades por valor, de menor a mayor");
    }

    public static void mostrarMenu() {

        boolean a = true;
        int modelo;
        String marca;
        double valorComercial;
        String color = "verde";
        String tipo;
        double valor;
        ArrayList<Sensor> sensoresMaM = new ArrayList<>();

        while (a) {
            Scanner sc = new Scanner(System.in);
            int d = sc.nextInt();

            if (d == 0) {
                System.out.println("Cerraste el programa,hasta luego!");
                a = false;
            }

            else if (d == 1) {
                System.out.println("Ingrese el modelo del vehiculo: ");
                modelo = sc.nextInt();
                System.out.println("Ingrese la marca del vehiculo: ");
                marca = sc.next();
                System.out.println("Ingrese el valor comercial del carro: ");
                valorComercial = sc.nextDouble();
                System.out.println("Ingrese el color del carro: ");
                color = sc.next();

                Vehiculo vehi = new Vehiculo(modelo, marca, valorComercial, color);

            }

            else if (d == 2) {
                // for (Vehiculo veh : Vehiculo.vehiculos) {
                System.out.println(Vehiculo.toStringVehiculos());
                // }

            }

            else if (d == 3) {
                System.out.println(Vehiculo.vehiculos.size());

            }

            else if (d == 4) {
                for (Vehiculo veh : Vehiculo.vehiculos) {
                    if (veh.getColor().equalsIgnoreCase("verde")) {
                        System.out.println(veh.toString());
                    }
                }
            }

            else if (d == 5) {
                System.out.println("Ingrese un id de vehiculo: ");
                int p = sc.nextInt();
                if (p > Vehiculo.vehiculos.size()) {
                    System.out.println("No hay un vehiculo con ese id");
                } else {
                    System.out.println(Vehiculo.vehiculos.get(p - 1).toString());
                }
            }

            else if (d == 6) {
                System.out.println("Ingrese un id de vehiculo: ");
                int p = sc.nextInt();
                if (p > Vehiculo.vehiculos.size()) {
                    System.out.println("No hay un vehiculo con ese id");
                } else {
                    System.out.println("Ingrese un tipo de sensor: ");
                    tipo = sc.next();
                    System.out.println("Ingrese el valor comercial del sensor: ");
                    valor = sc.nextDouble();
                    Sensor sens = new Sensor(tipo, valor);
                    Vehiculo.vehiculos.get(p - 1).anadirSensores(sens);
                }
            }

            else if (d == 7) {
                System.out.println("Ingrese un id de vehiculo: ");
                int p = sc.nextInt();
                if (p > Vehiculo.vehiculos.size()) {
                    System.out.println("No hay un vehiculo con ese id");
                } else {
                    System.out.println(Vehiculo.vehiculos.get(p - 1).getSensores());
                }
            }

            else if (d == 8) {
                for (Vehiculo vehi : Vehiculo.vehiculos) {
                    for (Sensor sensor : vehi.getSensores()) {
                        if (sensor.getTipo().equalsIgnoreCase("temperatura")) {
                            System.out.println(sensor.toString());
                        }

                    }

                }
            }

            else if (d == 9) {
                Vehiculo temp = new Vehiculo();

                for (Vehiculo vehi : Vehiculo.vehiculos) {
                    if (vehi.cantidadSensores() > temp.cantidadSensores()) {
                        temp = vehi;
                    }
                }
                System.out.println(temp.toString());

            }

            else if (d == 10) {
                File f = new File("Vehiculos.txt");
                try {
                    Scanner sr = new Scanner(f);
                    int mod;
                    String marc;
                    double vc;
                    String col;

                    while (sr.hasNext()) {
                        for (int i = 0; i < 5; i++) {
                            mod = sr.nextInt();
                            marc = sr.next();
                            vc = sr.nextDouble();
                            col = sr.next();
                            Vehiculo v = new Vehiculo(mod, marc, vc, col);
                        }
                    }

                } catch (FileNotFoundException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                System.out.println("Agregaste 5 vehiculos...");
            }

            else if (d == 666) {
                for (Vehiculo veh : Vehiculo.vehiculos) {
                    for (Sensor sens : veh.getSensores()) {
                        if (sens.getTipo().equalsIgnoreCase("temperatura")) {
                            Sensor o = new Sensor(sens.getTipo(), sens.getValor());
                            sensoresMaM.add(o);
                        }
                    }
                    Collections.sort(sensoresMaM);

                }
                System.out.println(sensoresMaM.toString());

            }
        }

    }

}
