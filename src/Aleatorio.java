import java.util.Scanner;
public class Aleatorio {
    public static void main (String[] args) throws Exception{
    Scanner lectura=new Scanner (System.in);
    int number = (int) (Math.random() * (3 - 1)) + 1;
    int number2;
    System.out.println("el numero es: "+number);
    System.out.println("Eliga 1 para cara y 2 para sello");
    number2=lectura.nextInt();
    lectura.nextLine();
    if (number2==1){
        if(number==1){
        System.out.println("has ganado,escogiste cara");
    }
    else{
        System.out.println("has perdido,escogiste cara");
    }

    }
    else if (number2==2){
        if(number==2){
        System.out.println("has ganado,escogiste sello");
    }
    else{
        System.out.println("has perdido,escogiste sello");
    }
    }
   
    lectura.close();
    }
}
