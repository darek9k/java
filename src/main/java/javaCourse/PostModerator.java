package javaCourse;

public class PostModerator {
    public static void main(String[] args) {
        moderate("Tu jest brzydkie słowo Slowonak i slowonap");
        moderate("Zwykly tekst testowy do weryfikacji");

        moderate2("Tu jest brzydkie słowo Slowonak i slowonap");
        moderate2("Zwykly tekst testowy do weryfikacji");
    }

    private static void moderate(String post) {
        String[] blackList = {"slowonap", "slowonak", "slowonad", "slowonach"};

        String[] splittedPost = post.split(" ");

        for (String word : splittedPost) {
            for (String badWord : blackList) {
                if (word.equalsIgnoreCase(badWord)) {
                    System.out.println("Post nie przyjęty");
                    return;
                }
            }
        }
        System.out.println("Post accepted");
    }

    private static void moderate2(String post) {
        String[] blackList = {"slowonap", "slowonak", "slowonad", "slowonach"};

        String[] splittedPost = post.split(" ");

        StringBuilder result = new StringBuilder();
        String tmpWord;
        for (String word : splittedPost) {
            tmpWord = word;
            for (String badWord : blackList) {
                if (word.equalsIgnoreCase(badWord)) {
                    tmpWord = "*****";
                    break;
                }
            }
            result.append(tmpWord).append(" ");
        }
        System.out.println(result.toString().stripTrailing());
    }
}
