class P13 {
    public static void main(String[] args) {
        String s1 = "earth";
        String s2 = "heart";
        int sl1 = s1.length();
        int sl2 = s2.length();
        int temp = 0;

        if(sl1 != sl2) {
            System.out.println("Anagram not possible");
        } else {
            for(int i = 0; i < sl1; i++) {
                for(int j = 0; j < sl2; j++) {
                    if (s1.charAt(i) == s2.charAt(j)) {
                        temp++;
                    } else {
                        continue;
                    }
                }
            }
            if(temp == sl1) {
                System.out.println("Its an Anagram");
            } else {
                System.out.println("Anagram not possible");
            }
        }
    }    
}
