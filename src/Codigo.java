import java.util.Scanner;

public class Codigo {

    private int numA = 0;

    Scanner input = new Scanner(System.in);
//=====================================================================================================================
    public void CodeOne(){
        System.out.print("Digite o Numero a Verificar: ");
        setNumA(input.nextInt());

        if (getNumA() % 2 == 0){
            System.out.println("\nO Numero " + getNumA() + " é Par");
        }
        if (getNumA() % 2 == 1){
            System.out.println("\nO Numero " + getNumA() + " é Impar");
        }
    }
//=====================================================================================================================
    public int getNumA() {
        return numA;
    }
    public void setNumA(int numA) {
        this.numA = numA;
    }
//=====================================================================================================================
}
