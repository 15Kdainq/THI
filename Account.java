import java.util.Scanner;
public class Account {
    String CustomerCode;
    String CustomerName;
    int accNumber;
    long amount;
    public void input(){
        Scanner ip = new Scanner(System.in);
        boolean isValid = true;
        do {
            isValid = true;
            System.out.println("CustomerCode is: ");
            String customerCode =ip.nextLine();
            if (customerCode.length() >= 5){
                this.CustomerCode = customerCode;
            } else {
                isValid = false;
                System.out.println("Please re-enter CustomerCode(CustomerCode>5):");
                continue;
            }
            System.out.println("CustomerName is: ");
            CustomerName =ip.nextLine();

            System.out.println("accNumber is: ");
            int accNumber = Integer.parseInt(ip.nextLine());
            if (accNumber>=100000 && accNumber<101000){
                this.accNumber = accNumber;
            }else{
                isValid = false;
                System.out.println("Please re-enter accNumber (accNumber must be a positive number with 6 digits and starts with ‘100’ ):");
                continue;
            }
            
            System.out.println("amount is: ");
            long amount = Long.parseLong(ip.nextLine());
            this.amount = amount;
        } while(!isValid);
    }
    public String getCustomerCode() {
        return CustomerCode;
    }

    public void setCustomerCode(String customerCode) {
        CustomerCode = customerCode;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public long getAmount() {
        return amount;
    }

    public void DepositAndWithdraw(long amount, int type){
        switch (type){
            case 0:
                // deponsit
                this.amount += amount;
                break;
            case 1:
                // withdraw
                this.amount -= amount;
                break;
            default:
                break;
        }
    }
    @Override
    public String toString() {
        return "Customer{" +
                "CustomerCode='" + CustomerCode + '\'' +
                ", CustomerName='" + CustomerName + '\'' +
                ", accNumber=" + accNumber +
                ", amount=" + amount +
                '}';

    }
}
