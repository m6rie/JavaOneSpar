package Variables;

public class Concatenation {
    public static void main(String[] args) {
        String rnbSinger = "Beyonce";
        String rockSinger = "Joan Jett";
        String popSinger = "Cher";
        String word = "allez";
        String word2 = "stop";
        int number = 8;

        System.out.printf("%d. Hey this \"%s\" means go. %S! %S!%n", number,word, word,word2);
        System.out.println("Some well known RnB, rock and pop singers are " + rnbSinger + " " + rockSinger + " and " + popSinger + ".");
        System.out.printf("%s%s%s%s%s%s%s", "Some well known RnB, rock and pop singers are ", rnbSinger," ", rockSinger," and ", popSinger,".");
    }
}
