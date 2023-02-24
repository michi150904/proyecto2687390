import java.util.Scanner;
public class Supermarket1 {
    public static void main (String[] args) throws Exception {
        Scanner leer= new Scanner (System.in);
        int value,desc,finalValue;
        System.out.println("Ingrese el valor total de su compra: ");
        value=leer.nextInt();
        int number = (int) (Math.random() * (5 - 1)) + 1;
        if (value>50000){
            if(number==1){
                System.out.println("Has sido beneficiado por nuestra promoción de aniversario, has obtenido el 10% de descuento en el valor de tu compra obteniendo la bolita de color rojo.");
                desc=(value*10)/100;
                finalValue=value-desc;
                System.out.println("El valor de descuento de tu compra es: "+desc+" y el valor total de tu compra es: "+finalValue);
            }
            else if(number==2){
                System.out.println("Has sido beneficiado por nuestra promoción de aniversario, has obtenido el 30% de descuento en el valor de tu compra obteniendo la bolita de color azul.");
                desc=(value*30)/100;
                finalValue=value-desc;
                System.out.println("El valor de descuento de tu compra es: "+desc+" y el valor total de tu compra es: "+finalValue);
            }
            else if(number==3){
                System.out.println("Has sido beneficiado por nuestra promoción de aniversario, has obtenido el 50% de descuento en el valor de tu compra obteniendo la bolita de color amarilla.");
                desc=(value*50)/100;
                finalValue=value-desc;
                System.out.println("El valor de descuento de tu compra es: "+desc+" y el valor total de tu compra es: "+finalValue);
            }
            else if(number==4){
                System.out.println("Has sido beneficiado por nuestra promoción de aniversario, tu compra es totalmente gratis debido a que sacaste la bolita blanca");
            }
        }
                    else {
                System.out.println("No obtienes el descuento.");
            }
leer.close();
    }
}

