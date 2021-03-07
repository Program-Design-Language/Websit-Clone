class JSample1_1{
  public static void main(String args[]){
    int eigo = 78;
    int suugaku = 90;
    int kokugo = 68;

    check("‰pŒê", eigo);
    check("”Šw", suugaku);
    check("‘Œê", kokugo);
  }

  private static void check(String kyoka, int seiseki){
    System.out.print(kyoka + "‚ÌŒ±Œ‹‰Ê‚Í");
    if (seiseki > 80){
      System.out.println("‡Ši‚Å‚·");
    }else{
      System.out.println("•s‡Ši‚Å‚·");
    }
  }
}
