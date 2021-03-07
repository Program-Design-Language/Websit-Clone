import java.io.File;

class fileTest8{

    public static void main(String args[]){
        File file = new File("c:\\tmp\\newfile.txt");

        if (file.exists()){
            if (file.delete()){
                System.out.println("ファイルを削除しました");
            }else{
                System.out.println("ファイルの削除に失敗しました");
            }
        }else{
            System.out.println("ファイルが見つかりません");
        }
    }
}
