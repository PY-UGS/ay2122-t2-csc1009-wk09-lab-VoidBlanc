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

    public char getRandomCharacter(char firstchr, char lastchr) {
        int range = lastchr - firstchr + 1;
        return (char)((Math.random()  * range) + firstchr);
    }
}