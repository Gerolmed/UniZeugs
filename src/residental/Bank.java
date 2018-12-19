package residental;

import oversea.OverseaAccount;

public class Bank {
    public Account[] accounts;

    public Bank(int size) {
        accounts = new Account[size];
    }

    public boolean add(Account account) {
        for(int i = 0; i < accounts.length; i++) {
            if(accounts[i] == null) {
                accounts[i] = account;
                return true;
            }
        }

        return false;
    }

    public void enlargeBank(int num) {
        Account[] newAccounts = new Account[accounts.length+num];

        for(int i = 0; i < accounts.length; i++) {
            newAccounts[i] = accounts[i];
        }

        accounts = newAccounts;
    }

    public Account get(String name) {
        for(Account account : accounts)
            if(account != null && account.getName().equals(name))
                return account;
        return null;
    }

    public double getDirtyMoneyFee() {
        double totalFee = 0;
        for(Account account : accounts)
            if(account instanceof OverseaAccount)
                totalFee += ((OverseaAccount) account).getFee();
        return totalFee;
    }
}
