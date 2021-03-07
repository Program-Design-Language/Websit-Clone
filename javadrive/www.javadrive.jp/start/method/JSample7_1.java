class JSample7_1{
  public static void main(String args[]){
    int data[];

    test(15, 4);
    test(7, 0);
  }

  private static void test(int n1, int n2){
    if (n2 == 0){
      System.out.println("0‚ÅŠ„‚é‚±‚Æ‚Í‚Å‚«‚Ü‚¹‚ñ");
      return;
    }

    System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
    return;
  }
}
