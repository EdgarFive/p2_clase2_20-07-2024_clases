package umg.progra2;

public class PKG_grupo1 {

    public double unouno(double radio){
       double area;
       double pi;
       pi = 3.1416;

       area = pi*Math.pow(radio,2);
       return area;
    }


    public double unodos(double radio){
        double circun;
        double pi = 3.1416;

        circun = 2*pi*radio;

        return circun;
    }

    public  double unotres(double eelongitud){
        double eevolumen;

        eevolumen = Math.pow(eelongitud,3);
        return eevolumen;
    }




}
