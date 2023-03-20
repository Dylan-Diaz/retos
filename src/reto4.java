import java.util.*;
public class reto4 {
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

        if (dinero>=10000) {
            System.out.println("Elija una opcion:\n1 piedra\n2 papel\n3 tijera");
                apuesta=recoger.nextInt();
                int mano=ladoaleatorio.nextInt();
                mano=(int)(Math.random()*3+1);
                if ((mano==3)==(apuesta==1)) {
                    resultado=dinero+10000;
                    System.out.println("resultado:"+mano);
                    System.out.println("Nombre:"+nombre);
                    System.out.println("!Felicidades usted Gano¡");
                    System.out.println("Dinero ganado:"+resultado);
                }
                else if ((mano==2)==(apuesta==3)) {
                    resultado=dinero+10000;
                    System.out.println("resultado:"+mano);
                    System.out.println("Nombre:"+nombre);
                    System.out.println("!Felicidades usted Gano¡");
                    System.out.println("Dinero ganado:"+resultado);
                }
                else if ((mano==1)==(apuesta==2)) {
                    resultado=dinero+10000;
                    System.out.println("resultado:"+mano);
                    System.out.println("Nombre:"+nombre);
                    System.out.println("!Felicidades usted Gano¡");
                    System.out.println("Dinero ganado:"+resultado);
                }
                else if((mano==1)==(apuesta==3)||(mano==1)==(apuesta==1)){
                    System.out.println("resultado:"+mano);
                    resultado=dinero-10000;
                    System.out.println("Nombre:"+nombre);
                    System.out.println("!Mala suerte, usted perdio¡");
                    System.out.println("Dinero perdido:"+resultado);
                }
                else if((mano==2)==(apuesta==1)||(mano==2)==(apuesta==2)){
                    System.out.println("resultado:"+mano);
                    resultado=dinero-10000;
                    System.out.println("Nombre:"+nombre);
                    System.out.println("!Mala suerte, usted perdio¡");
                    System.out.println("Dinero perdido:"+resultado);
                }
                else if((mano==3)==(apuesta==2)||(mano==3)==(apuesta==3)){
                    System.out.println("resultado:"+mano);
                    resultado=dinero-10000;
                    System.out.println("Nombre:"+nombre);
                    System.out.println("!Mala suerte, usted perdio¡");
                    System.out.println("Dinero perdido:"+resultado);
                }
        }
        else{
            System.out.println("El dinero apostado es muy poco");
        }
        recoger.close();
    }
}

