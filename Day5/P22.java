class P22 {
    public static void main(String[] args) {
        String a = "aabbbbeeeeffggg";
        int c = 1;
        String res = "";
        int j, i = 0;
        while(i < a.length()) {
            for(j = i+1; j < a.length(); j++) {
                if(a.charAt(j-1) == a.charAt(j)) {
                    c++;
                } else {
                        break;
                }
            }
            i=j;
            c = 1;
            res = res + a.charAt(j-1) + c;
        }
        System.out.println(res);
    }
}

