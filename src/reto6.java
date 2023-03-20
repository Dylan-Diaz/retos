import java.util.*;
public class reto6 {
    public static void main(String[] args) {
        int dinero;
        int apuesta;
        int resultado;
        int n=1;
        int nVeces=0;
        int total=0;

        Scanner recoger=new Scanner(System.in);

        Random ladoaleatorio = new Random();

        System.out.println("Ingrese la cantidad de dinero ha apostar:");
        dinero=recoger.nextInt();


        while (n==1) {
            if (dinero>0) {
                System.out.println("¿En que lado caera la moneda?:\n1 cara\n2 sello");
                    apuesta=recoger.nextInt();
                    int moneda=ladoaleatorio.nextInt();
                    moneda=(int)(Math.random()*2+1);
                    if (moneda==apuesta) {
                        total=dinero+total;
                        resultado=total+dinero;
                        System.out.println("resultado:"+moneda);
                        System.out.println("!Felicidades usted Gano¡");
                        System.out.println("Dinero ganado:"+resultado);
                    }
                    else if(moneda!=apuesta){
                        total=total-dinero;
                        resultado=total;
                        System.out.println("resultado:"+moneda);
                        System.out.println("!Mala suerte, usted perdio¡");
                        System.out.println("Dinero perdido:"+resultado);
                    }
                    else{
                        System.out.println("Por favor intentelo nuevamente");
                    }
            }
            else{
                System.out.println("por favor ingrese un valor para apostar");
            } 
            System.out.println("¿Desea seguir jugando?: 1_Si 2_No");
            n=recoger.nextInt();
            nVeces++;
            if (n==2) {
                System.out.println("Usted jugo_"+nVeces+"_veces.");
                System.out.println("Su total de dinero es:_"+total);
            }
        }
        
        recoger.close();
    }
}
