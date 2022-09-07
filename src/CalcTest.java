class CalcTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int a = 30;
        int b = 20;
        int c = 10;

        System.out.println("A: " + a + "\nB: " + b + "\nC: " + c);

        System.out.println("A + B = " + calc.add(a,b));
        System.out.println("A + B + C = " + calc.add(a,b,c));

        System.out.println("A - B = " + calc.subtract(a,b));
        System.out.println("A - B - C = " + calc.subtract(a,b,c));
    }
}
