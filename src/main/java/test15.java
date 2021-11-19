public class test15 {

  // Program to revers a name

  public String ReverseName(String name) {

    char[] a = name.toCharArray();
    StringBuffer sb = new StringBuffer();

    for (int i = a.length - 1; i >= 0; --i) {

      sb.append(a[i]);
    }

    return String.valueOf(sb);
  }
}
