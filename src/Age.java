import java.util.Scanner;
public class Age {
    public static void main (String[] args) throws Exception{
        Scanner lectura=new Scanner (System.in);
        int age;
        System.out.println("ingresa edad");
        age=lectura.nextInt();
        if (age>=18){
            System.out.println("Bienvenido");
        }
        else{
            System.out.println("No puede ingresar");
        }
        lectura.close();
    }
}
