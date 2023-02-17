import java.util.Scanner;
public class User {
    public static void main (String[] args) throws Exception{
        Scanner lectura=new Scanner (System.in);
        String user,password,userReal,passwordReal;
        userReal="Michi";
        passwordReal="mmateus";
        System.out.println("Ingrese el usuario:");
        user =lectura.nextLine();
        System.out.println("Ingrese la contraseña:");
        password =lectura.nextLine();
        if (user.equals(userReal) && password.equals(passwordReal)){
            System.out.println("Bienvenido al sistema");
        }
        else if (user.equals(userReal) && password!= passwordReal){
            System.out.println("Parece que olvidaste tus credenciales de acceso");
        }

        else if  (user!=userReal && password.equals(passwordReal)){
            System.out.println("Algo pasa con tus datos de acceso");
    }
    else {
        System.out.println("Acceso denegado");
    }
    lectura.close();
    }
}
