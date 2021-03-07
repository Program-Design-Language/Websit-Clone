/* Java正規表現サンプル */

import java.util.regex.Pattern;
import java.util.regex.Matcher;

class JSample2_1{
  public static void main(String args[]){
    String str = "border width is 100px, and border height is 80px";

    String regex = "\\d+px";
    Pattern p = Pattern.compile(regex);

    System.out.println("パターン : " + regex);
    System.out.println("ターゲット文字列 : \"" + str + "\"");

    Matcher m = p.matcher(str);

    int start = m.regionStart();
    int end = m.regionEnd();

    System.out.println("\nデフォルトのままマッチ：");
    System.out.println("region : \"" + str.substring(start, end) + "\"");

    if (m.find()){
      System.out.println("match：" + m.group());
    }else{
      System.out.println("×");
    }

    m.region(24, m.regionEnd());

    System.out.println("\n開始インデックスを 24 に設定：");
    System.out.println("region : \"" + str.substring(24, m.regionEnd()) + "\"");

    if (m.find()){
      System.out.println("match：" + m.group());
    }else{
      System.out.println("× ");
    }
  }
}
