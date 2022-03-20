public class Main {
    public static void main(String[] args){
        RandomCharacter random = new RandomCharacter();
        System.out.println("Lower Case Letter : ");
        for (int i = 0; i < 15; i++){
            System.out.print(random.getRandomLowerCaseLetter());
        }

        System.out.println("\nUpper Case Letter : ");
        for (int i = 0; i < 15; i++){
            System.out.print(random.getRandomUpperCaseLetter());
        }

        System.out.println("\nDigit Letter : ");
        for (int i = 0; i < 15; i++){
            System.out.print(random.getRandomDigitCharacter());
        }
    }
}
