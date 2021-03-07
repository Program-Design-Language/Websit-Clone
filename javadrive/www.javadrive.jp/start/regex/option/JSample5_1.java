/* Java正規表現サンプル */

import java.util.regex.Pattern;
import java.util.regex.Matcher;

class JSample5_1{
  public static void main(String args[]){
    String str1 = "abc";
    String str2 = "abc\ndef";
    String str3 = "abc\r\ndef";

    String regex1 = "(?m)abc$";
    Pattern p1 = Pattern.compile(regex1);

    String regex2 = "(?m)(?d)abc$";
    Pattern p2 = Pattern.compile(regex2);

    String regex3 = "abc$";
    Pattern p3 = Pattern.compile(regex3, Pattern.MULTILINE | Pattern.UNIX_LINES);

    System.out.println("パターン : " + regex1);

    check(p1, str1);
    check(p1, str2);
    check(p1, str3);

    System.out.println("パターン : " + regex2);

    check(p2, str1);
    check(p2, str2);
    check(p2, str3);

    System.out.println("\nPattern.compile(regex, Pattern.MULTILINE | Pattern.UNIX_LINES)");
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
