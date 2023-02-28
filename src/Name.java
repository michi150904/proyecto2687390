import java.util.Scanner;
public class Name {
    public static void main (String[] args) throws Exception{
        Scanner lectura=new Scanner (System.in);
    String name,lastName,nameM,lastnamem,nombrecompleto,letters;
    int longin,longia;
    System.out.println("Digite el nombre");
    name=lectura.nextLine();
    System.out.println("Digite el apellido");
    lastName=lectura.nextLine();
    longin=name.length();
    longia=lastName.length();
    System.out.println("la longitud del nombre es: "+longin+" y la longitud del apellido es: "+longia);
    nameM=name.toUpperCase();
    lastnamem=lastName.toLowerCase();
    nombrecompleto=name+lastName;
    letters=name.substring(0, 2);
    System.out.println("El nombre en mayusculas: "+nameM);
    System.out.println("El apellido en minuscula: "+lastnamem);
    System.out.println("El nombre y apellido junto es: "+nombrecompleto);
    System.out.println("Las dos letras inciales y el apellido es: "+letters+lastName);

    lectura.close();
    
}
}
