package Objects;

import java.awt.event.KeyEvent;

import javax.swing.JRadioButton;

public class JrbPoupanca extends JRadioButton {
    public JrbPoupanca(){
        setText("Conta Poupança");
        setBounds(225, 150, 118, 20);
        setMnemonic(KeyEvent.VK_P);
    }
}
