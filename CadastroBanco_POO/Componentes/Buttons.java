import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Buttons extends JPanel {
    JButton JbConsult = new JButton();
    JButton JbUpdate = new JButton();
    JButton JbClose = new JButton();
    JButton JbCreate = new JButton();

    public Buttons(Runnable onConsult, Runnable onUpdate, Runnable onCreate) {
        setLayout(null);
        setBounds(25, 190, 335, 35);

        JbConsult.setText("Consultar");
        JbConsult.setBounds(0, 0, 80, 23);
        JbConsult.setMnemonic(KeyEvent.VK_S);

        JbUpdate.setText("Atualizar");
        JbUpdate.setBounds(85, 0, 80, 23);
        JbUpdate.setMnemonic(KeyEvent.VK_A);
        JbUpdate.setEnabled(false);

        JbCreate.setText("Criar");
        JbCreate.setBounds(170, 0, 80, 23);
        JbCreate.setMnemonic(KeyEvent.VK_C);

        JbClose.setText("Fechar");
        JbClose.setBounds(260, 0, 80, 23);
        JbClose.setMnemonic(KeyEvent.VK_F);
        
        add(JbClose);
        add(JbConsult);
        add(JbUpdate);
        add(JbCreate);

        JbConsult.revalidate();
        JbConsult.repaint();
        JbConsult.revalidate();
        JbConsult.repaint();
        JbConsult.revalidate();
        JbConsult.repaint();

        new Timer(100, e -> {
            revalidate();
            repaint();
        }).start();

        JbConsult.addActionListener(e -> {
            onConsult.run();
            JbUpdate.setEnabled(true);
            revalidate();
            repaint();
        });

        JbUpdate.addActionListener(e -> {
            onUpdate.run();
        });

        JbClose.addActionListener(e -> {
            System.exit(0);
        });

        JbCreate.addActionListener(e -> {
            onCreate.run();
        });
    }

    public JButton getJbUpdate() {
        return JbUpdate;
    }
}
