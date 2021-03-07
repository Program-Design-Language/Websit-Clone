import java.util.Calendar;

class testCalendar2{

    public static void main(String args[]){

        Calendar calendar = Calendar.getInstance();

        System.out.println("���݂̓�����ݒ肵�܂�");
        dispCalendar(calendar);

        System.out.println("-- -- -- -- -- --");

        calendar.set(Calendar.YEAR, 2005);
        System.out.println("�N��2005�N�ɐݒ肵�܂�");
        dispCalendar(calendar);

        System.out.println("-- -- -- -- -- --");

        calendar.set(2005, 10, 25);
        System.out.println("�N������2005�N11��25���ɐݒ肵�܂�");
        dispCalendar(calendar);

        System.out.println("-- -- -- -- -- --");

        calendar.set(2005, 10, 25, 14, 18);
        System.out.println("������2005�N11��25��14��18���ɐݒ肵�܂�");
        dispCalendar(calendar);
    }

    private static void dispCalendar(Calendar calendar){
        String[] week_name = {"���j��", "���j��", "�Ηj��", 
                 "���j��", "�ؗj��", "���j��", "�y�j��"};

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DATE);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        int week = calendar.get(Calendar.DAY_OF_WEEK) - 1;

        System.out.println("�ݒ肳��Ă��������");
        System.out.println(year + "�N" + month + "��" + day + "��");
        System.out.println("(" + week_name[week] + ")");
        System.out.println(hour + "��" + minute + "��" + second + "�b");
    }
}
