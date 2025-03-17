import java.util.Scanner;

public class Condicao {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
            System.out.println("Escolha um numero");
            int V1 =a.nextInt();

        Scanner b = new Scanner(System.in);
            System.out.println("Escolha outro numero");
            int V2 =b.nextInt();
        
            if (V1 > V2){
            System.out.println(V1 + " e maior que " + V2);
        }   
            else if (V1 == V2){
            
            System.out.println("Os numeros são iguais!");
        }   
            else{
            System.out.println(V1 + " e menor que " + V2);
        }
        
    }
    
}
