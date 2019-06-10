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
            while (true) {
                if (tempchar == 'n' || tempchar == 'N') {
                    hcw.exit();
                    break;
                } else if (tempchar == 'y' || tempchar == 'Y') {
                    break;
                } else {
                    hcw.clear();
                    hcw.println("Vill du spela? [Y] [N]");
                    hcw.println(tempchar + " är inte accepterat som svar");
                    tempchar = hcw.nextChar();
                }
            }

            hcw.clear();
            hcw.println("Vill du spela i mulitplayer    [m]");
            hcw.println("Eller i Singelplayer           [s]");
            tempchar = hcw.nextChar();

            String ord;
            while (true) {
                if (tempchar == 's' || tempchar == 'S') {
                    ord = ordlista[(int) (Math.random() * ordlista.length)];
                    break;
                } else if (tempchar == 'm' || tempchar == 'M') {
                    hcw.clear();
                    hcw.println("Skriv ett ord som den andra personen");
                    hcw.print("ska gissa: ");
                    ord = hcw.nextString();
                    break;
                } else {
                    hcw.clear();
                    hcw.println("Vill du spela i mulitplayer    [m]");
                    hcw.println("Eller i Singelplayer           [s]");
                    hcw.println(tempchar + " är inte accepterat som svar");
                    ord = hcw.nextString();
                }
            }

            //spelet
            String SkrivenString = "";
            char[] VisatOrd = new char[ord.length()];
            int forsok = 0;
            char[] RattGissadeBokstaver = new char[ord.length()];
            while (true) {
                String TempOrd = "";
                for (int i = 0; i < TempOrd.length(); i++) {
                    for (int j = 0; j < ord.length(); j++) {
                        if (ord.charAt(j) == TempOrd.charAt(i)){

                        } else {
                            for (int k = 0; k < VisatOrd.length; k++) {
                                TempOrd = TempOrd + VisatOrd[k];
                                System.out.print(VisatOrd);
                            }
                        }

                    }
                }
                VisatOrd = TempOrd.toCharArray();

                hcw.clear();

                System.out.println("Skriven String: " + SkrivenString);

                hcw.println("Du har gissat fel: " + forsok + " Gånger");
                bild(forsok);
                hcw.println("Ord: " + TempOrd);
                hcw.println("Skriv \"stop\" om du vill sluta");
                hcw.println("eller gissa en bokstav:");
                 SkrivenString= hcw.nextString();
                if (!ord.contains(SkrivenString.charAt(0) + "")){
                    forsok++;
                }

                for (int i = 0; i < ord.length(); i++) {
                    if ((RattGissadeBokstaver[i] + "").equals("")) {
                        RattGissadeBokstaver[i] = SkrivenString.charAt(0);
                    }
                }

                boolean GissadeBokstaverFinnsIOrd = false;
                for (int i = 0; i < RattGissadeBokstaver.length; i++) {
                    for (int j = 0; j < ord.length(); j++) {
                        if (RattGissadeBokstaver[i] == ord.charAt(j)) {
                            GissadeBokstaverFinnsIOrd = true;
                        }
                    }
                }


                for (int i = 0; i < ord.length(); i++) {
                    if (ord.charAt(i) ==  SkrivenString.charAt(0)) {
                        VisatOrd[i] = SkrivenString.charAt(0);
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


                if (ord.equals(VisatOrd) || SkrivenString.equals("stop")) {
                    break;
                }
            }
        }
    }

    private static void bild(int i) {
        System.out.println("Bild metod med input: " + i);
        switch (i) {
            case 0:
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


            case 1:
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


            case 2:
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


            case 3:
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


            case 4:
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


            case 5:
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


            case 6:
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


            case 7:
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