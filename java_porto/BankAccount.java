import java.util.Scanner;
import java.util.function.IntBinaryOperator;

// A. Constructor and Encapsulation challenge:
// a. Buatlah sebuah Class dengan nama BankAccount
// b. Pada Class tersebut, buatlah attribute berupa accountNumber,
// balance, customerName, customerEmail dan customerPhone
// c. Buatlah getter dan setter untuk setiap attribute
// d. Buatlah constructor untuk memberikan initial value pada
// attribute-attribute tersebut
// e. Buatlah dua buah method untuk melakukan deposit dan
// withdraw balance
// f. Method deposit akan menambah balance customer
// g. Method withdraw akan mengurangi balance customer, namun
// apabila jumlah yang di withdraw lebih besar dari nilai balance,
// print error message (“Saldo tidak mencukupi”)
// h. Buatlah sebuah Class dan main method untuk mencoba Class
// yang dibuat

public class BankAccount {
    private String accountNumber, customerName, customerEmail, customerPhone;
    // private String accNumber, custName, custEmail, custPhone;
    int balance, theBalance, depo, theDepo, draw, theDraw;

    public BankAccount() {
        accountNumber = "12345";
        customerName = "Customer A";
        customerEmail = "customer_a_@email.com";
        customerPhone = "081234567890";
        balance = 1000000;
        depo = 0;
        draw = 0;
    }

    // getter
    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    // setter
    public void setAccountNumber(String accNumber) {
        this.accountNumber = accNumber;
    }

    public void setBalance(int theBalance) {
        this.balance = theBalance;
    }

    public void setCustomerName(String custName) {
        this.customerName = custName;
    }

    public void setCustomerEmail(String custEmail) {
        this.customerEmail = custEmail;
    }

    public void setCustomerPhone(String custPhone) {
        this.customerPhone = custPhone;
    }

    // method deposit
    public int Deposit(int theDepo) {
        this.depo = theDepo;
        System.out.println("Deposit Amount : " + this.depo);
        this.balance += this.depo;
        System.out.println("Balance after Deposit : " + this.balance);
        return this.balance;
    }

    // method withdraw
    public int Withdraw(int theDraw) {
        this.draw = theDraw;
        System.out.println("Withdraw Amount : " + this.draw);
        if (this.draw > this.balance) {
            System.out.println("***The Balance is not sufficient***");
            System.out.println("Current Balance : " + this.balance);
        } else {
            this.balance -= this.draw;
            System.out.println("Balance after Withdraw : " + this.balance);
        }
        return this.balance;
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();

        // setter
        acc1.setCustomerName("Badut");
        acc1.setCustomerEmail("customer_b_@email.com");
        acc1.setCustomerPhone("085123456789");
        acc1.setAccountNumber("B0B0B0");
        acc1.setBalance(2000000);

        // getter
        System.out.println("=========ACCOUNT INFORMATION=========");
        System.out.println("Customer Name : " + acc1.getCustomerName());
        System.out.println("Customer Email : " + acc1.getCustomerEmail());
        System.out.println("Customer Phone : " + acc1.getCustomerPhone());
        System.out.println("Account Number : " + acc1.getAccountNumber());
        System.out.println("Current Balance : " + acc1.getBalance());
        System.out.println("=========DEPOSIT=========");
        acc1.Deposit(1000000);
        System.out.println("=========SUCCESS WITHDRAW=========");
        acc1.Withdraw(2000000);
        System.out.println("=========FAILED WITHDRAW=========");
        acc1.Withdraw(3000000);

    }
}
