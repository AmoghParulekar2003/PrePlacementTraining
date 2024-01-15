//Accept character and check if vowel or not

import java.util.Scanner;

class P13 {
    public static void main(String[] args) {
        System.out.println("Enter alphabet: ");
        Scanner sc = new Scanner(System.in);
        char alpha = sc.next().charAt(0);


        if (alpha == 'a' || alpha == 'e' || alpha == 'i' || alpha == 'o' || alpha == 'u')
            System.out.println("Vowel");
        else 
            System.out.println("Consonents");
    }    
}
