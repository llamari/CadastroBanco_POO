import javax.swing.ButtonGroup;
import javax.swing.JFrame;

import Objects.JSeparator01;
import Objects.JSeparator02;
import Objects.JrbCorrente;
import Objects.JrbPoupanca;
import Objects.Buttons.JbClose;
import Objects.Buttons.JbConsult;
import Objects.Buttons.JbUpdate;
import Objects.Labels.*;
import Objects.TextFields.*;

import java.awt.*;

public class Janela extends JFrame {
    public Janela(){
        super("Java Swing - Desenvolvimento de Sistemas");
        setSize(400, 255);
        centralizar();
        setResizable(false);
        getContentPane().setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addObjects();
    }

    private void centralizar(){
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension janela = getSize();
        if (janela.height > screen.height) {
            setSize(janela.width, screen.height);
        }
        if (janela.width > screen.width) {
            setSize(screen.width, janela.height);
        }
        setLocation((screen.width - janela.width)/2, (screen.height-janela.height)/2);
    }

    private void addObjects(){
        JlAgencia JlAgencia = new JlAgencia();
        JtfAgencia JtfAgencia = new JtfAgencia();
        JlConta JlConta = new JlConta();
        JtfConta JtfConta = new JtfConta();
        JSeparator01 JSeparator01 = new JSeparator01();
        JlNome JlNome = new JlNome();
        JtfNome JtfNome = new JtfNome();
        JlEndereco JlEndereco = new JlEndereco();
        JtfEndereco JtfEndereco = new JtfEndereco();
        JlTelefone JlTelefone = new JlTelefone();
        JtfTelefone JtfTelefone = new JtfTelefone();
        JlCPF JlCPF = new JlCPF();
        JtfCPF JtfCPF = new JtfCPF();
        JrbCorrente JrbCorrente = new JrbCorrente();
        JrbPoupanca JrbPoupanca = new JrbPoupanca();
        ButtonGroup bgContas = new ButtonGroup();
        bgContas.add(JrbCorrente);
        bgContas.add(JrbPoupanca);
        JSeparator02 JSeparator02 = new JSeparator02();
        JbConsult JbConsult = new JbConsult();
        JbUpdate JbUpdate = new JbUpdate();
        JbClose JbClose = new JbClose();


        getContentPane().add(JlAgencia);
        getContentPane().add(JtfAgencia);
        getContentPane().add(JlConta);
        getContentPane().add(JtfConta);
        getContentPane().add(JSeparator01);
        getContentPane().add(JlNome);
        getContentPane().add(JtfNome);
        getContentPane().add(JlEndereco);
        getContentPane().add(JtfEndereco);
        getContentPane().add(JlTelefone);
        getContentPane().add(JtfTelefone);
        getContentPane().add(JlCPF);
        getContentPane().add(JtfCPF);
        getContentPane().add(JrbCorrente);
        getContentPane().add(JrbPoupanca);
        getContentPane().add(JSeparator02);
        getContentPane().add(JbConsult);
        getContentPane().add(JbUpdate);
        getContentPane().add(JbClose);
    }
}
