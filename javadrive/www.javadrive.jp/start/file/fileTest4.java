import java.io.File;
import java.io.IOException;

class fileTest4{

    public static void main(String args[]){
        File newfile = new File("c:\\tmp\\newfile.txt");

        try{
            if (newfile.createNewFile()){
                System.out.println("�t�@�C���̍쐬�ɐ������܂���");
            }else{
                System.out.println("�t�@�C���̍쐬�Ɏ��s���܂���");
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
