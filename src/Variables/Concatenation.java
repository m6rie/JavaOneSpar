package Variables;

public class Concatenation {
    public static void main(String[] args) {
        String rnbSinger = "Beyonce";
        String rockSinger = "Joan Jett";
        String popSinger = "Cher";


        System.out.println("Some well known RnB, rock and pop singers are " + rnbSinger + " " + rockSinger + " and " + popSinger + ".");
        System.out.printf("%s%s%s%s%s%s%s", "Some well known RnB, rock and pop singers are ", rnbSinger," ", rockSinger," and ", popSinger,".");
    }
}
