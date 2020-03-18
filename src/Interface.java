import java.util.Scanner;

public class Interface {

    Codigo code = new Codigo();

    private int menuInicial;

    Scanner input = new Scanner(System.in);
//=====================================================================================================================
    public void Inicio(){
        System.out.println("\n\t∞∞ Par ou Impar ∞∞");
        do {
            System.out.println("\n ≈≈ Menu Inicial ≈≈\n");
            System.out.println("1 - Verificar Par ou Impar");
            System.out.println("0 - Sair");
            System.out.print("\nEscolha Uma Das Opções: ");
            setMenuInicial(input.nextInt());

            if (getMenuInicial() < 0 || getMenuInicial() > 1){
                System.out.println("\n\t≥≥≥≥ Opção Intalida ≤≤≤≤");
            }
            else {
                if (getMenuInicial() == 1){
                    code.CodeOne();
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
//=====================================================================================================================
}
