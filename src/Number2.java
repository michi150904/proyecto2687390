import java.util.Scanner;
public class Number2 {
        public static void main (String[] args) throws Exception{
        Scanner lectura=new Scanner (System.in);
        int number;
        System.out.println("Ingrese el numero a evaluar");
        number=lectura.nextInt();
        if (number>0){
            System.out.println("el numero digitado es positivo");
        }
        else if (number==0){
        System.out.println("El numero es neutro");
        }
        else{
            System.out.println("El numero es negativo");
        }
        lectura.close();0
        
        }
}
