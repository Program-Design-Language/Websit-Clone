class testIni1{

    public static void main(String args[]){
        java.util.Calendar cal = java.util.Calendar.getInstance();

        int month = cal.get(java.util.Calendar.MONTH) + 1;
        int day = cal.get(java.util.Calendar.DATE);

        System.out.println("������" + month + "��" + day + "�ł�");
    }
}
