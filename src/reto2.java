import java.util.Scanner;
public class reto2 {
    public static void main(String[] args) {
        String nomBebe1,nomMadre1,vacuna1;
        float pesoBebe1;
        int edadBebe1;
    
        System.out.println("Digite el nombre del bebe:");
        Scanner nombebe=new Scanner(System.in);
        nomBebe1=nombebe.next();
        
        System.out.println("Digite el peso en kilogramos del bebe:");
        pesoBebe1=nombebe.nextFloat()+10;
        
        System.out.println("digite la edad en meses del bebe:");
        edadBebe1=nombebe.nextInt()*10;
        
        System.out.println("Digite el nombre de la madre:");
        nomMadre1=nombebe.next();
        
        System.out.println("Digite la vacuna administrada:");
        vacuna1=nombebe.next();
        
        
        float resultado1=pesoBebe1/edadBebe1;
        float resultado2=resultado1*8;
        
        System.out.print("Nombre del bebe=");
        System.out.println(nomBebe1);
        
        System.out.print("Nombre de la madre=");
        System.out.println(nomMadre1);
        
        System.out.print("Vacuna administrada=");
        System.out.println(vacuna1);
        
        System.out.print("Dosis de vacuna ha aplicar=");
        System.out.print(resultado2);

        nombebe.close();
    }
    
}
