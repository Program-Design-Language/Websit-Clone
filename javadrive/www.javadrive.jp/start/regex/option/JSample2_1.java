/* Java正規表現サンプル */

import java.util.regex.Pattern;
import java.util.regex.Matcher;

class JSample2_1{
  public static void main(String args[]){
    String str1 = "Hello";
    String str2 = "hello";
    String str3 = "HELLO";

    String regex1 = "hello";
    Pattern p1 = Pattern.compile(regex1);

    String regex2 = "(?i)hello";
    Pattern p2 = Pattern.compile(regex2);

    String regex3 = "hello";
    Pattern p3 = Pattern.compile(regex3, Pattern.CASE_INSENSITIVE);

    System.out.println("パターン : " + regex1);

    check(p1, str1);
    check(p1, str2);
    check(p1, str3);

    System.out.println("パターン : " + regex2);

    check(p2, str1);
    check(p2, str2);
    check(p2, str3);

    System.out.println("\nPattern.compile(regex, Pattern.CASE_INSENSITIVE)");
    System.out.println("パターン : " + regex3);

    check(p3, str1);
    check(p3, str2);
    check(p3, str3);
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
