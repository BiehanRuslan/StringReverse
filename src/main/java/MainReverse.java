import java.util.Scanner;

public class MainReverse {
    public static void main(String[] args) {
        MainReverse mainReverse = new MainReverse();
        System.out.println(mainReverse.reverse(mainReverse.inputSentence()));
    }

    public Sentence inputSentence() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a sentence: ");
        String inputStr = scanner.nextLine();
        Sentence sentence = new Sentence(inputStr);
        return sentence;
    }

    public String reverse(Sentence sentence) {
        String[] words = new StringBuilder(sentence.getWords()).reverse().toString().split(" ");
        StringBuilder reverseStr = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reverseStr.append(words[i]).append(" ");
        }
        return reverseStr.toString();
    }
}
