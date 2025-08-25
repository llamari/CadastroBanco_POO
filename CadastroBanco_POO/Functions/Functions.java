package Functions;

import java.util.ArrayList;

public class Functions {
    ArrayList<Accounts> accountsList = new ArrayList<>();

    public void initializeAccounts() {
        accountsList.add(new Accounts("1234", "56789", "Sara Lamari", "Rua ABC, 123", "(19) 98328-9665", "12345678901",
                "Corrente"));
        accountsList.add(new Accounts("2345", "67890", "Thiago Mattos", "Rua DEF, 456", "(19) 98765-4321",
                "23456789012", "Poupança"));
        accountsList.add(new Accounts("3456", "78901", "Pedro Marinho", "Rua GHI, 789", "(19) 91234-5678",
                "34567890123", "Corrente"));
        accountsList.add(new Accounts("4567", "89012", "Beatriz Vinguerti", "Rua JKL, 101", "(19) 99876-5432",
                "45678901234", "Poupança"));
        accountsList.add(new Accounts("5678", "90123", "Felipe Dinnouti", "Rua MNO, 202", "(19) 97654-3210",
                "56789012345", "Corrente"));
        accountsList.add(new Accounts("6789", "01234", "Vitor Paiva", "Rua PQR, 303", "(19) 96543-2109", "67890123456",
                "Poupança"));
    }

    public Accounts getAccountDetails(String accountNumber, String agencyNumber) {
        for (Accounts account : accountsList) {
            if ((accountNumber != null && account.getAccountNumber().equals(accountNumber)) &&
                    (agencyNumber != null && account.getAgencyNumber().equals(agencyNumber))) {
                System.out.println("Account found: " + account);
                return account;
            }
        }
        return new Accounts(agencyNumber, accountNumber, "", "", "", "", "");
    }

    public void updateAccount(String agencyNumber, String accountNumber, String name, String adress, String phoneNumber,
            String cpf, String type) {
        for (Accounts account : accountsList) {
            if (account.getAccountNumber().equals(accountNumber) && account.getAgencyNumber().equals(agencyNumber)) {
                account.setName(name);
                account.setAdress(adress);
                account.setPhoneNumber(phoneNumber);
                account.setCpf(cpf);
                account.setType(type);
                return;
            }
        }
    }

    public void addAccount(String agencyNumber, String accountNumber, String name, String adress, String phoneNumber,
            String cpf, String type) {

        for (Accounts account : accountsList) {
            if (account.getAccountNumber().equals(accountNumber) && account.getAgencyNumber().equals(agencyNumber)) {
                account.setName(name);
                account.setAdress(adress);
                account.setPhoneNumber(phoneNumber);
                account.setCpf(cpf);
                account.setType(type);
                return;
            }
        }
        Accounts account = new Accounts(agencyNumber, accountNumber, name, adress, phoneNumber, cpf, type);
        accountsList.add(account);
    }
}
