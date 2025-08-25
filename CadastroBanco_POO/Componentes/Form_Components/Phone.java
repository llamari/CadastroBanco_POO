package Form_Components;

import java.text.ParseException;

import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.text.MaskFormatter;

public class Phone extends JPanel {
    JLabel JlTelefone = new JLabel();
    JFormattedTextField JtfTelefone;

    public Phone() {
        setLayout(null);
        setBounds(10, 100, 425, 20);

        JlTelefone.setText("Telefone:");
        JlTelefone.setBounds(0, 0, 60, 18);
        JlTelefone.setHorizontalAlignment(SwingConstants.RIGHT);

        try {
            MaskFormatter mask = new MaskFormatter("(##) #####-####");
            mask.setPlaceholderCharacter('_');
            JtfTelefone = new JFormattedTextField(mask);
        } catch (ParseException e) {
            e.printStackTrace();
            JtfTelefone = new JFormattedTextField();
        }

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
