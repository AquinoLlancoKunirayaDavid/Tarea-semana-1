package Sem1;

import java.util.Scanner;

public class Prac2 {
    public static void main(String[] args) {
    Scanner entrada=new Scanner(System.in);
    int x,y,z,res;
    System.out.println("Ingrese el primer numero;");
    x=entrada.nextInt();
    System.out.println("Ingrese el segundo numero;");
    y=entrada.nextInt();
    System.out.println("Ingrese el tercer numero;");
    z=entrada.nextInt();
    res=x*y*z;
    System.out.println("El resultado de la operacion es;"+res);
    }
    
}
