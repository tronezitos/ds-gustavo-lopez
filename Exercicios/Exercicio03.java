import java.util.Scanner;

public class Exercicio03 {
    
    public static void main(String[] args) {
        
        Scanner a = new Scanner(System.in);
            System.out.println("Fale a medida do lado A");
            double A =a.nextDouble();

        Scanner b = new Scanner(System.in);
            System.out.println("Fale a medida do lado B");
            double B =b.nextDouble();

        Scanner c = new Scanner(System.in);
            System.out.println("Fale a medida do lado C");
            double C =c.nextDouble();

                if (A > B + C){
                System.out.println("Não formam triangulo algum");
            
        }
    
                else if (A*A == B*B + C*C) {
                System.out.println("Formam um triangulo retangulo");
            
                if (A*A > B*B + C*C){
                System.out.println("Formam um triângulo obtusângulo");
                
                if(A*A < B*B + C*C){
                System.out.println("Formam um acutângulo");
                }
            }
        }

        if (A*A == B*B) {
            if (B*B == C*C){
                System.out.println("Formam um triangulo equilatero");
            
            }
            if (B*B > C*C) {
                System.out.println("Formam um triangulo isósceles");
            }
        }
     }
}
