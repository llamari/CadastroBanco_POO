package Form_Components;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Name extends JPanel {
    JLabel JlNome = new JLabel();
    JTextField JtfNome = new JTextField();

    public Name(String name) {
        setLayout(null);
        setBounds(10, 50, 365, 20); 
        JlNome.setText("Nome:");
        JlNome.setBounds(00, 0, 60, 18);
        JlNome.setHorizontalAlignment(SwingConstants.RIGHT);

        JtfNome.setText(name);
        JtfNome.setBounds(65, 0, 300, 20);
        add(JlNome);
        add(JtfNome);
    }

    public void setName(String name) {
        JtfNome.setText(name);
    }

    public String getName() {
        return JtfNome.getText();
    }
}
