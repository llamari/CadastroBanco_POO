package Form_Components;

import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class AccountType extends JPanel {
    JRadioButton JrbCorrente = new JRadioButton();
    JRadioButton JrbPoupanca = new JRadioButton();
    ButtonGroup group = new ButtonGroup();

    public AccountType() {
        setLayout(null);
        setBounds(100, 150, 354, 20);

        JrbCorrente.setText("Conta Corrente");
        JrbCorrente.setBounds(0, 0, 111, 20);
        JrbCorrente.setMnemonic(KeyEvent.VK_C);
        JrbCorrente.setSelected(true);

        JrbPoupanca.setText("Conta Poupança");
        JrbPoupanca.setBounds(125, 0, 118, 20);
        JrbPoupanca.setMnemonic(KeyEvent.VK_P);

        group.add(JrbCorrente);
        group.add(JrbPoupanca);

        add(JrbCorrente);
        add(JrbPoupanca);
    }

    public void setAccountType(String type) {
        if (type.equalsIgnoreCase("Corrente")) {
            JrbCorrente.setSelected(true);
        } else if (type.equalsIgnoreCase("Poupança")) {
            JrbPoupanca.setSelected(true);
        }
    }

    public String getAccountType() {
        return JrbCorrente.isSelected() ? "Corrente" : "Poupança";
    }
}
