import java.util.Scanner;
public class Calculator {
    public static void main (String[] args) throws Exception{
        Scanner lectura=new Scanner (System.in);
        int operations;
        double number,number2,suma,resta,multi,divi,poten,raiz,raiz2;
    System.out.println("digite el primer numero: ");
    number=lectura.nextDouble();
    System.out.println("digite el segundo numero: ");
    number2=lectura.nextDouble();
    System.out.println("digite 1 si quiere sumar,2 siquiere restar, 3 si quiere multiplicar, 4 si quiere dividir, 5 si quiere realizar una potencia y 6 si quiere realizar raiz cuadrada ");
    operations=lectura.nextInt();
    switch (operations){
        case 1:
        suma=number+number2;
        System.out.println("el resultado de la operacion es: "+suma);
        break;
        case 2:
        resta=number-number2;
        System.out.println("el resultado de la operacion es: "+resta);
        break;
        case 3:
        multi=number*number2;
        System.out.println("el resultado de la operacion es: "+multi);
        break;
        case 4:
        divi=number/number2;
        System.out.println("el resultado de la operacion es: "+divi);
        break;
        case 5:
        poten= Math. pow(number,number2);
        System.out.println("el resultado de la operacion es: "+poten);
        break;
        case 6:
        raiz=Math.sqrt(number);
        raiz2=Math.sqrt(number2);
        System.out.println("el resultado de la raiz del numero uno : "+number+" es: "+raiz+" y la raiz del numero 2: "+number2+" es: "+raiz2);
        break;
        default:
        System.out.println("error");

}
lectura.close();
    }

}
