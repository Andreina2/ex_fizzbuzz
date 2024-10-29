package dev.andreina.ex_fizzbuzz;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FizzbuzzTest {
    @Test
    @DisplayName("Devuelve Fizz si el número es divisible por 3")
    void testIfdivisibleByThree_ReturnFizz() {
        // Instanciar objeto de tipo Fizzbuzz: instanciar es crear un objeto
        // Given
        int numb = 3;
        Fizzbuzz fizzbuzz = new Fizzbuzz();

        //When
        String result = fizzbuzz.checkNumber(numb);
        //Then
        assertThat(fizzbuzz, instanceOf(Fizzbuzz.class)); //asegurarse Q la instancia es un objeto Fizzbuzz
        assertThat(result, is("Fizz"));
    }

     @Test
     @DisplayName("Devuelve Buzz si el número es divisible por 5")
     void testIfdivisibleByFive_ReturnBuzz() {
     // Given
     int numb = 5;
     Fizzbuzz fizzbuzz = new Fizzbuzz();

    // When : realizamos la acción, entonces obtenemos un resultado
    String result = fizzbuzz.checkNumber(numb);

    // Then
    assertThat(result, is("Buzz"));
    }

    @Test
    @DisplayName("Devuelve FizzBuzz si el número es divisible por 3 y por 5")
    void testIfdivisibleByFiveAndThree_ReturnFizzBuzz() {
    // Given
    int numb = 5 & 3;
    Fizzbuzz fizzbuzz = new Fizzbuzz();

   // When realizamos la acción, entonces obtenemos un resultado
   String result = fizzbuzz.checkNumber(numb);

   // Then
   assertThat(result, is("FizzBuzz"));
   }

}


