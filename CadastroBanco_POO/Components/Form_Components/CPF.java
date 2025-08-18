package Form_Components;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CPF extends JPanel {
    JLabel JlCPF = new JLabel();
    JTextField JtfCPF = new JTextField();

    public CPF() {
        setLayout(null);
        setBounds(10, 125, 425, 20);

        JlCPF.setText("CPF:");
        JlCPF.setBounds(0, 0, 60, 18);
        JlCPF.setHorizontalAlignment(SwingConstants.RIGHT);

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
