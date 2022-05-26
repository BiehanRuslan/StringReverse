public class Sentence {
    private String words;

    public Sentence(String words) {
        if (words == null || words.isBlank()) {
            throw new IllegalArgumentException("The sentence should not be empty!");
        } else {
            this.words = words;
        }
    }

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        if (words == null || words.isBlank()) {
            throw new IllegalArgumentException("The sentence should not be empty!");
        } else {
            this.words = words;
        }
    }
}
