package Objects.Buttons;

import java.awt.event.KeyEvent;

import javax.swing.JButton;

public class JbUpdate extends JButton {
    public JbUpdate(){
        setText("Atualizar");
        setBounds(145, 190, 100, 23);
        setMnemonic(KeyEvent.VK_A);
        setEnabled(false);
    }
}
