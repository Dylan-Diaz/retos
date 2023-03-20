import java.util.*;
public class reto1 {
    public static void main(String[] args) {
        double conversion;
        double temC;

        System.out.println("Digite la temperatura en grados Kelvin");
        Scanner temK=new Scanner(System.in);
        conversion=temK.nextDouble();
        temC=-273.15;
        System.out.println("La temperatura en grados Centigrados es:");
        System.out.print(temC+conversion);
        temK.close();
       
     
    }
    
}
