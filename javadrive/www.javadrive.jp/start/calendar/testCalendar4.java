import java.util.Calendar;

class testCalendar4{

    public static void main(String args[]){

        Calendar calendar1 = Calendar.getInstance();

        System.out.println("����1��2006/05/08 09:45:10�ɐݒ肵�܂�");
        calendar1.set(2006, 4, 8, 9, 45, 10);

        Calendar calendar2 = Calendar.getInstance();

        System.out.println("����2��2006/05/11 12:58:15�ɐݒ肵�܂�");
        calendar2.set(2006, 4, 11, 12, 58, 15);

        int diff = calendar1.compareTo(calendar2);

        if (diff == 0){
            System.out.println("���t1�Ɠ��t2�͓��������ł�");
        }else if (diff > 0){
            System.out.println("���t1�͓��t2���i��ł��܂�");
        }else{
            System.out.println("���t1�͓��t2���x��Ă��܂�");
        }
    }
}
