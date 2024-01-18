package Sem1;

import java.util.Scanner;

public class Prac1 {
    public static void main(String[] args) {  
    Scanner entrada=new Scanner(System.in);
    int base,altura;
    double area;
    System.out.println("Ingrese la base del triangulo:");
    base = entrada.nextInt();
    System.out.println("Ingrese la altura del triangulo:");
    altura=entrada.nextInt();
    area=(base*altura)/2;
    System.out.println("El area del triangulo es: "+area);
    }
    
}
