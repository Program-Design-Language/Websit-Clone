import java.io.File;

class fileTest3{

    public static void main(String args[]){
        File file = new File("test.txt");
        String path = file.getAbsolutePath();

        System.out.println("FileÅF" + path);
    }
}
