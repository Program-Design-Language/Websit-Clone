import java.io.File;

class fileTest9{

    public static void main(String args[]){
        File file = new File("c:\\tmp\\test.txt");

        checkPermission(file);

        if (file.setReadOnly()){
            System.out.println("�t�@�C����ǂݎ���p�ɂ��܂���");
        }else{
            System.out.println("�ǂݎ���p�ɕύX�����s���܂���");
        }

        checkPermission(file);
    }

    private static void checkPermission(File file){
        if (file.canRead()){
            System.out.println("�t�@�C���͓ǂݍ��݉\�ł�");
        }

        if (file.canWrite()){
            System.out.println("�t�@�C���͏������݉\�ł�");
        }
    }
}
