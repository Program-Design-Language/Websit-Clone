/* Java正規表現サンプル */

import java.util.regex.Pattern;
import java.util.regex.Matcher;

class JSample3_1{
  public static void main(String args[]){
    String str = "Blackcolor is dark color.";

    String regex = "^color";
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

    start = 5;
    m.region(start, end);

    System.out.println("\nリージョンを(" + start + "," + end + ")に設定：");
    System.out.println("region : \"" + str.substring(start, end) + "\"");

    if (m.find()){
      System.out.println("match：" + m.group());
    }else{
      System.out.println("×");
    }

    m.useAnchoringBounds(false);

    System.out.println("\nアンカー境界フラグを false に設定：");
    System.out.println("region : \"" + str.substring(start, end) + "\"");

    if (m.find()){
      System.out.println("match：" + m.group());
    }else{
      System.out.println("×");
    }
  }
}
