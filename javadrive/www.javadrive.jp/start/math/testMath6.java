class testMath6{

    public static void main(String args[]){
        double a = 42d;
        double b = 100d;
        double c = 0.08d;

        System.out.println("�u" + a + "�v�̎��R�ΐ���");
        System.out.println("�u" + Math.log(a) + "�v�ł��B");

        System.out.println("�u" + b + "�v�����Ƃ���ΐ���");
        System.out.println("�u" + Math.log10(b) + "�v�ł��B");

        System.out.println("�u" + c + "+1�v��^���Ƃ��鎩�R�ΐ���");
        System.out.println("�u" + Math.log1p(c) + "�v�ł��B");
    }
}
