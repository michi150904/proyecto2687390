import java.util.Scanner;
public class Craps {
    public static void main (String[] args) throws Exception {
        Scanner leer= new Scanner (System.in);
       int more;
    int number1 = (int) (Math.random() * (7 - 1)) + 1;
    int number2 = (int) (Math.random() * (7 - 1)) + 1;
    more=number1+number2;
    if (number1==1 && number2==1){
        System.out.println("Ganaste con un :"+number1+ " y un: "+number2+" en los dos dados");
    }
    else if(more==3){
        System.out.println("Ganaste con una suma de: "+more+" con el número: "+number1+" y el número: "+number2);
    }
        else if(more==11){
        System.out.println("Ganaste con una suma de: "+more+" con el número: "+number1+" y el número: "+number2);
    }
        else if(more==2){
        System.out.println("Ganaste con una suma de: "+more+" con el número: "+number1+" y el número: "+number2);
    }
        else if(more==12){
        System.out.println("Ganaste con una suma de: "+more+" con el número: "+number1+" y el número: "+number2);
    }
        else if(more==7){
        System.out.println("Ganaste con una suma de: "+more+" con el número: "+number1+" y el número: "+number2);
    }
    else {
        System.out.println("Perdiste con el numero: "+number1+" y el número: "+number2);
    }
    leer.close();
    }
}
