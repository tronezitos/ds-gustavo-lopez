import java.util.Scanner;

public class Exercicio01 {
 public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
            System.out.println("Informe o seu nome");
            String Nome =a.next();

        Scanner b = new Scanner(System.in);
            System.out.println("Informe a quantidade de horas trabalhadas semanais");
            int Horas =b.nextInt();

        Scanner c = new Scanner(System.in);
            System.out.println("Informe a quantidade recebida EM HORAS");
            double Salario =c.nextDouble();

        Scanner d = new Scanner(System.in);
            System.out.println("Informe quanto filhos você tem ABAIXO dos 14 anos");
            int Filhos =d.nextInt();

        Scanner e = new Scanner(System.in);
            System.out.println("Informe a sua idade");
            int Idade =e.nextInt();
        
        Scanner f = new Scanner(System.in);
            System.out.println("Informe quantos anos você está no serviço EM ANOS");
            int Anos =f.nextInt();

        Scanner g = new Scanner(System.in);
            System.out.println("Informe o seu salario familia");
            double SalFamilia =g.nextDouble();

        a.close();
        b.close();
        c.close();
        d.close();
        e.close();
        f.close();
        g.close();

        
        double SalBruto = (Horas * Salario) * 4;
        double INPS = SalBruto * 0.085;
        double FamiliaSal = Filhos * SalFamilia;
        double IR = 0;
        double AIDS = 0;


        if (SalBruto > 1500) {
             IR = SalBruto * 0.15;
        }
        else if (SalBruto > 500) {
             IR = SalBruto * 0.08;
        }

        if (Idade > 40) {
            AIDS = SalBruto * 1.02; 
        }
        else if (Anos > 15) {
            AIDS = SalBruto * 1.035;
        }
        else if (Anos <= 15) {
            if (Anos > 30) {
                AIDS = SalBruto * 1.015; 
            }
            else{
                AIDS = 0;
            }
        }


        double SalLiquido = (SalBruto * INPS) * AIDS;
        if (Filhos >= 1) {
            double SalLiquidoDois = SalLiquido + SalFamilia;             
        }

        System.out.println("nome: " + Nome);
        System.out.println("salario bruto: " + SalBruto);
        System.out.println("Imposto De Renda: " + IR);
        System.out.println("ADIC: " + AIDS);
        System.out.println("Salario Familia: " + SalFamilia);
        System.out.println("Salario Liquido: " + SalLiquido);

    }

}