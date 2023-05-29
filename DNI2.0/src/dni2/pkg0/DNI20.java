package dni2.pkg0;

import java.util.Scanner;

public class DNI20 {

    public static void main(String[] args) {
        //Esto es un comentario para probar el commit
         Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el número de su DNI.");
        int dni = sc.nextInt();
        
        if (dni%23 == 0){
                System.out.println("La letra del DNI "+dni+" es T");
        }
        else if(dni%23 == 1){
            System.out.println("La letra del DNI "+dni+" es R");
        }
        else if(dni%23 == 2){
            System.out.println("La letra del DNI "+dni+" es W");
        }
        else if(dni%23 == 3){
            System.out.println("La letra del DNI "+dni+" es A");
        }
        else if(dni%23 == 4){
            System.out.println("La letra del DNI "+dni+" es G");
        }
        else if(dni%23 == 5){
            System.out.println("La letra del DNI "+dni+" es M");
        }
        else if(dni%23 == 6){
            System.out.println("La letra del DNI "+dni+" es Y");
        }
        else if(dni%23 == 7){
            System.out.println("La letra del DNI "+dni+" es F");
        }
        else if(dni%23 == 8){
            System.out.println("La letra del DNI "+dni+" es P");
        }
        else if(dni%23 == 9){
            System.out.println("La letra del DNI "+dni+" es D");
        }
        else if(dni%23 == 10){
            System.out.println("La letra del DNI "+dni+" es X");
        }
        else if(dni%23 == 11){
            System.out.println("La letra del DNI "+dni+" es B");
        }
         else if(dni%23 == 12){
            System.out.println("La letra del DNI "+dni+" es N");
        }
        else if(dni%23 == 13){
            System.out.println("La letra del DNI "+dni+" es J");
        }
        else if(dni%23 == 14){
            System.out.println("La letra del DNI "+dni+" es Z");
        }
        else if(dni%23 == 15){
            System.out.println("La letra del DNI "+dni+" es S");
        }
        else if(dni%23 == 16){
            System.out.println("La letra del DNI "+dni+" es Q");
        }
        else if(dni%23 == 17){
            System.out.println("La letra del DNI "+dni+" es V");
        }
        else if(dni%23 == 18){
            System.out.println("La letra del DNI "+dni+" es H");
        }
        else if(dni%23 == 19){
            System.out.println("La letra del DNI "+dni+" es L");
        }
        else if(dni%23 == 20){
            System.out.println("La letra del DNI "+dni+" es C");
        }
        else if(dni%23 == 21){
            System.out.println("La letra del DNI "+dni+" es K");
        }
        else if(dni%23 == 22){
            System.out.println("La letra del DNI "+dni+" es E");
        }
        else {
            System.out.println("El número no es válido.");
        }
    }
    
}
