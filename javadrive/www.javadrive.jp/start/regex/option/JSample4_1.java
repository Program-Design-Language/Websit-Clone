/* Java正規表現サンプル */

import java.util.regex.Pattern;
import java.util.regex.Matcher;

class JSample4_1{
  public static void main(String args[]){
    String str1 = "width height";
    String str2 = "width\nheight";

    String regex1 = "width.height";
    Pattern p1 = Pattern.compile(regex1);

    String regex2 = "(?s)width.height";
    Pattern p2 = Pattern.compile(regex2);

    String regex3 = "width.height";
    Pattern p3 = Pattern.compile(regex3, Pattern.DOTALL);

    System.out.println("パターン : " + regex1);

    check(p1, str1);
    check(p1, str2);

    System.out.println("パターン : " + regex2);

    check(p2, str1);
    check(p2, str2);

    System.out.println("\nPattern.compile(regex, Pattern.DOTALL)");
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
