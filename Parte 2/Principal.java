import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        System.out.println("Ingrese 0 para cerrar el juego");
        System.out.println("Ingrese 1 para disparar una bala");
        System.out.println("Ingrese 2 para activar la bomba atómica");
        System.out.println("Ingrese 3 para activar el bicho mutante");
        System.out.println("Ingrese 4 para leer la frase de la abuela");

        mostrarMenu();

    }

    public static double getRandomIntegerBetweenRange(double min, double max) {
        double x = (int) (Math.random() * ((max - min) + 1)) + min;
        return x;
    }

    public static void mostrarMenu() {
        boolean a = true;
        Bicho[][] juego = new Bicho[2][2];

        for (int i = 0; i < 2; i++) {
            for (int k = 0; k < 2; k++) {
                juego[i][k] = new Bicho("", -10);
            }
        }
        double c = getRandomIntegerBetweenRange(1, 4);
        System.out.println(c); ///////////////////////////////////////// Quitar esta línea
        if (c == 1.0) {
            double p = getRandomIntegerBetweenRange(1, 2);
            if (p == 1.0) {
                juego[0][0] = new Bicho("BN", 10);
            } else if (p == 2.0) {
                juego[0][0] = new Bicho("BA", 20);
            }

        } else if (c == 2.0) {
            double p = getRandomIntegerBetweenRange(1, 2);
            if (p == 1.0) {
                juego[0][0] = new Bicho("BN", 10);
            } else if (p == 2.0) {
                juego[0][0] = new Bicho("BA", 20);
            }
            double s = getRandomIntegerBetweenRange(1, 2);
            if (s == 1.0) {
                juego[0][1] = new Bicho("BN", 10);
            } else if (s == 2.0) {
                juego[0][1] = new Bicho("BA", 20);
            }
        } else if (c == 3.0) {
            double p = getRandomIntegerBetweenRange(1, 2);
            if (p == 1.0) {
                juego[0][0] = new Bicho("BN", 10);
            } else if (p == 2.0) {
                juego[0][0] = new Bicho("BA", 20);
            }
            double s = getRandomIntegerBetweenRange(1, 2);
            if (s == 1.0) {
                juego[0][1] = new Bicho("BN", 10);
            } else if (s == 2.0) {
                juego[0][1] = new Bicho("BA", 20);
            }
            double t = getRandomIntegerBetweenRange(1, 2);
            if (t == 1.0) {
                juego[1][0] = new Bicho("BN", 10);
            } else if (t == 2.0) {
                juego[1][0] = new Bicho("BA", 20);
            }
        } else if (c == 4.0) {
            double p = getRandomIntegerBetweenRange(1, 2);
            if (p == 1.0) {
                juego[0][0] = new Bicho("BN", 10);
            } else if (p == 2.0) {
                juego[0][0] = new Bicho("BA", 20);
            }
            double s = getRandomIntegerBetweenRange(1, 2);
            if (s == 1.0) {
                juego[0][1] = new Bicho("BN", 10);
            } else if (s == 2.0) {
                juego[0][1] = new Bicho("BA", 20);
            }
            double t = getRandomIntegerBetweenRange(1, 2);
            if (t == 1.0) {
                juego[1][0] = new Bicho("BN", 10);
            } else if (t == 2.0) {
                juego[1][0] = new Bicho("BA", 20);
            }
            double q = getRandomIntegerBetweenRange(1, 2);
            if (q == 1.0) {
                juego[1][1] = new Bicho("BN", 10);
            } else if (q == 2.0) {
                juego[1][1] = new Bicho("BA", 20);
            }
        }

        System.out.print("-------------\n");
        for (int i = 0; i < 2; i++) {
            for (int k = 0; k < 1; k++) {

                System.out.print("|" + juego[i][k].toString() + "|" + juego[i][k + 1].toString() + "|\n");
            }
            System.out.println("-------------\n");

        }

        // System.out.println("-------------\n");
        // if (c == 1.0) {
        // System.out.print("|" + juego[0][0].toString() +
        // "| |\n-------------\n| | |\n-------------");
        // } else if (c == 2.0) {
        // System.out.println("|" + juego[0][0].toString() + "|" +
        // juego[0][1].toString()
        // + "|\n-------------\n| | |\n-------------");
        // } else if (c == 3.0) {
        // System.out.println("|" + juego[0][0].toString() + "|" +
        // juego[0][1].toString() + "|\n-------------\n|"
        // + juego[1][0].toString() + "| |\n-------------");
        // } else if (c == 4.0) {
        // System.out.println("|" + juego[0][0].toString() + "|" +
        // juego[0][1].toString() + "|\n-------------\n|"
        // + juego[1][0] + "|" + juego[1][1].toString() + "|\n-------------");
        // }

        while (a) {

            Scanner sc = new Scanner(System.in);
            int d = sc.nextInt();

            if (d == 0) {
                System.out.println("Cerraste el juego...");
                a = false;
            } else if (d == 1) {
                System.out.println("Donde quieres disparar la bala?");
                int i = sc.nextInt();
                int j = sc.nextInt();
                juego[i][j].setSalud(juego[i][j].salud - 5);
                // if (juego[i][j].salud <= 0) {
                // juego[i][j] = new Bicho("");
                // }
                System.out.print("-------------\n");
                for (int l = 0; l < 2; l++) {
                    for (int k = 0; k < 1; k++) {

                        System.out.print("|" + juego[l][k].toString() + "|" + juego[l][k + 1].toString() + "|\n");
                    }
                    System.out.println("-------------\n");

                }
            } else if (d == 2) {
                System.out.println("Donde quieres activar la bomba atómica?");
                int i = sc.nextInt();
                int j = sc.nextInt();
                juego[i][j].setSalud(0);
                for (int l = 0; l < 2; l++) {
                    for (int k = 0; k < 1; k++) {
                        System.out.print("|" + juego[l][k].toString() + "|" + juego[l][k + 1].toString() + "|\n");
                    }
                    System.out.println("-------------\n");
                }
            } else if (d == 3) {
                int max = 0;
                int ri = 0;
                int rj = 0;
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        if (juego[i][j].salud > max) {
                            max = juego[i][j].salud;
                        }
                    }
                }
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        if (juego[i][j].salud < max && juego[i][j].salud > 0) {
                            ri = i;
                            rj = j;
                        }
                    }
                }
                System.out.println("Activaste el bicho mutante en la posicion " + ri + "." + rj);
                juego[ri][rj].setSalud(juego[ri][rj].salud * 2);
                for (int l = 0; l < 2; l++) {
                    for (int k = 0; k < 1; k++) {
                        System.out.print("|" + juego[l][k].toString() + "|" + juego[l][k + 1].toString() + "|\n");
                    }
                    System.out.println("-------------\n");
                }
            } else if (d == 4) {
                System.out.println(
                        "La abuela solía decir que el truco para ganar a este juego es de eliminar el bicho con más vida en primero!");
            }

            int vivos = 0;

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    if (juego[i][j].salud > vivos) {
                        vivos = juego[i][j].salud;
                    }
                }
            }

            if (vivos == 0) {
                System.out.println("Felicitiaciones, eliminaste todos los bichos y ganaste!");
                a = false;
            }

        }
    }

}
