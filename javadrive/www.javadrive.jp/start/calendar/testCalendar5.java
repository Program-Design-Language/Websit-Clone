import java.util.Calendar;

class testCalendar5{

    public static void main(String args[]){

        Calendar calendar1 = Calendar.getInstance();

        System.out.println("����1��2006/05/08 09:45:10�ɐݒ肵�܂�");
        calendar1.clear();
        calendar1.set(2006, 4, 8, 9, 45, 10);
        long millis1 = calendar1.getTimeInMillis();
        System.out.println("�G�|�b�N����̌o�߃~���b�̒l��" + millis1 + "�ł�");

        Calendar calendar2 = Calendar.getInstance();

        System.out.println("����2��2006/05/11 12:58:15�ɐݒ肵�܂�");
        calendar2.clear();
        calendar2.set(2006, 4, 11, 12, 58, 15);
        long millis2 = calendar2.getTimeInMillis();
        System.out.println("�G�|�b�N����̌o�߃~���b�̒l��" + millis2 + "�ł�");

        long diff = millis2 - millis1;
        System.out.println("�����̍���" + diff  + "�~���b�ł�");

        diff = diff / 1000;    /* �b�ȉ��؎̂� */

        long se = diff % 60;
        diff = diff / 60;

        long mi = diff % 60;
        diff = diff / 60;

        long ho = diff % 24;
        long day = diff / 24;

        System.out.println(day + "����" + ho + "��" + mi + "��" + se + "�b");
    }
}
