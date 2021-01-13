public class FizzBuzz {
    public String fizzBuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (number % 5 == 0) {
            System.out.println("Buzz");
        } else if (number % 3 == 0 ) {
            System.out.printf("Fizz");
        } else {
            System.out.println(number);
        }
        return "";
    }
}
