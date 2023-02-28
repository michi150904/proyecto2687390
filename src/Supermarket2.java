import java.util.Scanner;
public class Supermarket2 {
    public static void main (String[] args) throws Exception {
        Scanner leer= new Scanner (System.in);
        int price,amount,totalToPay,laps,subtotal,cash,discount,op,op2;
        op2=1;
        op=1;
        totalToPay=0;
        while (op==1){
            System.out.println("digite el precio del producto: ");
            price=leer.nextInt();
            System.out.println("digite el la cantidad del producto: ");
            amount=leer.nextInt();
            subtotal=price*amount;
            totalToPay=totalToPay+subtotal;
            System.out.println("digite 1 si desea continuar o 2 si desea terminar: ");
            op=leer.nextInt();
        }
        int number = (int) (Math.random() * (5 - 1)) + 1;
        System.out.println("El valor total de su compra es: "+totalToPay);
        System.out.println("Hubieras podido obtener un descuento si tu compra hunbiera sido superio a 50000");
        if (totalToPay>50000){
            if(number==1){
                System.out.println("Has sido beneficiado por nuestra promoción de aniversario, has obtenido el 10% de descuento en el valor de tu compra obteniendo la bolita de color rojo.");
                discount=(totalToPay*10)/100;
                totalToPay=totalToPay-discount;
                System.out.println("El valor de descuento de tu compra es: "+discount+" y el valor total de tu compra es: "+totalToPay);
            }
            else if(number==2){
                System.out.println("Has sido beneficiado por nuestra promoción de aniversario, has obtenido el 30% de descuento en el valor de tu compra obteniendo la bolita de color azul.");
                discount=(totalToPay*30)/100;
                totalToPay=totalToPay-discount;
                System.out.println("El valor de descuento de tu compra es: "+discount+" y el valor total de tu compra es: "+totalToPay);
            }
            else if(number==3){
                System.out.println("Has sido beneficiado por nuestra promoción de aniversario, has obtenido el 50% de descuento en el valor de tu compra obteniendo la bolita de color amarilla.");
                discount=(totalToPay*50)/100;
                totalToPay=totalToPay-discount;
                System.out.println("El valor de descuento de tu compra es: "+discount+" y el valor total de tu compra es: "+totalToPay);
            }
            else if(number==4){
                System.out.println("Has sido beneficiado por nuestra promoción de aniversario, tu compra es totalmente gratis debido a que sacaste la bolita blanca");
            }
        }
        while (op2==1){
            System.out.println("Digite el valor con el que va a pagar: ");
            cash=leer.nextInt();
            if(cash>=totalToPay){
            laps=cash-totalToPay;
            System.out.println("Sus vueltas son: "+laps);
        }
        else{
            System.out.println("Ingrese un valor valido,digite 1 para volver a digitar el valor");
            op2=leer.nextInt();

        }
}
leer.close();
}
}
