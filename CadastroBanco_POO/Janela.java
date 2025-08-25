    import javax.swing.JFrame;

    import Functions.Accounts;
    import Functions.Functions;

    import java.awt.*;

    public class Janela extends JFrame {
        Forms forms = new Forms();
        Functions functions = new Functions();

        public Janela() {
            super("Java Swing - Desenvolvimento de Sistemas");
            setSize(400, 255);
            centralizar();
            setResizable(false);
            getContentPane().setLayout(null);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            addObjects();
            functions.initializeAccounts();
        }

        private void centralizar() {
            Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
            Dimension janela = getSize();
            if (janela.height > screen.height) {
                setSize(janela.width, screen.height);
            }
            if (janela.width > screen.width) {
                setSize(screen.width, janela.height);
            }
            setLocation((screen.width - janela.width) / 2, (screen.height - janela.height) / 2);
        }

        private void addObjects() {
            JSeparator01 JSeparator02 = new JSeparator01(180);
            Buttons buttons = new Buttons(this::onConsult, this::onUpdate);

            getContentPane().add(forms);
            getContentPane().add(JSeparator02);
            getContentPane().add(buttons);

            buttons.revalidate();
            buttons.repaint();

            getContentPane().revalidate();
            getContentPane().repaint();
        }

        private void onConsult() {
            String agencyNumber = forms.getAgencyNumber();
            String accountNumber = forms.getAccountNumber();
            System.out.println("Consulting account details...");
            Accounts account = functions.getAccountDetails(accountNumber, agencyNumber);
            System.out.println("Account Details: " + (account != null ? account.getAdress() : "No account found"));
            forms.setAccount(account);
        }

        private void onUpdate() {
            String agencyNumber = forms.getAgencyNumber();
            String accountNumber = forms.getAccountNumber();
            String name = forms.Nome.getName();
            String adress = forms.Endereco.getAdress();
            String phone = forms.Telefone.getPhone();
            String cpf = forms.Cpf.getCpf();
            String type = forms.TipoConta.getAccountType();

            functions.updateAccount(agencyNumber, accountNumber, name, adress, phone, cpf, type);
        }
    }
