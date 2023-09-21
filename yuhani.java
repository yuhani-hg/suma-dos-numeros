package clases308;

import java.util.Scanner;

public class yuhani {
    public static void main(String[] args) {
        int law5;
        double zz=0; 
        Scanner leer=new Scanner(System.in);
        double []num=new double [5];
        for(law=0; law<=4; law++)
        {
            System.out.print("Ingresa un numero: ");
            num[law]=leer.nextDouble();
        }
        for(law=0; law<=4; law++)
        {
             zz=zz+num[law];
        }
        System.out.println("El total es: "+zz);
    }
    
}
