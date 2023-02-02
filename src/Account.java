import java.util.Date;

public class Account {
    String accountNumber;
    String userNameofAccountHolder;
    String accountType;
    Date accountOpeningDate;

    public Account(String accountNumber, String userNameofAccountHolder, String accountType, Date accountOpeningDate) {
        this.accountNumber = accountNumber;
        this.userNameofAccountHolder = userNameofAccountHolder;
        this.accountType = accountType;
        this.accountOpeningDate = accountOpeningDate;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getUserNameofAccountHolder() {
        return userNameofAccountHolder;
    }

    public void setUserNameofAccountHolder(String userNameofAccountHolder) {
        this.userNameofAccountHolder = userNameofAccountHolder;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Date getAccountOpeningDate() {
        return accountOpeningDate;
    }

    public void setAccountOpeningDate(Date accountOpeningDate) {
        this.accountOpeningDate = accountOpeningDate;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", userNameofAccountHolder='" + userNameofAccountHolder + '\'' +
                ", accountType='" + accountType + '\'' +
                ", accountOpeningDate=" + accountOpeningDate +
                '}';
    }
}
