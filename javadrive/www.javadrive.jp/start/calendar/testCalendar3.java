import java.util.Calendar;

class testCalendar3{

    public static void main(String args[]){

        Calendar calendar = Calendar.getInstance();

        System.out.println("������2005/12/30�ɐݒ肵�܂�");
        calendar.set(2005, 11, 30);
        dispCalendar(calendar);

        System.out.println("-- -- -- -- -- --");

        System.out.println("����1�����������܂�");
        for (int i = 0 ; i < 6 ; i++){
            calendar.add(Calendar.DAY_OF_MONTH, 1);
            dispCalendar(calendar);
        }

        System.out.println("-- -- -- -- -- --");

        System.out.println("������2006/1/31�ɐݒ肵�܂�");
        calendar.set(2006, 0, 31);
        dispCalendar(calendar);

        System.out.println("-- -- -- -- -- --");

        System.out.println("����1�����������܂�");
        for (int i = 0 ; i < 4 ; i++){
            calendar.add(Calendar.MONTH, 1);
            dispCalendar(calendar);
        }

    }

    private static void dispCalendar(Calendar calendar){

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DATE);

        StringBuffer sb = new StringBuffer();
        sb.append("�ݒ肳��Ă��������");
        sb.append(year + "�N" + month + "��" + day + "��");
        sb.append("�ł��B");

        System.out.println(new String(sb));
    }
}
