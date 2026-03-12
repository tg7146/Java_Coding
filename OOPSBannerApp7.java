public class OOPSBannerApp7 {

    private static class CharacterPattern {
        private final String[] pattern;

        public CharacterPattern(String[] pattern) {
            this.pattern = pattern;
        }

        public String getLine(int index) {
            return pattern[index];
        }
    }

    public static void main(String[] args) {

        CharacterPattern o = new CharacterPattern(new String[]{
            "   ***   ",
            " **   ** ",
            "**     **",
            "**     **",
            "**     **",
            "**     **",
            " **   ** ",
            "   ***   "
        });

        CharacterPattern p = new CharacterPattern(new String[]{
            " ******  ",
            " **   ** ",
            " **   ***",
            " **   ** ",
            " ******  ",
            " **      ",
            " **      ",
            " **      "
        });

        CharacterPattern s = new CharacterPattern(new String[]{
            "  *****    ",
            " **   **   ",
            "**         ",
            "  ***      ",
            "    ***    ",
            "       **  ",
            " **   **   ",
            "  *****    "
        });

        for (int i = 0; i < 8; i++) {
            System.out.println(o.getLine(i) + "   " + o.getLine(i) + "   " + p.getLine(i) + "   " + s.getLine(i));
        }
    }
}