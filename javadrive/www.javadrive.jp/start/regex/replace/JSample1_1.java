/* Java正規表現サンプル */

import java.util.regex.Pattern;
import java.util.regex.Matcher;

class JSample1_1{
  public static void main(String args[]){
    String str = "Orange is 100yen, Banana is 180yen.";

    String regex = "yen";
    Pattern p = Pattern.compile(regex);

    Matcher m = p.matcher(str);
    String result1 = m.replaceFirst("YEN");

    System.out.println("replaceFirst");
    System.out.println("before : " + str);
    System.out.println("after  : " + result1);

    String result2 = m.replaceAll("YEN");

    System.out.println("replaceAll");
    System.out.println("before : " + str);
    System.out.println("after  : " + result2);

    String result3 = str.replaceAll(regex, "YEN");

    System.out.println("String.replaceAll");
    System.out.println("before : " + str);
    System.out.println("after  : " + result3);
  }
}
