class testStringBuilder2{

    public static void main(String args[]){
        StringBuilder sb = new StringBuilder();
        sb.append("����ɂ��́B���C�ł��B");
        sb.insert(5, "��؂���");

        System.out.println(new String(sb));
    }
}
