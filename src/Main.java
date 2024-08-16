import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("==================================");
        System.out.println("1: media");
        System.out.println("2: eq2grau");
        System.out.println("3: Soma100");
        System.out.println("4: Cont10");
        System.out.println("sair: qualquer numero fora das opcoes");
        System.out.println("==================================");
        System.out.print("Digite: ");
        Scanner op = new Scanner(System.in);
        int n1;
        n1 = op.nextInt();
        switch (n1)
        {
            case 1:
                System.out.println("media escolhido");
                media();
                break;
            case 2:
                System.out.println("Eq2grau");
                Eq2grau();
                break;
            case 3:
                System.out.println("Soma100");
                soma100();
                break;
            case 4:
                System.out.println("cont10");
                cont10();
                break;
            default:
                System.out.println("Obrigado por usar nosso programa!!");
                break;

        }
    }
    public static void media()
    {
        Scanner entrada = new Scanner(System.in);
        //Declaração das variáveis
        float n1, n2, n3, n4, media;
        // Solicita quatro números ao usuário
        System.out.println("Digite 4 números:");
        n1 = entrada.nextFloat();
        n2 = entrada.nextFloat();
        n3 = entrada.nextFloat();
        n4 = entrada.nextFloat();
        media = (n1 + n2 + n3 + n4) / 4;
        System.out.println("Média = " +  media);
    }
    public static void Eq2grau()
    {
        Equacao e2grau = new Equacao();
        e2grau.calcDelta();
        System.out.println("Delta " + e2grau.delta);
        System.out.println(e2grau.raiz());
    }
    public static void soma100() {
        Scanner entrada = new Scanner(System.in);
        double resultado = 0;

        for (int i = 0; i < 100; i++)
        {
            System.out.print("Digite: ");
            double n1;
            n1 = entrada.nextDouble();
            resultado = resultado + n1;
        }
        System.out.println("Soma: " + resultado);
    }
    public static void cont10()
    {
        for(int i = 1; i <= 10; i++)
        {
            System.out.println("Contador: " + i);
        }
    }
}