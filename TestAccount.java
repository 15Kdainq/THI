import com.sun.javafx.css.CssError;

import java.util.Scanner;

public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account();

        Scanner ip= new Scanner(System.in);
        account.input();

        int type = -1;
        boolean isContinue = true;
        do {
            System.out.println("Ban muon gui tien(0) hay rut tien(1):");
            long amount = 0;
            type= ip.nextInt();
            if(type == 0){
                System.out.println("Hay nhap so tien muon gui:");
                amount = ip.nextLong();
                if (amount > 0){
                    account.DepositAndWithdraw(amount, type);
                    account.toString();
                } else {
                    type = -1;
                    isContinue = false;
                    System.out.println("So tien khong gui hop le");
                }
            }else if (type == 1){
                System.out.println("Hay nhap so tien muon rut:");
                amount = ip.nextLong();
                if (amount > 0 && amount < account.getAmount()) {
                    account.DepositAndWithdraw(amount, type);
                    account.toString();
                } else {
                    type = -1;
                    isContinue = false;
                    System.out.println("So tien khong rut hop le");
                }
            }
        } while((type != 0 || type != 1) && !isContinue);
        System.out.println(account);
    }
}
