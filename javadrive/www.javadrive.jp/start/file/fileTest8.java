import java.io.File;

class fileTest8{

    public static void main(String args[]){
        File file = new File("c:\\tmp\\newfile.txt");

        if (file.exists()){
            if (file.delete()){
                System.out.println("�t�@�C�����폜���܂���");
            }else{
                System.out.println("�t�@�C���̍폜�Ɏ��s���܂���");
            }
        }else{
            System.out.println("�t�@�C����������܂���");
        }
    }
}
