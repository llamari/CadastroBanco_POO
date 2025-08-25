package Form_Components;
import java.text.ParseException;

import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.text.MaskFormatter;

public class CPF extends JPanel {
    JLabel JlCPF = new JLabel();
    JFormattedTextField JtfCPF;


    public CPF() {
        setLayout(null);
        setBounds(10, 125, 425, 20);

        JlCPF.setText("CPF:");
        JlCPF.setBounds(0, 0, 60, 18);
        JlCPF.setHorizontalAlignment(SwingConstants.RIGHT);

        try {
            MaskFormatter mask = new MaskFormatter("###.###.###-##");
            mask.setPlaceholderCharacter('_'); 
            JtfCPF = new JFormattedTextField(mask);
        } catch (ParseException e) {
            e.printStackTrace();
            JtfCPF = new JFormattedTextField();
        }

        JtfCPF.setBounds(65, 0, 300, 20);

        add(JlCPF);
        add(JtfCPF);
    }

    public void setCpf(String cpf) {
        JtfCPF.setText(cpf);
    }

    public String getCpf() {
        return JtfCPF.getText();
    }
}
