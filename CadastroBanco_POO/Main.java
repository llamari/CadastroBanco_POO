import Functions.Functions;

public class Main {
    public static void main(String[] args) {
        Functions functions = new Functions();
        functions.initializeAccounts();
        Janela janela = new Janela();
        janela.setVisible(true);
    }
}