class JSample2_1{
  public static void main(String args[]){
    int n[] = {18, 29, 36};

    System.out.println("�J�n���܂�");

    try{
      for (int i = 0; i < 4; i++){
        System.out.println(n[i]);
      }
    }
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println("�z��͈̔͂𒴂��Ă��܂�");
    }

    System.out.println("�I�����܂���");
  }
}
