class testString5{

    public static void main(String args[]){
        String str = "���,������,������,�Ԃǂ�";
        String[] fruit = str.split(",", 0);

        for (int i = 0 ; i < fruit.length ; i++){
            System.out.println(i + "�Ԗڂ̗v�f = :" + fruit[i]);
        }
    }
}
