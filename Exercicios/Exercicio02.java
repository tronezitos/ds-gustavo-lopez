import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        
        Scanner a = new Scanner(System.in);
            System.out.println("Digite 1 se você for homem ou digite 2 se você for mulher");
            int Sexo =a.nextInt();
            if (Sexo > 2){
                System.out.println("Valor Invalido!");
            } 
            else if (Sexo < 1){
                System.out.println("Valor Invalido!");
            }

            Scanner b = new Scanner(System.in);
                System.out.println("Digite a quanto tempo você está na empresa EM ANOS");
                int Idade =b.nextInt();

            Scanner c = new Scanner(System.in);
                System.out.println("Digite seu codigo de funcionario");
                int Codigo =c.nextInt();

            Scanner d = new Scanner(System.in);
                System.out.println("Digite o seu salario");
                double Salario =d.nextDouble();

                a.close();
                b.close();
                c.close();
                d.close();
                
                
                double Bonus = 0;

                if (Idade > 10) {
                    Bonus = Salario * 1.25;
                }

                if (Sexo == 1) {
                    if (Idade > 15) {
                        Bonus = Salario * 1.20;
                    }
                }

                if (Idade < 10) {
                    Bonus = Salario + 100;
                }

                if (Sexo == 1) {
                    System.out.println("Sexo: Masculino");
                }
                else if (Sexo == 2){
                    System.out.println("Sexo: Feminino");
                }
                
                System.out.println("Codigo: " + Codigo);
                System.out.println("Tempo de trabalho: " + Idade + " Anos");
                System.out.println("Salario: " + Bonus);

    }
}