package dev.andreina.ex_fizzbuzz;

public class Fizzbuzz {
    public String checkNumber(int numb) {

        boolean isDivisibleBy3 = numb % 3 == 0;

        boolean isDivisibleBy5 = numb % 5 == 0;

        boolean isDivisibleBy3and5 = (numb % 5 == 0 && numb % 3 ==0);
        
        if (isDivisibleBy3) return "Fizz";
        // refactorizar: Q el código sea mas legible
        if (isDivisibleBy5) return "Buzz";
        if (isDivisibleBy3and5) return "FizzBuzz";
        else
            return String.valueOf(numb);
        

}

}

