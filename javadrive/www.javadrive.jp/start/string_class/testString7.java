class testString7{

    public static void main(String args[]){
        String str = "�����̓V�C�͐���ł����B�����̓V�C�͐���ł��B";
        System.out.println("�ϊ��O:");
        System.out.println(str);

        str = str.replaceAll("����", "�J");
        System.out.println("�ϊ���:");
        System.out.println(str);
    }
}
