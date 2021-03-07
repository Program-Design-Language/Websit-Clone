import java.io.File;
import java.io.IOException;

class fileTest4{

    public static void main(String args[]){
        File newfile = new File("c:\\tmp\\newfile.txt");

        try{
            if (newfile.createNewFile()){
                System.out.println("ファイルの作成に成功しました");
            }else{
                System.out.println("ファイルの作成に失敗しました");
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
