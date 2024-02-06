import java.util.Scanner;

public class CalcularResoluciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seleccion1;
        boolean salirCase1 = true;
        boolean salirCase2 = true;
        int aprox;
        do {
            System.out.println("==================================================================================================");
            System.out.println("oooooooo    i   eeeeeeeee   n      n   v     v   eeeeeeeee   n      n   i   dddd          oooo");
            System.out.println("o       o   i   e           n n    n   v     v   e           n n    n   i   d    d      o      o");
            System.out.println("o       o   i   e           n  n   n    v   v    e           n  n   n   i   d      d   o        o");
            System.out.println("oooooooo    i   eeeeee      n   n  n    v   v    eeeeee      n   n  n   i   d      d   o        o");
            System.out.println("o       o   i   e           n    n n     v v     e           n    n n   i   d      d   o        o");
            System.out.println("o       o   i   e           n     nn     v v     e           n     nn   i   d    d      o      o");
            System.out.println("oooooooo    i   eeeeeeeee   n      n      v      eeeeeeeee   n      n   i   dddd          oooo");
            System.out.println("==================================================================================================");
            System.out.println();
            System.out.println();
            System.out.println("==================================================================================================");
            System.out.println("                       Pulse '1' para calcular un original de tono continuo");
            System.out.println("                           Pulse '2' para calcular un original de linea");
            System.out.println("                                       Pulse '3' para Salir");
            System.out.println("==================================================================================================");
            System.out.print("Escriba: ");
            seleccion1 = sc.nextInt();
            switch (seleccion1) {
                case 1:
                    int eleccion;
                    int lineatura = 0;
                    double factorCalidad = 0;
                    double resolucionDocumento = 0;
                    double resolucionEscaneado = 0;
                    double resolucionFilmacion = 0;
                    do {
                        System.out.println("===================================================");
                        System.out.println("Pulse '1' para calcular la resolucion del documento");
                        System.out.println("Pulse '2' para calcular la resolucion de escaneado");
                        System.out.println("Pulse '3' para calcular la resolucion de filmacion");
                        System.out.println("Pulse '4' para ver toda la informacion");
                        System.out.println("Pulse '5' para volver");
                        System.out.println("===================================================");
                        System.out.print("Escriba: ");
                        eleccion = sc.nextInt();
                        switch (eleccion) {
                            case 1:
                                System.out.println("========================================");
                                System.out.println("Cual es la lineatura de su papel?");
                                System.out.println("      Papel Prensa:               85 lpp");
                                System.out.println("      Papel Offset:              100 lpp");
                                System.out.println("      Papel Offset de calidad:   133 lpp");
                                System.out.println("      Papel Estucado:            150 lpp");
                                System.out.println("      Papel Estucado de calidad: 175 lpp");
                                System.out.println("      Papel Arte:                200 lpp");
                                System.out.println("========================================");
                                System.out.print("Escriba: ");
                                lineatura = sc.nextInt();
                                if (lineatura <= 133) {
                                    factorCalidad = 2;
                                    resolucionDocumento = factorCalidad * lineatura;
                                    System.out.println("==================================================");
                                    System.out.println("Su factor de calidad es " + factorCalidad);
                                    System.out.println();
                                    System.out.println("Lineatura " + "(" + lineatura + ")" + " * " + "Factor de calidad 'f(c)' " + "(" + factorCalidad + ")" + " = " + resolucionDocumento + " ppp");
                                    System.out.println("==================================================");
                                } else if (lineatura >= 133 && lineatura < 201) {
                                    factorCalidad = 1.5;
                                    resolucionDocumento = factorCalidad * lineatura;
                                    System.out.println("==================================================");
                                    System.out.println("Su factor de calidad es " + factorCalidad);
                                    System.out.println();
                                    System.out.println("Lineatura " + "(" + lineatura + ")" + " * " + "Factor de calidad 'f(c)' " + "(" + factorCalidad + ")" + " = " + resolucionDocumento + " ppp");
                                    System.out.println("==================================================");
                                } else {
                                    System.out.println("Escoja una lineatura correcta por favor.");
                                }
                                break;
                            case 2:
                                double anchoOriginal;
                                double altoOriginal;
                                double anchoReproduccion;
                                double altoReproduccion;
                                System.out.println("==========================================");
                                System.out.println("Introduzca el tamaño original de la imagen");
                                System.out.print("Ancho: ");
                                anchoOriginal = sc.nextInt();
                                System.out.println("==========================================");
                                System.out.print("Alto: ");
                                altoOriginal = sc.nextInt();
                                System.out.println("=================================================");
                                System.out.println("Introduzca el tamaño de reproduccion de la imagen");
                                System.out.print("Ancho: ");
                                anchoReproduccion = sc.nextInt();
                                System.out.println("=================================================");
                                System.out.print("Alto: ");
                                altoReproduccion = sc.nextInt();
                                double factorReproduccion2 = anchoReproduccion / anchoOriginal;
                                double factorReproduccion1 = altoReproduccion / altoOriginal;
                                double factorReproduccion;
                                if (factorReproduccion1 > factorReproduccion2) {
                                    factorReproduccion = factorReproduccion1;
                                } else {
                                    factorReproduccion = factorReproduccion2;
                                }
                                resolucionEscaneado = lineatura * factorReproduccion * factorCalidad;
                                System.out.println("=================================================");
                                System.out.println("Factor de reproduccion = " + factorReproduccion);
                                System.out.println("Resolucion de escaneado = lineatura (" + lineatura + ") * Factor de reproduccion 'f(r)' (" + factorReproduccion + ") * Factor de calidad 'f(c)' (" + factorCalidad + ") = " + resolucionEscaneado + " ppp");
                                System.out.println("=================================================");
                                break;
                            case 3:
                                resolucionFilmacion = 16 * lineatura;
                                aprox = aproximarFilmacion(resolucionFilmacion);
                                System.out.println("=================================================");
                                System.out.println("16 * " + lineatura + " = " + aprox + " ppp");
                                System.out.println("=================================================");
                                break;
                            case 4:
                                aprox = aproximarFilmacion(resolucionFilmacion);
                                System.out.println("=================================================");
                                System.out.println("Resolucion del documento = " + resolucionDocumento + " ppp");
                                System.out.println("Resolucion de escaneado = " + resolucionEscaneado + " ppp");
                                System.out.println("Resolucion de filmacion = " + aprox + " ppp");
                                System.out.println("=================================================");
                                break;
                            case 5:
                                salirCase1 = false;
                                break;
                            default:
                                System.out.println();
                                System.out.println("Escoja una opcion correcta");
                                System.out.println();
                                break;
                        }
                    } while (eleccion != 5);
                    break;
                case 2:
                    int eleccionLinea;
                    double resolucionLinea;
                    do {
                        System.out.println("==================================================");
                        System.out.println("Pulse '1' para calcular la resolucion de escaneado");
                        System.out.println("Pulse '2' volver");
                        System.out.println("==================================================");
                        System.out.print("Escriba: ");
                        eleccionLinea = sc.nextInt();
                        switch (eleccionLinea) {
                            case 1:
                                double anchoOriginal;
                                double altoOriginal;
                                double anchoReproduccion;
                                double altoReproduccion;
                                System.out.println("==========================================");
                                System.out.println("Introduzca el tamaño original de la imagen");
                                System.out.print("Ancho: ");
                                anchoOriginal = sc.nextInt();
                                System.out.println("==========================================");
                                System.out.print("Alto: ");
                                altoOriginal = sc.nextInt();
                                System.out.println("=================================================");
                                System.out.println("Introduzca el tamaño de reproduccion de la imagen");
                                System.out.print("Ancho: ");
                                anchoReproduccion = sc.nextInt();
                                System.out.println("=================================================");
                                System.out.print("Alto: ");
                                altoReproduccion = sc.nextInt();
                                double factorReproduccion2 = anchoReproduccion / anchoOriginal;
                                double factorReproduccion1 = altoReproduccion / altoOriginal;
                                double factorReproduccion;
                                if (factorReproduccion1 > factorReproduccion2) {
                                    factorReproduccion = factorReproduccion1;
                                } else {
                                    factorReproduccion = factorReproduccion2;
                                }
                                System.out.println("=================================================");
                                System.out.println("Factor de reproduccion = " + factorReproduccion);
                                double resolucionSalida;
                                System.out.println();
                                System.out.println("Cual es la resolucion de su dispositivo de salida?");
                                System.out.print("Escriba: ");
                                resolucionSalida = sc.nextInt();
                                System.out.println("=================================================");
                                resolucionLinea = resolucionSalida * factorReproduccion;
                                if (resolucionLinea >= 1200){
                                    resolucionLinea = 1200;
                                    System.out.println("=================================================");
                                    System.out.println("Resolucion de escaneado = " + resolucionSalida + " * " + factorReproduccion + " = " + resolucionLinea);
                                    System.out.println("=================================================");
                                }else{
                                    System.out.println("=================================================");
                                    System.out.println("Resolucion de escaneado = " + resolucionSalida + " * " + factorReproduccion + " = " + resolucionLinea);
                                    System.out.println("=================================================");
                                }
                                break;
                            case 2:
                                salirCase2 = false;
                                break;
                            default:
                                System.out.println();
                                System.out.println("Escoja una opcion correcta");
                                System.out.println();
                                break;
                        }
                    } while (eleccionLinea != 2);
                    break;
                case 3:
                    salirCase2 = false;
                    salirCase1 = false;
                    System.out.println("======");
                    System.out.println("Adios!");
                    System.out.println("======");
                    return;
                default:
                    System.out.println("!!!!!!!!!!!!!!!!!");
                    System.out.println("Opcion incorrecta");
                    System.out.println("!!!!!!!!!!!!!!!!!");
            }
        }while (!salirCase1 || !salirCase2);
    }
    public static int aproximarFilmacion(double resolucionFilmacion){
        if (resolucionFilmacion > 300 && resolucionFilmacion < 600){
            return 600;
        }else if (resolucionFilmacion > 600 && resolucionFilmacion < 1200) {
            return  1200;
        }else if (resolucionFilmacion > 1200 && resolucionFilmacion < 1800) {
            return 1800;
        }else if (resolucionFilmacion > 1800 && resolucionFilmacion < 2400) {
            return 2400;
        }else if (resolucionFilmacion > 2400 && resolucionFilmacion < 3600) {
            return 3600;
        }else if (resolucionFilmacion > 3600 && resolucionFilmacion < 4800) {
            return 4800;
        }else{
            return 300;
        }
    }
}
