import java.util.Scanner;
public class Random2 {
    public static void main (String[] args) throws Exception{
        Scanner lectura=new Scanner (System.in);
        int number2,value,counter,valueToBet,duplicate,op;
        counter=0;
        op=1;
        System.out.println("Defina cual es su presupuesto para apostar.");
        value=lectura.nextInt();
        

        while(op==1 ){
            System.out.println("¿Cuanto quiere apostar en esta ronda?");
            valueToBet=lectura.nextInt();
            if (valueToBet<=value){
            int number = (int) (Math.random() * (3 - 1)) + 1;
            System.out.println("Eliga 1 para cara y 2 para sello");
            number2=lectura.nextInt();
            lectura.nextLine();
            counter=counter+1;
            if (number2==1){
                if(number==1){
                    duplicate=valueToBet+valueToBet;
                    value=value+duplicate;
                System.out.println("has ganado,escogiste cara, sumaste a tu ganancia: "+duplicate+ " ya que ganaste se duplico lo que apostatse.");
            }
            else{
                value=value-valueToBet;
                System.out.println("has perdido,escogiste cara, el valor apostado se restara a tu ganancia final");
            }
        
            }
            else if (number2==2){
                if(number==2){
                    duplicate=valueToBet+valueToBet;
                    value=value+duplicate;
                System.out.println("has ganado,escogiste sello,sumaste a tu ganancia: "+duplicate+ " ya que ganaste se duplico lo que apostatse.");
            }
            else{
                value=value-valueToBet;
                System.out.println("has perdido,escogiste sello,el valor apostado se restara a tu ganancia final");
            }
            }
    
            System.out.println("el numero es: "+number);
            System.out.println("digite 1 si desea continuar o 2 si desea terminar: ");
            op=lectura.nextInt();
        }
        else if(value==0) {
            System.out.println("Ya no puedes apostar mas.");
            break;

        }
        else{
            System.out.println("Digite un valor menor o igual a su presupuesto,digite 1 para volver a digitar el valor a apostar.");
            op=lectura.nextInt();    
        }
        }
        System.out.println("Jugaste: "+counter+" rondas");
        System.out.println("Tu valor final despues de apostar es: "+value);
        lectura.close();

    }    
}
