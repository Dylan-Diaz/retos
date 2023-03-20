import java.util.*;
public class reto8 {
    public static void main(String[] args) {
        int n=0;
        int apuesta;

        Random numAleatorio=new Random();
        int numero=numAleatorio.nextInt();
        numero=(int)(Math.random()*100+1);

        Scanner recoger=new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("¿Que numero es?,intento numero_"+i);
            apuesta=recoger.nextInt();
            if(apuesta!=numero && numero>apuesta){
                n++;
                System.out.println("Intentelo de nuevo, el numero es mayor"); 
            }
            else if (apuesta!=numero && numero<apuesta) {
                n++;
                System.out.println("Intentelo de nuevo, el numero es menor"); 
            }
            else if (apuesta==numero) {
                System.out.println("¡Felicidades ha logrado adivinar el numero!");
                System.out.println("numero de intentos:_"+n);
                break;
            }
            if (n==10) {
                System.out.println("Lo siento, no has podido adivinar el numero");
            }

        }
        recoger.close();
    }
}
