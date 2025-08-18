package Objects.Labels;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class JlEndereco extends JLabel {
    public JlEndereco(){
        setText("Endereço:");
        setBounds(10, 75, 60, 18);
        setHorizontalAlignment(SwingConstants.RIGHT);
    }
}
