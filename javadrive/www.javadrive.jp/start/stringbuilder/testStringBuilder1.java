class testStringBuilder1{

    public static void main(String args[]){
        dispHantei("�R�c", 89);
        dispHantei("���", 45);
        dispHantei("�ɓ�", 67);
        dispHantei("����", 92);
    }

    private static void dispHantei(String name, int tokuten){
        StringBuilder sb = new StringBuilder();

        sb.append(name);
        sb.append("����̐��т�");
        sb.append(tokuten);
        sb.append("�_�ł��B���ʂ�");
        if (tokuten > 75){
            sb.append("���i");
        }else{
            sb.append("�s���i");
        }
        sb.append("�ł��B");

        System.out.println(new String(sb));
    }
}
