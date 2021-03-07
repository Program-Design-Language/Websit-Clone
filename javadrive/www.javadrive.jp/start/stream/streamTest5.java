import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class streamTest5{

    public static void main(String args[]){
        try{
            File file = new File("c:\\tmp\\test.txt");

            if (checkBeforeWritefile(file)){
                FileWriter filewriter = new FileWriter(file, true);

                filewriter.write("�͂��B���C�ł�\r\n");
                filewriter.write("�ł͂܂�\r\n");

                filewriter.close();
            }else{
                System.out.println("�t�@�C���ɏ������߂܂���");
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }

    private static boolean checkBeforeWritefile(File file){
        if (file.exists()){
            if (file.isFile() && file.canWrite()){
                return true;
            }
        }

        return false;
    }
}
