import java.util.Scanner;

class testScanner4{

    public static void main(String args[]){
        System.out.println("�������J���}��؂�œ��͂��ĉ������B");

        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\\s*,\\s*|\n");

        String str = scan.next();
        System.out.println("�ŏ��̃g�[�N����: "+ str); 

        str = scan.next();
        System.out.println("���̃g�[�N����  : "+ str);
    }
}
