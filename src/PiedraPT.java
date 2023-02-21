import java.util.Scanner;
public class PiedraPT {
    public static void main (String[] args) throws Exception{
    Scanner lectura=new Scanner (System.in);
    int number = (int) (Math.random() * (4 - 1)) + 1;
    int number2;
    System.out.println("el numero es: "+number);
    System.out.println("Eliga 1 para papel, 2 para piedra y 3 para tijera");
    number2=lectura.nextInt();
    lectura.nextLine();
    if (number==1){
        if(number2==1){
        System.out.println("has ganado,escogiste papel");
    }
    else if(number2==2){
        System.out.println("has perdido,escogiste piedra");
    }
    else if(number2==3){
        System.out.println("has perdido,escogiste tijera");
    }

    }
    else if (number==2){
        if(number2==2){
        System.out.println("has ganado,escogiste piedra");
    }
    else if(number2==1){
        System.out.println("has perdido,escogiste papel");
    }
    else if(number2==3){
        System.out.println("has perdido,escogiste tijera");
    }

    }
    else if (number==3){
        if(number2==3){
        System.out.println("has ganado,escogiste tijera");
    }
    else if(number2==1){
        System.out.println("has perdido,escogiste papel ");
    }
    else if(number2==2){
        System.out.println("has perdido,escogiste piedra");
    }

    }

    lectura.close();
    }
}