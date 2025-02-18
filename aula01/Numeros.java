import java.util.Scanner;

public class Numeros {
     public static void main(String[] args) {
        Scanner a =  new Scanner(System.in);
        System.out.println("Escolha um numero");
        int n1 =a.nextInt();
        
        Scanner b = new Scanner(System.in);
        System.out.println("Escolha outro numero");
        int n2 =b.nextInt();

        int n3 = n1 + n2;

        System.out.println("A soma desses numero e " + n3);
      
    }
}