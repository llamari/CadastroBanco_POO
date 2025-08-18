package Objects.Buttons;

import java.awt.event.KeyEvent;

import javax.swing.JButton;

public class JbConsult extends JButton{
    public JbConsult(){
        setText("Consultar");
        setBounds(35, 190, 100, 23);
        setMnemonic(KeyEvent.VK_S);
    }
}