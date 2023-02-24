import java.util.Scanner;
public class Budget2 {
    public static void main (String[] args) throws Exception {
        Scanner leer= new Scanner (System.in);
        int spent,budget,totals,op;
        totals=0;
        op=1;
        budget=100000;
        while (op==1){
            System.out.println("Ingrese el gasto");
            spent=leer.nextInt();
            totals=totals+1;  
            System.out.println("contador"+totals);          
            if (totals<=3){
            budget=budget-spent;
            System.out.println("El gasto fue: "+spent+" y te queda tanto presupuesto: "+budget);
            System.out.println("Desea registrar otro gasto,1 si 2 no.");
            op=leer.nextInt();
        }
        else {
            System.out.println("ya cumpliste tu total de gastos, no puedes registrar mas");
            System.out.println("Tu presupuesto restante es: "+budget+"tu total de gasto fue: "+spent);
            System.out.println("digita 2 para terminar el proceso");
            op=leer.nextInt();
        }
    }
    leer.close();
    }
}
