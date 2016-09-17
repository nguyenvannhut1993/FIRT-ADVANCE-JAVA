
package task2.pkg2;

/**
 *
 * @author Nguyen Van Nhut
 * Day 07/09/2016
 * Version 1
 * class for creating word class
 */
public class WordEnglish implements Comparable<WordEnglish>{
    String word;
    String meaning;

    public WordEnglish(String word, String meaning) {
        this.word = word;
        this.meaning = meaning;
    }

    public WordEnglish() {
    }

   
    @Override
    public int compareTo(WordEnglish o) {
        return (this.word).compareTo(o.word);
    }
     @Override
    public String toString() {
        return "Word:"+word +" -- "+"meaning:"+meaning;
    }

   
}
