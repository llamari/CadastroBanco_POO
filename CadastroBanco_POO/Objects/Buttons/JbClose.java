package Objects.Buttons;

import java.awt.event.KeyEvent;

import javax.swing.JButton;

public class JbClose extends JButton{
    public JbClose(){
        setText("Fechar");
        setBounds(225, 190, 100, 23);
        setMnemonic(KeyEvent.VK_F);
    }
}
