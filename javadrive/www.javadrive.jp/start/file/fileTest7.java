import java.io.File;

class fileTest7{

    public static void main(String args[]){
        File newfile = new File("c:\\temp\\sub");

        if (newfile.mkdirs()){
            System.out.println("�f�B���N�g���̍쐬�ɐ������܂���");
        }else{
            System.out.println("�f�B���N�g���̍쐬�Ɏ��s���܂���");
        }
    }
}
