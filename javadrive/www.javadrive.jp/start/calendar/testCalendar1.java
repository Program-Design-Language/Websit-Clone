import java.util.Calendar;

class testCalendar1{

    public static void main(String args[]){
        String[] week_name = {"���j��", "���j��", "�Ηj��", 
                 "���j��", "�ؗj��", "���j��", "�y�j��"};

        Calendar calendar = Calendar.getInstance();

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DATE);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        int week = calendar.get(Calendar.DAY_OF_WEEK) - 1;

        int day_of_year = calendar.get(Calendar.DAY_OF_YEAR);



        System.out.println("���݂̓�����");
        System.out.println(year + "�N" + month + "��" + day + "��");
        System.out.println("(" + week_name[week] + ")");
        System.out.println(hour + "��" + minute + "��" + second + "�b");

        System.out.println("�����͍��N��" + day_of_year + "���ڂł�");
    }
}
