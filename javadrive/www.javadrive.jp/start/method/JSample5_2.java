class JSample5_2{
  public static void main(String args[]){
    int num;
    String kekka;

    num = 9;
    kekka = hantei(num);
    System.out.println(num + "‚Í" + kekka);

    num = 6;
    kekka = hantei(num);
    System.out.println(num + "‚Í" + kekka);
  }

  private static String hantei(int n){
    if (n % 2 == 0){
      return "‹ô”";
    }else{
      return "Šï”";
    }
  }
}
