class JSample2_1{
  public static void main(String args[]){
    hello();
    bye();
    hellobye();
  }

  private static void hello(){
    System.out.println("Ç±ÇÒÇ…ÇøÇÕÅB");
  }

  private static void bye(){
    System.out.println("Ç≥ÇÊÇ§Ç»ÇÁÅB");
  }

  private static void hellobye(){
    hello();
    bye();
  }
}
