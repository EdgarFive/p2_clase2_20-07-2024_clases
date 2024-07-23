package umg.progra2;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


        //==========================================================================
        //EDGAR CHINCHILLA =========================================================
        //==========================================================================


        //==========================================================================
        //AREA DE DEFINICIONES =====================================================
        //==========================================================================

        Scanner sc = new Scanner(System.in);
        PKG_grupo1 gru1 = new PKG_grupo1();
        PKG_grupo2 gru2 = new PKG_grupo2();
        PKG_grupo3 gru3 = new PKG_grupo3();

        double radio;
        double eevariable;

        int eemenu1;

        //==========================================================================
        //==========================================================================
        //==========================================================================

        for(int ii = 0; ii != -1; ){
            System.out.print("Tarea en clase\nElige una opción:\n1. Grupo Uno.\n2. Grupo Dos.\n3. Grupo Tres.\n-1. Salir.");
            eemenu1 = sc.nextInt();
            switch(eemenu1) {

                case 1:
                    for (int jj = 0; jj != -1;){
                        System.out.print("Bienvenido al grupo Dos.\nElige una opción:\n1. Aarea de un circulo.\n2. Circunferencia de un circulo.\n3. Volumen de un cubo.\n-1. Atras.");
                        eemenu1 = sc.nextInt();
                        switch(eemenu1) {
                            case 1:
                                System.out.print("\nIngrese el radio de la circunferencia:");
                                radio = sc.nextDouble();
                                eevariable = gru1.unouno(radio);
                                System.out.print("\nEl area de la ocircunferencia es:" +eevariable);
                                break;

                            case 2:
                                System.out.print("\nIngrese el radio de la circunferencia:");
                                radio = sc.nextDouble();
                                eevariable= gru1.unodos(radio);
                                System.out.print("La circunferencia del circulo es: " +eevariable);
                                break;

                            case 3:
                                double eelongitud;
                                System.out.print("Ingrese la longitud de los lados del cubo:");
                                eelongitud = sc.nextDouble();
                                eevariable = gru1.unodos(eelongitud);
                                System.out.print("El volumen del cubo es: " +eevariable);
                                break;

                            case -1:
                                jj = -1;
                                break;

                            default:
                                System.out.print("El valor ingresado no es valido.");
                                break;
                        }
                    }
                    break;

                case 2:
                    for (int jj = 0; jj != -1;){
                        System.out.print("Binevenidos al grupo Dos.\nElige una opoción:\n1. Area de una piramide cuadrada.\n2. Volumen de una piramide cuadrada.\n3. Area de un triangulo.\n-1. Atras.");
                        eemenu1 = sc.nextInt();
                        switch(eemenu1) {
                            case 1:
                                System.out.print("Ingrese la longitud de la base de la piramide:");
                                double eebase = sc.nextDouble();
                                System.out.print("Ingrese la altura de la piramide");
                                double eealtura = sc.nextDouble();
                                eevariable = gru2.dosuno(eebase, eealtura);
                                System.out.print("El Area de la piramide es: " +eevariable);
                                break;

                            case 2:
                                System.out.print("Ingrese la longitud de la base de la piramide:");
                                eebase = sc.nextDouble();
                                System.out.print("Ingrese la altura de la piramide");
                                eealtura = sc.nextDouble();
                                eevariable = gru2.dosdos(eebase, eealtura);
                                System.out.print("El volumen de la piramide es: " +eevariable);
                                break;

                            case 3:
                                System.out.print("Ingrese la longitud de la base del triangulo:");
                                eebase = sc.nextDouble();
                                System.out.print("Ingrese la altura del triangulo:");
                                eealtura = sc.nextDouble();
                                eevariable = gru2.dosuno(eebase, eealtura);
                                System.out.print("El area del triangulo es: " +eevariable);
                                break;

                            case -1:
                                jj = -1;
                                break;

                            default:
                                System.out.print("El valor ingresado no es valido.");
                                break;
                        }
                    }
                    break;

                case 3:
                    for (int jj = 0; jj != -1;){
                        System.out.print("Binevenidos al grupo Tres.\nElige una opoción:\n1. Volumen de un prisma rectangular.\n2. Area de un paralelogramo.\n3. Volumen de un cilindro.\n-1. Atras.");
                        eemenu1 = sc.nextInt();
                        switch(eemenu1) {
                            case 1:
                                System.out.print("Ingrese el area de la base del prisma:");
                                double eebase = sc.nextDouble();
                                System.out.print("Ingrese la altura del prisma");
                                double eealtura = sc.nextDouble();
                                eevariable = gru3.tresuno(eebase, eealtura);
                                System.out.print("El volumen del prisma es: " +eevariable);
                                break;

                            case 2:
                                System.out.print("Ingrese la longitud de la base del paralelogramo:");
                                eebase = sc.nextDouble();
                                System.out.print("Ingrese la altura del paralelogramo");
                                eealtura = sc.nextDouble();
                                eevariable = gru3.tresuno(eebase, eealtura);
                                System.out.print("El area del paralelogramo es: " +eevariable);
                                break;

                            case 3:
                                System.out.print("Ingrese el radio de la base del cilindro:");
                                double eeradio = sc.nextDouble();
                                System.out.print("Ingrese la altura del cilindro");
                                eealtura = sc.nextDouble();
                                eevariable = gru3.trestres(eeradio, eealtura);
                                System.out.print("El volumen del cilindro es: " +eevariable);
                                break;

                            case -1:
                                jj =-1;
                                break;

                            default:
                                System.out.print("El valor ingresado no es valido.");
                                break;
                        }
                    }
                    break;

                case -1:
                    ii = -1;
                    break;

                default:
                    System.out.print("El valor ingresado no es valido.");
                    break;
            }
        }
    }
}


//==========================================================================
//==========================================================================
//==========================================================================