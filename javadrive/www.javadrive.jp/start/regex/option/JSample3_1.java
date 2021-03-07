/* Java正規表現サンプル */

import java.util.regex.Pattern;
import java.util.regex.Matcher;

class JSample3_1{
  public static void main(String args[]){
    String str1 = "Book";
    String str2 = "Movie\nBook";

    String regex1 = "^B";
    Pattern p1 = Pattern.compile(regex1);

    String regex2 = "(?m)^B";
    Pattern p2 = Pattern.compile(regex2);

    String regex3 = "^B";
    Pattern p3 = Pattern.compile(regex3, Pattern.MULTILINE);

    System.out.println("パターン : " + regex1);

    check(p1, str1);
    check(p1, str2);

    System.out.println("パターン : " + regex2);

    check(p2, str1);
    check(p2, str2);

    System.out.println("\nPattern.compile(regex, Pattern.MULTILINE)");
    System.out.println("パターン : " + regex3);

    check(p3, str1);
    check(p3, str2);
  }

  private static void check(Pattern p, String target){
    Matcher m = p.matcher(target);

    if (m.find()){
      System.out.println("○ " + target);
    }else{
      System.out.println("× " + target);
    }
  }
}
