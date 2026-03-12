import java.util.*;

public class OOPSBannerApp8 {

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

        Map<Character, CharacterPattern> map = new HashMap<>();

        map.put('O', new CharacterPattern(new String[]{
            "   ***   ",
            " **   ** ",
            "**     **",
            "**     **",
            "**     **",
            "**     **",
            " **   ** ",
            "   ***   "
        }));

        map.put('P', new CharacterPattern(new String[]{
            " ******  ",
            " **   ** ",
            " **   ***",
            " **   ** ",
            " ******  ",
            " **      ",
            " **      ",
            " **      "
        }));

        map.put('S', new CharacterPattern(new String[]{
            "  *****    ",
            " **   **   ",
            "**         ",
            "  ***      ",
            "    ***    ",
            "       **  ",
            " **   **   ",
            "  *****    "
        }));

        renderBanner("OOPS", map);
    }

    public static void renderBanner(String word, Map<Character, CharacterPattern> map) {

        for (int i = 0; i < 8; i++) {

            for (char c : word.toCharArray()) {
                System.out.print(map.get(c).getLine(i) + "   ");
            }

            System.out.println();
        }
    }
}