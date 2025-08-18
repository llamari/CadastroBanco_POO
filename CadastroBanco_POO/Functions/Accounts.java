package Functions;

public class Accounts {
    private String agencyNumber;
    private String accountNumber;
    private String Name;
    private String Adress;
    private String PhoneNumber;
    private String Cpf;
    private String Type;

    public Accounts(String agencyNumber, String accountNumber, String name, String adress, String phoneNumber, String cpf, String type) {
        this.agencyNumber = agencyNumber;
        this.accountNumber = accountNumber;
        Name = name;
        Adress = adress;
        PhoneNumber = phoneNumber;
        Cpf = cpf;
        Type = type;
    }

    public void EditAccount(String agencyNumber, String accountNumber, String name, String adress, String phoneNumber, String cpf, String type) {
        this.agencyNumber = agencyNumber;
        this.accountNumber = accountNumber;
        Name = name;
        Adress = adress;
        PhoneNumber = phoneNumber;
        Cpf = cpf;
        Type = type;
    }

    public String getAgencyNumber() { return agencyNumber; }
    public String getAccountNumber() { return accountNumber; }
    public String getName() { return Name; }
    public String getAdress() { return Adress; }
    public String getPhoneNumber() { return PhoneNumber; }
    public String getCpf() { return Cpf; }
    public String getType() { return Type; }

    public void setName(String name) { Name = name; }
    public void setAdress(String adress) { Adress = adress; }
    public void setPhoneNumber(String phoneNumber) { PhoneNumber = phoneNumber; }
    public void setCpf(String cpf) { Cpf = cpf; }
    public void setType(String type) { Type = type; }
}
