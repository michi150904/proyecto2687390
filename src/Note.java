import java.util.Scanner;
public class Note{
    public static void main (String[] args) throws Exception{
        Scanner lectura=new Scanner (System.in);
        double note1,note2,note3,attendance,prom;
        System.out.println("digite la primera nota del aprendiz:");
        note1=lectura.nextDouble();
        System.out.println("digite la segunda nota del aprendiz:");
        note2=lectura.nextDouble();
        System.out.println("digite la primera nota del aprendiz:");
        note3=lectura.nextDouble();
        System.out.println("digite el porcentaje de asistencia del aprendiz:");
        attendance=lectura.nextDouble();
        prom=(note1+note2+note3)/3;
        if (prom>=3.5 && attendance>=70){
            System.out.println("El aprendiz aprobo con un promedio de:  "+prom+" y un porcentaje de asistencia de: "+attendance);
        }
        else {
            System.out.println("El aprendiz no aprobo con un promedio de:  "+prom+" y un porcentaje de asistencia de: "+attendance);
        }
        lectura.close();

    }
}