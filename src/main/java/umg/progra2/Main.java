package umg.progra2;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Scanner sc = new Scanner(System.in);
        PKG_grupo1 gru1 = new PKG_grupo1();
        PKG_grupo2 gru2 = new PKG_grupo2();
        PKG_grupo3 gru3 = new PKG_grupo3();


        double radio;
        double area;

        System.out.print("\nIngrese el radio de la circunferencia:");
        radio = sc.nextDouble();
        area = gru1.unouno(radio);

        System.out.print("\nEl area de la ocircunferencia es:" +area);

        gru2.unodos();

        gru3.unotres();














    }
}