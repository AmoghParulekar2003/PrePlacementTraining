import java.util.Scanner;

abstract class BankAccount {
    Scanner sc = new Scanner(System.in);
    int c_accno[] = new int[5];
    String c_name[] = new String[5];
    String c_city[] = new String[5];
    int c_balance[] = new int[5];
    String account[] = new String[5];
    int i = 0;

    void inputData() {
        System.out.println("Your accont number is: "+(i+1));
        c_accno[i] = i+1;
        System.out.println("Enter your name: ");
        c_name[i] = sc.next();
        System.out.println("Enter your city: ");
        c_city[i] = sc.next();
        System.out.println("Enter account type: ");
        account[i] = sc.next();
        System.out.println("Enter amount to be deposited for creating account: ");
        c_balance[i] = sc.nextInt();

        i++;
    }

    void display() {
        System.out.println("Enter your account number: ");
        int check = sc.nextInt();
        for(int a = 0; a < i; a++) {
            if(check - 1 == a) {
                System.out.println("Account number\t Name \t City \t Account type \t Balance \t");
                System.out.println("-----------------------------------------------------------");
                System.out.println(c_accno[a]+"\t"+c_name[a]+"\t"+c_city[a]+"\t"+account[a]+"\t"+c_balance[a]);
            }
        }
    }

    abstract void deposit(); 

    abstract void withdraw();
}

class SavingsAccount extends BankAccount {
    void withdraw() {
        System.out.println("Enter your account number: ");
        int check = sc.nextInt();
        for(int a = 0; a < i; a++) {
            if(check - 1 == a) {
                if(account[a].equals("savings") && c_balance[a] < 1000) {
                    System.out.println("Money cannot be withdrawn");
                } else {
                    System.out.println("Enter amount to be withdrawn: ");
                    int with = sc.nextInt();
                    c_balance[a] = c_balance[a] - with;
                }
            }
        }
    }

    void deposit() {
        System.out.println("Enter your account number: ");
        int check = sc.nextInt();
        for(int a = 0; a < i; a++) {
            if(check - 1 == a) {
                System.out.println("Enter amount to be deposited: ");
                int depo = sc.nextInt();
                c_balance[a] = c_balance[a] + depo;
            }
        }
    }
}

class CurrentAccount extends BankAccount {
    void withdraw() {
        System.out.println("Enter your account number: ");
        int check = sc.nextInt();
        for(int a = 0; a < i; a++) {
            if(check - 1 == a) {
                System.out.println("Enter amount to be withdrawn: ");
                int with = sc.nextInt();
                c_balance[a] = c_balance[a] - with;
            }
            }
        }

    void deposit() {
        System.out.println("Enter your account number: ");
        int check = sc.nextInt();
        for(int a = 0; a < i; a++) {
            if(check - 1 == a) {
                System.out.println("Enter amount to be deposited: ");
                int depo = sc.nextInt();
                c_balance[a] = c_balance[a] + depo;
            }
        }
    }
}

class Interest1 extends SavingsAccount {
    void calcInterest() {
        System.out.println("Enter your account number: ");
        int check = sc.nextInt();
        System.out.println("Your interest will be of 4% on your balance");
        for(int a = 0; a < i; a++) {
            if(check - 1 == a) {
                int interest = c_balance[a] * 4/100;
                System.out.println("Your interest is: "+interest);
            }
        }
    }
}

class Interest2 extends CurrentAccount {
    void calcInterest() {
        System.out.println("Enter your account number: ");
        int check = sc.nextInt();
        System.out.println("Your interest will be of 2% on your balance");
        for(int a = 0; a < i; a++) {
            if(check - 1 == a) {
                int interest = c_balance[a] * 2/100;
                System.out.println("Your interest is: "+interest);
            }
        }
    }
}

public class P10 {
    public static void main(String[] args) {
        //BankAccount ba = new BankAccount();
        SavingsAccount sa = new SavingsAccount();
        CurrentAccount ca = new CurrentAccount();
        Interest1 i1 = new Interest1();
        Interest2 i2 = new Interest2();

        Scanner sc = new Scanner(System.in);

        String type;

        while(true) {
            System.out.println("Enter your choice: \n1. Input Data \n2. Show Balance \n3. Deposit money \n4. Withdraw money \n5. Calculate interest \n6. Exit");
            int choice = sc.nextInt();

            switch(choice) {
                case 1:
                System.out.println("Enter account type: ");
                type = sc.next();
                if(type.equals("savings")) {
                    i1.inputData();
                } else {
                    i2.inputData();
                }
                break;

                case 2:
                System.out.println("Enter account type: ");
                type = sc.next();
                if(type.equals("savings")) {
                    i1.display();
                } else {
                    i2.display();
                }
                break;

                case 3:
                System.out.println("Enter account type: ");
                type = sc.next();
                if(type.equals("savings")) {
                    i1.deposit();
                } else {
                    i2.deposit();
                }
                break;

                case 4: 
                System.out.println("Enter account type: ");
                type = sc.next();
                if(type.equals("savings")) {
                    i1.withdraw();
                } else {
                    i2.withdraw();;
                }
                break;

                case 5:
                System.out.println("Enter account type: ");
                type = sc.next();
                if(type.equals("savings")) {
                    i1.calcInterest();
                } else {
                    i2.calcInterest();
                }
                break;

                case 6: System.exit(0);
                break;

                default: System.out.println("Select valid operation");
                break;
            }
        }
    }    
}

