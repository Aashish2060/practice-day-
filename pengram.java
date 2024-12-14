public class pengram {


        public static boolean isPangram(String sentence) {
            sentence = sentence.toLowerCase();
            for (char c = 'a'; c <= 'z'; c++) {
                if (!sentence.contains(String.valueOf(c))) {
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args) {
            String sentence = "The quick brown fox jumps over the lazy dog";

            if (isPangram(sentence)) {
                System.out.println("The sentence is a pangram.");
            } else {
                System.out.println("The sentence is not a pangram.");
            }
        }
    }

