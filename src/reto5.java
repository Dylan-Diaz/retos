import java.util.*;
public class reto5 {
    public static void main(String[] args) {
        String nombre;
        int registro;
        int n=1;
        int precio;
        int cantidad;
        int total;
        int pago;
        int vueltas;

        Scanner recoger=new Scanner(System.in);

        System.out.println("Ingrese el nombre del empleado:");
        nombre=recoger.next();

        System.out.println("Ingrese el nombre del cliente:");
        nombre=recoger.next();

        System.out.println("¿El cliente se encuentra registrado en el sistema?\n1_si\n2_no");
        registro=recoger.nextInt();
        if (registro==1) {
            while (n==1) {
                System.out.println("Ingrese el precio del producto");
                precio=recoger.nextInt();

                System.out.println("Ingrese la cantidad que desea del producto");
                cantidad=recoger.nextInt();

                total=precio*cantidad;

                System.out.println("El total a pagar es:_"+total);

                System.out.println("Ingrese el valor de su pago");
                pago=recoger.nextInt();

                if (pago==total) {
                    System.out.println("¡Gracias por su compra!");
                }
                else if (pago>total) {
                    vueltas=pago-total;
                    System.out.println("total a devolver:_"+vueltas);
                    System.out.println("¡Gracias por su compra!");
                }else if (pago<total) {
                    System.out.println("Su pago es insuficiente");
                }
                System.out.println("¿Desea volver a comprar?\n1_si\n2_no");
                n=recoger.nextInt();


            }
        }
        else{
            System.out.println("Perdone no se puede efectuar la compra");
        }

        recoger.close();
}
}
