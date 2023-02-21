import java.util.Scanner;
public class menorwoman {
    public static void main (String[] args) throws Exception{
        Scanner lectura=new Scanner (System.in);
        int acum,acumw,acumm;
        acumw=0;
        acumm=0;
        for (int i=1; i<=10; i++){
            System.out.println("digite 1 si es mujer, si es hombre dijite 2");
            acum=lectura.nextInt();
            if (acum==1){
                acumw=acumw+1;
            }
            else if (acum==2)
            {
                acumm=acumm+1;
            }
        }
        System.out.println("Hay "+acumw+" mujeres,y hay "+acumm+" hombres");
        lectura.close();

    }
}
