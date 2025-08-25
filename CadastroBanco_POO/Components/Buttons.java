import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Buttons extends JPanel {
    JButton JbConsult = new JButton();
    JButton JbUpdate = new JButton();
    JButton JbClose = new JButton();

    public Buttons(Runnable onConsult, Runnable onUpdate) {
        setLayout(null);
        setBounds(25, 190, 335, 35);

        JbConsult.setText("Consultar");
        JbConsult.setBounds(0, 0, 100, 23);
        JbConsult.setMnemonic(KeyEvent.VK_S);

        JbUpdate.setText("Atualizar");
        JbUpdate.setBounds(115, 0, 100, 23);
        JbUpdate.setMnemonic(KeyEvent.VK_A);
        JbUpdate.setEnabled(false);

        JbClose.setText("Fechar");
        JbClose.setBounds(230, 0, 100, 23);
        JbClose.setMnemonic(KeyEvent.VK_F);

        add(JbClose);
        add(JbConsult);
        add(JbUpdate);

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
    }
}
