package Objects.Labels;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class JlNome extends JLabel {
    public JlNome(){
        setText("Nome:");
        setBounds(10, 50, 60, 18);
        setHorizontalAlignment(SwingConstants.RIGHT);
    }
}
