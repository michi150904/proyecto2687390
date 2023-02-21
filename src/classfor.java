import java.util.Scanner;
public class classfor {
    public static void main (String[] args) throws Exception{
        Scanner lectura=new Scanner (System.in);
    int cantidad,precio,contador,subtotal,acumulador,telefonia,cash,vueltas;
    
    contador=0;
    acumulador=0;
    for (int x=1; x<=5; x++)
    {
        System.out.println("digite el precio del producto: ");
        precio=lectura.nextInt();
        System.out.println("digite el la cantidad del producto: ");
        cantidad=lectura.nextInt();
        contador=contador+1;
        subtotal=precio*cantidad;
        acumulador=acumulador+subtotal;
        }
        System.out.println("su total a pagar es: "+acumulador);
        System.out.println("Digite la cantidad de dinero a pagar: ");
        cash=lectura.nextInt();
        vueltas=cash-acumulador;
        System.out.println("sus vueltas son: "+vueltas);
        System.out.println("¿Cuenta con telefonia movil? si es cierto ingrese 1 si no ingrese 2: ");
        telefonia=lectura.nextInt();
        if (telefonia==1){
            System.out.println("Obtuvo esta cantidad de minutos: "+contador);
        }
        else {
            System.out.println("No pierdas mas minutos,adquiere ya tu telefonia movil con exito");
        }
        lectura.close();
    }
    }


