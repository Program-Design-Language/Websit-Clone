class testString4{

    public static void main(String args[]){
        String str1 = new String(" Good Morning   ");

        System.out.println("���̕�����u" + str1 + "�v");
        System.out.println("��������" + str1.length() + "�ł�");

        String new_str1 = str1.trim();

        System.out.println("�󔒂���菜����������u" + new_str1 + "�v");
        System.out.println("��������" + new_str1.length() + "�ł�");
    }
}
