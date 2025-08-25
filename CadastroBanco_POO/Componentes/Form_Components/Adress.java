package Form_Components;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Adress extends JPanel {
    JLabel JlEndereco = new JLabel();
    JTextField JtfEndereco = new JTextField();

    public Adress(){
        setLayout(null);
        setBounds(10, 75, 425, 20);

        JlEndereco.setText("Endereço:");
        JlEndereco.setBounds(0, 0, 60, 18);
        JlEndereco.setHorizontalAlignment(SwingConstants.RIGHT);

        JtfEndereco.setBounds(65, 0, 300, 20);

        add(JlEndereco);
        add(JtfEndereco);
    }

    public void setAdress(String adress){
        JtfEndereco.setText(adress);
    }

    public String getAdress(){
        return JtfEndereco.getText();
    }
}
