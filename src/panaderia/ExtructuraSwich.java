

package panaderia;

import java.util.Scanner;


public class ExtructuraSwich {

    
    public static void main(String[] args) {
        System.out.println("1.  Calcular total venta");
        System.out.println("2.  Calcular ganancias del mes");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione la opción ");
        int opcion = sc.nextInt();
        
        switch(opcion){
            case 1 :
                System.out.println("Ingrese cantidad panes pequeños:");
                int panesP = sc.nextInt();
                System.out.println("Ingrese cantidad panes grandes:");
                int panesG = sc .nextInt();
                calcularTotalVenta(panesP, panesG);
                break;
            case 2:
                System.out.println("Ingrese Cantidad panes pequeños vendidos en el mes");
                int panesPmes = sc.nextInt();
                System.out.println("Ingrese cantidadd panes grandes:");
                int panesGmes = sc.nextInt();
                double resultado =   calcularGanancias(panesPmes, panesGmes);
                System.out.println("Las Ganancias del mes fueron:"+resultado);
                
                break;
            default:
                System.out.println("Opción no disponible.");
        }
                
    }
    

public static void calcularTotalVenta (int cantPanesP,int cantPanesG){
double costoPanesP = cantPanesP * 300;
double costoPanesG = cantPanesG * 500;

double costoTotal = costoPanesP + costoPanesG;
int totalPanes = cantPanesP + cantPanesG;

    if (totalPanes > 20) {
        double descuento = costoTotal *0.05;
        
        costoTotal = costoTotal - descuento;
        
    } 
    System.out.println("El costo de los panes es :"+ costoTotal);

 }
public static double calcularGanancias(int cantPanesP,int cantPaneG){
double costoPanesP = cantPanesP * 300;
double costoPanesG = cantPaneG* 500;

double valorTotal = costoPanesP + costoPanesG;

double ganancias = valorTotal * 0.02;
return  ganancias;
}
}