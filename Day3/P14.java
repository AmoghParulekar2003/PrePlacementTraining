class P14 {
    public static void main(String[] args) {
        String s1 = "toyota";
        String rem = "o";
        int sl1 = s1.length();
        char res[] = new char[s1.length()];

        for(int i = 0; i < sl1; i++) {
            if (s1.charAt(i) != rem.charAt(0) ) {
                res[i] = s1.charAt(i);
            }
        }
        String result = new String(res);
        System.out.println(result);
    }
        
}

 

