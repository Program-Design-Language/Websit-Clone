class JSample2_1{
  public static void main(String args[]){
    hello();
    bye();
    hellobye();
  }

  private static void hello(){
    System.out.println("����ɂ��́B");
  }

  private static void bye(){
    System.out.println("���悤�Ȃ�B");
  }

  private static void hellobye(){
    hello();
    bye();
  }
}
