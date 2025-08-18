package Form_Components;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Agency extends JPanel {
    JLabel JlAgencia = new JLabel();
    JTextField JtfAgencia = new JTextField();

    public Agency() {
        setLayout(null);
        setBounds(0, 0, 200, 30);

        JlAgencia.setText("Código da Agência");
        JlAgencia.setBounds(10, 10, 110, 18);

        JtfAgencia.setBounds(125, 10, 50, 20);

        add(JlAgencia);
        add(JtfAgencia);
    }

    public String getAgencyNumber() {
        return JtfAgencia.getText();
    }
}
