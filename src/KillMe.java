import hangman.HangmanConsoleWindow;

public class KillMe {
    private static HangmanConsoleWindow hcw = new HangmanConsoleWindow();
    private static String[] ordlista = {"hej", "test"};

    public static void main(String[] args) {
        char tempchar;

        while (true) {
            hcw.clear();
            hcw.println("Vill du spela? [Y] [N]");
            tempchar = hcw.nextChar();
            if (tempchar == 'n' || tempchar == 'N') {
                hcw.exit();
                break;
            }

            hcw.clear();
            hcw.println("Vill du spela i mulitplayer    [m]");
            hcw.println("Eller i Singelplayer           [s]");
            tempchar = hcw.nextChar();

            String ord;
            if (tempchar == 's' || tempchar == 'S') {
                ord = ordlista[(int) (Math.random() * ordlista.length)];
            } else {
                hcw.clear();
                hcw.println("Skriv ett ord som den andra personen");
                hcw.println("ska gissa");
                ord = hcw.nextString();
            }


            String GissadBokstav = "";
            char[] VisatOrd = new char[ord.length()];
            int forsok = 0;
            char[] RattGissadeBokstaver = new char[ord.length()];
            while (true) {
                String TempOrd = "";
                for (int i = 0; i < VisatOrd.length; i++) {
                    TempOrd = TempOrd + VisatOrd[i];
                }

                hcw.clear();
                System.out.println("Skriven String: " + GissadBokstav);
                hcw.println("Du har gissat fel: " + forsok + " G�nger");
                hcw.println("Ord: " + TempOrd);
                hcw.println("Skriv \"stop\" om du vill sluta");
                hcw.println("eller gissa en bokstav:");
                GissadBokstav = hcw.nextString();

                boolean tempBool = true;
                for (int i = 0; i < ord.length(); i++) {
                    if (tempBool && ((RattGissadeBokstaver[i] + "").equals(""))) {
                        RattGissadeBokstaver[i] = GissadBokstav.charAt(0);
                        tempBool = false;
                    }
                }
                for (int i = 0; i < RattGissadeBokstaver.length; i++) {
                    if (RattGissadeBokstaver[i] == 's') {

                    }
                }

                boolean GissadeBokstaverFinnsIOrd = false;
                for (int i = 0; i < ord.length(); i++) {
                    if (ord.charAt(i) == (GissadBokstav.charAt(0))) {
                        VisatOrd[i] = GissadBokstav.charAt(0);
                    } else if (GissadeBokstaverFinnsIOrd) {
                        for (int j = 0; j < RattGissadeBokstaver.length; j++) {
                            if (ord.charAt(i) == (RattGissadeBokstaver[j])) {
                                VisatOrd[i] = RattGissadeBokstaver[j];
                            }
                        }
                    } else {
                        VisatOrd[i] = '-';
                    }
                }


                if (ord.equals(VisatOrd) || GissadBokstav.equals("stop")) {
                    break;
                }
            }
        }
    }

    private static void bild(int i) {
        switch (i) {
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