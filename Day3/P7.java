class P7 {
    public static void main(String[] args) {
        String s = "Toyota";
        String t = "Fortuner";
        String u = " Legender";
        String v = "Nexa";
        System.out.println(s.charAt(2));
        System.out.println(s.length());
        System.out.println(s.indexOf("o"));
        System.out.println(s.lastIndexOf("o"));        
        System.out.println(s.startsWith("Toy"));
        System.out.println(s.startsWith("toy"));
        System.out.println(s.endsWith("ta"));
        System.out.println(s.endsWith("yt"));
        System.out.println(s.equals("Toyota"));
        System.out.println(s.equals(t));
        System.out.println(s.equalsIgnoreCase("toyota"));
        System.out.println(u);
        System.out.println(u.trim());
        System.out.println(v.replace('N', 'H'));
        System.out.println(t.substring(0, 7));
        byte b[] = s.getBytes();
        for(int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }    
}
