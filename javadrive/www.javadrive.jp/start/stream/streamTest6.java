import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

class streamTest6{

    public static void main(String args[]){
        try{
            File file = new File("c:\\tmp\\test.txt");

            if (checkBeforeWritefile(file)){
                BufferedWriter bw
                  = new BufferedWriter(new FileWriter(file));

                bw.write("����ɂ���");
                bw.newLine();
                bw.write("�����C�ł����H");
                bw.newLine();

                bw.close();
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
