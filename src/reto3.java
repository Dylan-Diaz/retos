import java.util.*;
public class reto3 {
    public static void main(String[] args) {
        String nombre;
        int dinero;
        int apuesta;
        int resultado;

        Scanner recoger=new Scanner(System.in);

        Random ladoaleatorio = new Random();

        System.out.println("Ingrese su nombre:");
        nombre=recoger.nextLine();

        System.out.println("Ingrese la cantidad de dinero ha apostar:");
        dinero=recoger.nextInt();


        if (dinero >= 10000) {
            System.out.println("¿En que lado caera la moneda?:\n1 cara\n2 sello");
                apuesta=recoger.nextInt();
                int moneda=ladoaleatorio.nextInt();
                moneda=(int)(Math.random()*2+1);
                if (moneda==apuesta) {
                    resultado=dinero+10000;
                    System.out.println("resultado:"+moneda);
                    System.out.println("Nombre:"+nombre);
                    System.out.println("!Felicidades usted Gano¡");
                    System.out.println("Dinero ganado:"+resultado);
                }
                else if(moneda!=apuesta){
                    resultado=dinero-10000;
                    System.out.println("resultado:"+moneda);
                    System.out.println("Nombre:"+nombre);
                    System.out.println("!Mala suerte, usted perdio¡");
                    System.out.println("Dinero perdido:"+resultado);
                }
                else{
                    System.out.println("Por favor intentelo nuevamente");
                }
        }
        else{
            System.out.println("El dinero apostado es muy poco");
        }
        recoger.close();
    }
}
