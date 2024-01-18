package Sem1;

import java.util.Scanner;

public class Prac3 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        double MonT,IGV,MonF;
        System.out.println("Ingrese el monto total: ");
        MonT=entrada.nextDouble();
        IGV=MonT*0.18;
        MonF=MonT*0.82;
        System.out.println("Su sueldo final es del:"+MonF);
        System.out.println("Con un descuento del IGV del:"+IGV);
    }  
}
