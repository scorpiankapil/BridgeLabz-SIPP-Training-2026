class Calculator {

    public void add(int a, int b) {
        int c = a + b;
        System.out.println("Addition is: " + c);
    }

    public void sub(int a, int b) {
        int c = a - b;
        System.out.println("Subtraction is: " + c);
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();

        cal.add(10, 5);
        cal.sub(10, 5);
    }
}