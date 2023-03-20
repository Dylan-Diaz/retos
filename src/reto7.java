import java.util.*;

public class reto7 {
    public static void main(String[] args) {
        int dinero;
        int n=1;
        int apuesta;
        int resultado;
        int total=0;
        int nVeces=0;

        Random aleatorio=new Random();

        Scanner recoger=new Scanner(System.in);

        while (n==1) {
            System.out.println("Ingrese la cantidad de dinero que desea apostar:");
            dinero=recoger.nextInt();


            if (dinero>0) {
                System.out.println("Elija una opcion:\n1 piedra\n2 papel\n3 tijera");
                apuesta=recoger.nextInt();
                int maquina=aleatorio.nextInt();
                maquina=(int)(Math.random()*3+1);
                if ((maquina==3)&&(apuesta==1)) {
                    total=dinero+total;
                    resultado=total+dinero;
                    System.out.println("!Felicidades usted Gano¡");
                    System.out.println("resultado:"+maquina);
                    System.out.println("Dinero ganado:"+dinero);
                    System.out.println("total:"+resultado);
                }
                else if ((maquina==2)&&(apuesta==3)) {
                    total=dinero+total;
                    resultado=total+dinero;
                    System.out.println("!Felicidades usted Gano¡");
                    System.out.println("resultado:"+maquina);
                    System.out.println("Dinero ganado:"+dinero);
                    System.out.println("total:"+resultado);
                }
                else if ((maquina==1)&&(apuesta==2)) {
                    total=dinero+total;
                    resultado=total+dinero;
                    System.out.println("resultado:"+maquina);
                    System.out.println("!Felicidades usted Gano¡");
                    System.out.println("Dinero ganado:"+dinero);
                    System.out.println("total:"+resultado);
                }
                else if((maquina==1)&&(apuesta==3)){
                    total=total-dinero;
                    resultado=total-total;
                    System.out.println("!Mala suerte, usted perdio¡");
                    System.out.println("resultado:"+maquina);
                    System.out.println("Dinero perdido:"+dinero);
                    System.out.println("total:"+resultado);
                    nVeces++;
                }
                else if((maquina==2)&&(apuesta==1)){
                    total=total-dinero;
                    resultado=total-total;
                    System.out.println("!Mala suerte, usted perdio¡");
                    System.out.println("resultado:"+maquina);
                    System.out.println("Dinero perdido:"+dinero);
                    System.out.println("total:"+resultado);
                    nVeces++;
                }
                else if((maquina==3)&&(apuesta==2)){
                    total=total-dinero;
                    resultado=total-total;
                    System.out.println("!Mala suerte, usted perdio¡");
                    System.out.println("resultado:"+maquina);
                    System.out.println("Dinero perdido:"+dinero);
                    System.out.println("total:"+resultado);
                    nVeces++;
                }
                else if ((maquina==1)&&(apuesta==1)) {
                    total=total+dinero;
                    resultado=total;
                    System.out.println("!Empate¡");
                    System.out.println("resultado:"+maquina);
                    System.out.println("Dinero ganado:0");
                    System.out.println("total:"+resultado);
                }
                else if ((maquina==2)&&(apuesta==2)) {
                    total=total+dinero;
                    resultado=total;
                    System.out.println("!Empate¡");
                    System.out.println("resultado:"+maquina);
                    System.out.println("Dinero ganado:0");
                    System.out.println("total:"+resultado);
                }
                else if ((maquina==3)&&(apuesta==3)) {
                    total=total+dinero;
                    resultado=total;
                    System.out.println("!Empate¡");
                    System.out.println("resultado:"+maquina);
                    System.out.println("Dinero ganado:0");
                    System.out.println("total:"+resultado);
                }
            }
            System.out.println("¿Desea seguir jugando?: 1_Si 2_No");
            n=recoger.nextInt();

            if (nVeces==3) {
                n=2;
                System.out.println("Perdone ha perdido 3 veces seguidas, ya no puede jugar."); 
            }
        }
        recoger.close();
    }
}
