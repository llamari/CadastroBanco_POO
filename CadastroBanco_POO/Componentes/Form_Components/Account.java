package Form_Components;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Account extends JPanel {
    JLabel JlConta = new JLabel();
    JTextField JtfConta = new JTextField();

    public Account() {
        setLayout(null);
        setBounds(205, 10, 285, 20); // define posição e tamanho do painel

        JlConta.setText("Número da Conta");
        JlConta.setBounds(0, 0, 105, 18);

        JtfConta.setBounds(110, 0, 60, 20);

        add(JlConta);
        add(JtfConta);
    }

    public String getAccountNumber() {
        return JtfConta.getText();
    }
}
