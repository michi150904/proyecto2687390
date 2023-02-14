import java.util.Scanner;
public class sale {
    public static void main (String[] args) throws Exception{
        Scanner total=new Scanner (System.in);
        int products,pay,totalPrice,changePay;
        System.out.println("Ingrese la cantidad de prodcutos que adquirio: ");
        products=total.nextInt();
        totalPrice=products*10000;
        System.out.println("El total de su compra es: "+totalPrice);
        System.out.println("Ingrese la cantidad de dinero con el que va a pagar: ");
        pay=total.nextInt();
        changePay=pay-totalPrice;
        System.out.println("Sus vueltas son: "+changePay);
        total.close();




    }
}
