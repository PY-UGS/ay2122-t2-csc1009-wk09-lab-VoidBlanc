import java.util.Random;

public class RandomCharacter{

     // To get the random lower case character based on ascii
    // Start : 'A'    End : 'Z'
    public char getRandomLowerCaseLetter(){
        int range = 'z' - 'a' + 1;
        return (char)((Math.random()  * range) + 'a');
    }

    // To get the random upper case character based on ascii
    // Start : 'A'    End : 'Z'
    public char getRandomUpperCaseLetter(){
        int range = 'Z' - 'A' + 1;
        return (char)((Math.random()  * range) + 'A');
    }


    // To get the random digit character based on ascii
    // Start : '0'    End : '9'
    public char getRandomDigitCharacter(){
        int range = '9' - '0' + 1;
        return (char)((Math.random()  * range) + '0');
    }


    // To get Random Prime number up with limit up to 100
    public int getRandomPrimeNumber(){
        Random rand = new Random();
        int digit = rand.nextInt(100) + 1;
        while(!isPrime(digit)){
            digit = rand.nextInt(100) + 1;
        }
        return digit;
    }


    // Function to check if it is a prime number
    public boolean isPrime(int digit){
        boolean prime =true;
        // Digit more than 1 Could be a prime number
        if(digit > 1){
            for (int i = 2; i < digit/2; i++){
                if((digit%i)==0){
                    prime = false;
                    break;
                }
            }
        }else{
            // Digit less than or equal to 1 is not a prime number
            prime = false;
        }
        return prime;
    }

    // To get the random character based on ascii characters
    // Start : 33 (Dec)     End : 125 (Dec)
    public char getRandomCharacter() {
        int range = 125 - 33 + 1;
        return (char)((Math.random()  * range) + 33);
    }


}