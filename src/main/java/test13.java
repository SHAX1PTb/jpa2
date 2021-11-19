import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class test13 {

  //    input:  words =    ["cat", "bat", "tab"]
  //    alphabet = ['c', 'b', 'a', 't']
  // return is true / false

  //  Write a function that returns whether a list of strings is sorted given a specific alphabet. A
  // list of N words and the K-sized alphabet are given.

  // Function arg1 = list of string - 1,2..n
  // Sort logic - as per the arguments of second arguments.

  public boolean sortwords(List<String> words, List<String> alphabet) {

    // Loop thru the words.
    // get the first charecter from the words and store them.
    // alphabet_common  = word + alphabet
    // compare them with the alaphabet passed and see if its equal.

    List<String> word = new ArrayList<>();
    List<Boolean> booleans = new ArrayList<>();

    for (int i = 0; i < words.size(); i++) {
      word.add(String.valueOf(words.get(i).charAt(0)));
    }

    List<String> wordset = new ArrayList<>(new LinkedHashSet<>(word));
    List<String> alphabet_stream = alphabet.stream().distinct().collect(Collectors.toList());

    List<String> alphabet_unique = new ArrayList<>();

    System.out.println("alphabet_stream:" + alphabet_stream);
    alphabet_stream.retainAll(wordset);

    boolean temp = wordset.equals(alphabet_stream);

    if (temp) {

      for (int i = 0; i < words.size(); i++) {
        List<String> tt = new ArrayList<>(Arrays.asList(words.get(i).split("")));

        tt.retainAll(alphabet);

        List<String> alphabet_unique_inside = new ArrayList<>(alphabet);

        alphabet_unique_inside.retainAll(tt);

        booleans.add(tt.equals(alphabet_unique_inside));
      }
    }

    //      linkedHashSet.add(word);

    System.out.println("booleans:" + booleans);
    System.out.println("wordset:" + wordset);
    System.out.println("alphabet_stream:" + alphabet_stream);
    System.out.println("temp:" + temp);
    System.out.println("alphabet_unique:" + alphabet_unique);

    if (!temp) {
      return false;
    } else {

      if (booleans.contains(false)) {
        return false;
      }
    }

    return false;
  }
}
