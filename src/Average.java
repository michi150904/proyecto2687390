import java.util.Scanner;
public class Average {
        public static void main (String[] args) throws Exception {
        Scanner leer= new Scanner (System.in);
        double note1,note2,note3,note4,prom;
        System.out.println("digite la nota 1: ");
        note1=leer.nextDouble();
        System.out.println("digite la nota 2: ");
        note2=leer.nextDouble();
        System.out.println("digite la nota 3: ");
        note3=leer.nextDouble();
        System.out.println("digite la nota 4: ");
        note4=leer.nextDouble();
        prom=(note1+note2+note3+note4)/4;
        if (prom>=0.0 && prom <=2.9){
            System.out.println("Tu promedio fue: "+prom+ " y reprobaste la asignatura.");
        }
        else if (prom>=3.0 && prom <=4.0){
            System.out.println("Tu promedio fue: "+prom+ " y pasaste raspando la asignatura.");
        }
        else if (prom>=4.0 && prom <=5.0){
            System.out.println("Tu promedio fue: "+prom+ " y aprobaste con buenos resultados.");
        }
        else{
            System.out.println("Digitaste una nota incorrecta");
        }
leer.close();
    }
}
