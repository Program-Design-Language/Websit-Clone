import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.IOException;

class streamTest7{

    public static void main(String args[]){
        try{
            File file = new File("c:\\tmp\\test.txt");

            if (checkBeforeWritefile(file)){
                PrintWriter pw 
                  = new PrintWriter(new BufferedWriter(new FileWriter(file)));

                pw.println("�����̍ō��C����");
                pw.println(10);
                pw.println("�x�ł�");

                pw.close();
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
