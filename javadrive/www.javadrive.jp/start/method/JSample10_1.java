class JSample10_1{
  public static void main(String args[]){
    disp("[", "]", 10, 7, 8);
    disp("Åy", "Åz", 128, 76);
  }

  private static void disp(String strBefore, String strAfter, int... num){
    for (int i = 0; i < num.length; i++){
      System.out.println(strBefore + num[i] + strAfter);
    }
  }
}
