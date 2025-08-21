public class Simple_interest {
    public static void main(String[] args) {
        int number1 = 380000;
        int number2 = 5;
        int number3 = (int) 4.5;
        // number1 is Principle
        // number2 is Time
        // number3 is Rate
        int number4 = number1*number2*number3;
        int number5 = number4/100;
        System.out.println("The simple interest is Rs." + number5);

    }
}
