class P1 {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = a / b;
            System.out.println("Result: "+(a+b));
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Result: "+(5+6));
        }
        catch(NumberFormatException fe) {
            System.out.println("Result: "+(8+14));
        }
        catch(ArithmeticException ae) {
            System.out.println("Result: "+(11+22));
        }
    }
}