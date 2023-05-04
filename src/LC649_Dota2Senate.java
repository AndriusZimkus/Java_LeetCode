public class LC649_Dota2Senate {
    public String predictPartyVictory(String senate) {

        String winner = "";
        boolean[] isMuted = new boolean[senate.length()];
        while (true) {
            for (int i = 0; i < senate.length(); i++) {
                if (!isMuted[i]) {
                    String currentChar = String.valueOf(senate.charAt(i));

                    int j = (i + 1) % senate.length();
                    boolean isOpponentFound = false;
                    while (j != i) {


                        String comparisonString = String.valueOf(senate.charAt(j));

                        if (!comparisonString.equals(currentChar) && !isMuted[j]) {
                            isMuted[j] = true;
                            isOpponentFound = true;
                            break;
                        }

                        j = (j + 1) % senate.length();
                    }
                    if (!isOpponentFound) {
                        if (currentChar.equals("R")) {
                            return "Radiant";
                        } else if (currentChar.equals("D")) {
                            return "Dire";
                        }
                    }
                }

            }
        }


    }
}
