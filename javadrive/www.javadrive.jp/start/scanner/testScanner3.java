import java.util.Scanner;
import java.util.InputMismatchException;

class testScanner3{

    public static void main(String args[]){
        System.out.println("���l����͂��ĉ������B");

        Scanner scan = new Scanner(System.in);

        try{
            int val = scan.nextInt();
            System.out.println("�ŏ��̐��l�̃g�[�N����: "+ val); 

            val = scan.nextInt();
            System.out.println("���̐��l�̃g�[�N����  : "+ val);
        }catch (InputMismatchException e){
            System.out.println("�^���Ⴂ�܂��F" + e);
        }
    }
}
