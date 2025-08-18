package Form_Components;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Phone extends JPanel {
    JLabel JlTelefone = new JLabel();
    JTextField JtfTelefone = new JTextField();

    public Phone(){
        setLayout(null);
        setBounds(10, 100, 425, 20);

        JlTelefone.setText("Telefone:");
        JlTelefone.setBounds(0, 0, 60, 18);
        JlTelefone.setHorizontalAlignment(SwingConstants.RIGHT);

        JtfTelefone.setBounds(65, 0, 300, 20);

        add(JlTelefone);
        add(JtfTelefone);
    }

    public void setPhone(String phone) {
        JtfTelefone.setText(phone);
    }

    public String getPhone() {
        return JtfTelefone.getText();
    }
}
