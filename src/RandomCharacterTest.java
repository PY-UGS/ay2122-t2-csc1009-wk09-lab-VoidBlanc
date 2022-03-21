import static org.junit.Assert.*;
import org.junit.*;
public class RandomCharacterTest {

    @org.junit.Test
    public void getRandomLowerCaseLetter() {
        RandomCharacter random = new RandomCharacter();
        for (int i = 0; i < 15; i++){
            char letter = random.getRandomLowerCaseLetter();
            assertTrue(letter <= 'z' && letter >= 'a');
        }
    }

    @org.junit.Test
    public void getRandomUpperCaseLetter() {
        RandomCharacter random = new RandomCharacter();
        for (int i = 0; i < 15; i++){
            char letter = random.getRandomUpperCaseLetter();
            assertTrue(letter <= 'Z' && letter >= 'A');
        }
    }

    @org.junit.Test
    public void getRandomDigitCharacter() {
        RandomCharacter random = new RandomCharacter();
        for (int i = 0; i < 15; i++){
            char letter = random.getRandomDigitCharacter();
            assertTrue(letter <= '9' && letter >= '0');
        }
    }

    @org.junit.Test
    public void getRandomPrimeDigitCharacter() {
        RandomCharacter random = new RandomCharacter();
        for (int i = 0; i < 15; i++){
            char digit = random.getRandomDigitCharacter();
            assertTrue(random.isPrime( Character.getNumericValue(digit)));

        }
    }

    @org.junit.Test
    public void getRandomCharacter() {

    }
}