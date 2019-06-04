import hangman.HangmanConsoleWindow;

public class Main {
    private static HangmanConsoleWindow hcw = new HangmanConsoleWindow();
    private static String[] ordlista= {"hej", "test"};

    public static void main(String args[]){
        char tempchar;

        while (true) {
            hcw.clear();
            hcw.println("Vill du spela? [Y] [N]");
            tempchar = hcw.nextChar();
            if (tempchar == 'n' || tempchar == 'N'){
                break;
            }

            hcw.clear();
            hcw.println("Vill du spela i mulitplayer    [m]");
            hcw.println("Eller i Singelplayer           [s]");
            tempchar = hcw.nextChar();

            String ord;
            if (tempchar == 'm' || tempchar == 'M'){
                ord = ordlista[(int) (Math.random()*ordlista.length)];
            }
            else {
                hcw.clear();
                hcw.println("Skriv ett ord som den andra personen ska gissa");
                ord = hcw.nextString();
            }



            int antalfel = 0;
            char[] rattgissadebokstaver = new char[ord.length()];
            String gissadebokstaver;
            while (true) {
                hcw.clear();
                bild(antalfel);
                hcw.println("Skriv ett ord");
                char bokstav = hcw.nextString().charAt(0);

                if (ord.contains(bokstav + "")){
                    gissadebokstaver =+ bokstav + "";
                }

                
            }
        }
    }

    private static void bild (int i){
        switch (i){
            case 1:
                hcw.println("");
                hcw.println("");
                hcw.println("");
                hcw.println("");
                hcw.println("");
                hcw.println("");
                hcw.println("");
                hcw.println("");
                hcw.println("__________");
                break;


            case 2:
                hcw.println("");
                hcw.println("|");
                hcw.println("|");
                hcw.println("|");
                hcw.println("|");
                hcw.println("|");
                hcw.println("|");
                hcw.println("|");
                hcw.println("|_________");
                break;


            case 3:
                hcw.println(" ____");
                hcw.println("| /");
                hcw.println("|/");
                hcw.println("|");
                hcw.println("|");
                hcw.println("|");
                hcw.println("|");
                hcw.println("|");
                hcw.println("|_________");
                break;


            case 4:
                hcw.println(" ____");
                hcw.println("| /  |");
                hcw.println("|/");
                hcw.println("|");
                hcw.println("|");
                hcw.println("|");
                hcw.println("|");
                hcw.println("|");
                hcw.println("|_________");
                break;


            case 5:
                hcw.println(" ____");
                hcw.println("| /  |");
                hcw.println("|/   O");
                hcw.println("|");
                hcw.println("|");
                hcw.println("|");
                hcw.println("|");
                hcw.println("|");
                hcw.println("|_________");
                break;


            case 6:
                hcw.println(" ____");
                hcw.println("| /  |");
                hcw.println("|/   O");
                hcw.println("|    |");
                hcw.println("|");
                hcw.println("|");
                hcw.println("|");
                hcw.println("|");
                hcw.println("|_________");
                break;


            case 7:
                hcw.println(" ____");
                hcw.println("| /  |");
                hcw.println("|/   O");
                hcw.println("|   /|\\");
                hcw.println("|");
                hcw.println("|");
                hcw.println("|");
                hcw.println("|");
                hcw.println("|_________");
                break;


            case 8:
                hcw.println(" ____");
                hcw.println("| /  |");
                hcw.println("|/   O");
                hcw.println("|   /|\\");
                hcw.println("|   / \\");
                hcw.println("|");
                hcw.println("|");
                hcw.println("|");
                hcw.println("|_________");
                break;
        }
    }
}
