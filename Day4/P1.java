import java.util.Scanner;

class Student {
    Scanner sc = new Scanner(System.in);
    int rollNo[] = new int[5];
    String name[] = new String[5];
    String city[] = new String[5];
    String mob[] = new String[5];

    int i = 0;

    public void inputDetails() {
        System.out.println("Your roll number is: "+(i+1));
        rollNo[i] = i+1;
        System.out.println("Enter your name: ");
        name[i] = sc.next();
        System.out.println("Enter your city: ");
        city[i] = sc.next();
        System.out.println("Enter your mobile number: ");
        mob[i] = sc.next();

        i++;
    }

    public void showDetails() {
        System.out.println("Enter your roll number: ");
        int check = sc.nextInt();
        for(int a = 0; a < i; a++) {
            if(check - 1 == a) {
                System.out.println("Roll number\t Name \t City \t Mobile number \t");
                System.out.println("----------------------------------------------");
                System.out.println(rollNo[a]+"\t"+name[a]+"\t"+city[a]+"\t"+mob[a]);
            }
        }
    }

    public void updateDetails() {
        System.out.println("Enter your roll number: ");
        int check = sc.nextInt();
        for(int a = 0; a < i; a++) {
            if(check -1 == a) {
                System.out.println("Enter Choice: \n1. Update Name \n2. Update City \n3. Update Mobile number \n4. Cancel");
                int n = sc.nextInt();
                switch(n) {
                    case 1: System.out.println("Enter new name: ");
                    name[a] = sc.next();
                    break;

                    case 2: System.out.println("Enter new city: ");
                    city[a] = sc.next();
                    break;

                    case 3: System.out.println("Enter new mobile number: ");
                    mob[a] = sc.next();
                    break;

                    case 4: System.out.println("Operation cancelled");
                    break;
                }
            }
        }
    }

    public void deleteDetails() {
        System.out.println("Enter your roll number: ");
        int check = sc.nextInt();
        for(int a = 0; a < i; a++) {
            if(check -1 == a) {
                System.out.println("Confirm!!!(yes/no)"); 
                String confirm = sc.next();
                if(confirm.equals("yes")) {
                    rollNo[a] = rollNo[a+1];
                    city[a] = city[a+1];
                    name[a] = name[a+1];
                    mob[a] = mob[a+1];
                    System.out.println("Data deleted successfully");
                } else {
                    System.out.println("Error!!");
                }
            }
        }
    }
}

class P1 {
    public static void main(String[] args) {
        Student st = new Student();
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Enter Choice: \n1. Enter details \n2. Show details \n3. Update details \n4. Delete details \n5. Exit");
            int choice = sc.nextInt();
            switch(choice) {
                case 1: st.inputDetails();
                break;

                case 2: st.showDetails();
                break;

                case 3: st.updateDetails();
                break;

                case 4: st.deleteDetails();
                break;

                case 5: System.exit(0);

                default: System.out.println("Enter valid choice");
            }
        }
    }
    
}