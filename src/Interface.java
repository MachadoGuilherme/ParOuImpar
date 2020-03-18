import java.util.Scanner;

public class Interface {

    Codigo code = new Codigo();

    private int menuInicial;
    private int vezesNum;

    Scanner input = new Scanner(System.in);
//=====================================================================================================================
    public void Inicio(){
        System.out.println("\n\t--------------------");
        System.out.println("\t|∞∞ Par ou Impar ∞∞|");
        System.out.println("\t--------------------");
        do {
            System.out.println("\n\t≠≠ Menu Inicial ≠≠\n");
            System.out.println("1 - Verificar Par ou Impar");
            System.out.println("0 - Sair");
            System.out.print("\nEscolha Uma Das Opções: ");
            setMenuInicial(input.nextInt());

            if (getMenuInicial() < 0 || getMenuInicial() > 1){
                System.out.println("\n\t≥≥≥≥ Opção Intalida ≤≤≤≤");
            }
            else {
                if (getMenuInicial() == 1){
                    System.out.println("\n\t•• Verificar Par ou Impar ••\n");

                    System.out.print("Quantos Numeros Quer Verificar: ");
                    setVezesNum(input.nextInt());

                    for (int i = 1; i <= getVezesNum(); i++){
                        System.out.println("\n• Verificação Nº" + i);
                        code.CodeOne();
                    }
                }
            }
        }while (menuInicial != 0);
        System.out.println("\n\tAté a Proxima!\n");
    }
//=====================================================================================================================
    public int getMenuInicial() {
        return menuInicial;
    }
    public void setMenuInicial(int menuInicial) {
        this.menuInicial = menuInicial;
    }

    public int getVezesNum() {
        return vezesNum;
    }
    public void setVezesNum(int vezesNum) {
        this.vezesNum = vezesNum;
    }
//=====================================================================================================================
}
