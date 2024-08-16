import java.util.Scanner;

public class Equacao {
    public int a;
    public int b;
    public int c;
    public int delta;

    public void calcDelta()
    {
        Scanner entrada = new Scanner(System.in);
        System.out.print("A: ");
        a = entrada.nextInt();
        System.out.print("B: ");
        b = entrada.nextInt();
        System.out.print("C: ");
        c = entrada.nextInt();
        delta = b*b - 4*a*c;
    }
    public String raiz()
    {
        String mensagem = "";
        if (delta < 0)
        {
            mensagem = "Nao existe raiz real";
        }else if (delta == 0)
        {
            mensagem = "Uma raiz real: ";
        }else if(delta > 0)
        {
            mensagem =  "Raiz1: ";
        }
        return mensagem;
    }
}
