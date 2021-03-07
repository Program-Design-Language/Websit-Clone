import java.io.File;

class fileTest5{

    public static void main(String args[]){
        File newfile = new File("c:\\tmp\\sub");

        if (newfile.mkdir()){
            System.out.println("ディレクトリの作成に成功しました");
        }else{
            System.out.println("ディレクトリの作成に失敗しました");
        }
    }
}
