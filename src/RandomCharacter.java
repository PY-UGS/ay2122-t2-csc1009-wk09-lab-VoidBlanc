public class RandomCharacter{
    public char getRandomLowerCaseLetter(){
        return getRandomCharacter('a', 'z');
    }

    public char getRandomUpperCaseLetter(){
        return getRandomCharacter('A', 'Z');
    }

    public char getRandomDigitCharacter(){
        return getRandomCharacter('0', '9');
    }

    public char getRandomPrimeCharacter(){
        return getRandomCharacter('0', '9');
    }

    public boolean isPrime(int digit){
        boolean prime =true;
        if(digit > 1){
            for (int i = 2; i < digit/2; i++){
                if((digit%i)==0){
                    prime = false;
                    break;
                }
            }
        }else{
            prime = false;
        }
        return prime;
    }

    public char getRandomCharacter(char firstchr, char lastchr) {
        int range = lastchr - firstchr + 1;
        return (char)((Math.random()  * range) + firstchr);
    }
}