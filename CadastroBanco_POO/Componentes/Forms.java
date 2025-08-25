import javax.swing.JPanel;

import Form_Components.Account;
import Form_Components.AccountType;
import Form_Components.Adress;
import Form_Components.Agency;
import Form_Components.CPF;
import Form_Components.Name;
import Form_Components.Phone;
import Functions.Accounts;

public class Forms extends JPanel {
    Agency Agencia = new Agency();
    Account Conta = new Account();
    JSeparator01 JSeparator01 = new JSeparator01(40);
    Name Nome = new Name();
    Adress Endereco = new Adress();
    Phone Telefone = new Phone();
    CPF Cpf = new CPF();
    AccountType TipoConta = new AccountType();

    public Forms() {
        setLayout(null);
        setBounds(0, 0, 400, 300);
        addObjects();
    }

    public boolean isFormValid() {
        return !Agencia.getAgencyNumber().isEmpty() && !Conta.getAccountNumber().isEmpty() && !Nome.getName().isEmpty() && !Endereco.getAdress().isEmpty() && !Telefone.getPhone().isEmpty() && !Cpf.getCpf().isEmpty() && !TipoConta.getAccountType().isEmpty();
    }

    private void addObjects() {
        add(Agencia);
        add(Conta);
        add(JSeparator01);
        add(Nome);
        add(Endereco);
        add(Telefone);
        add(Cpf);
        add(TipoConta);
    }

    public String getAgencyNumber() {
        return Agencia.getAgencyNumber();
    }

    public String getAccountNumber() {
        return Conta.getAccountNumber();
    }

    public void setAccount(Accounts account){
        Nome.setName(account.getName());
        Endereco.setAdress(account.getAdress());
        Telefone.setPhone(account.getPhoneNumber());
        Cpf.setCpf(account.getCpf());
        TipoConta.setAccountType(account.getType());
    }
}
