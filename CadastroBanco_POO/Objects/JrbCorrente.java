package Objects;

import java.awt.event.KeyEvent;

import javax.swing.JRadioButton;

public class JrbCorrente extends JRadioButton {
    public JrbCorrente(){
        setText("Conta Corrente");
        setBounds(100, 150, 111, 20);
        setMnemonic(KeyEvent.VK_C);
        setSelected(true);
    }
}
