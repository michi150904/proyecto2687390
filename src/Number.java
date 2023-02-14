import java.util.Scanner;
public class Number {
    public static void main (String[] args) throws Exception{
        Scanner lectura=new Scanner (System.in);
        int number1,number2,suma,resta;
        System.out.println("Ingrese el numero 1");
        number1=lectura.nextInt();
        System.out.println("Ingrese el numero 2");
        number2=lectura.nextInt();
        if (number1>number2){
            suma=number1+number2;
            System.out.println("El resultado de la suma entre dos numeros es:  "+suma);
        }
        else{
            resta=number1-number2;
            System.out.println("El resultado de la resta de dos numeros es: "+resta);
        }
        lectura.close();
    }
}
