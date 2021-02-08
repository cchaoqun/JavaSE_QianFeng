package Demo4;

public class TestGetAvg{

    public static void main(String[] args){

        //ͳ������Ԫ�ص�ƽ��ֵ

        int[] array = new int[]{55, 66, 77, 88, 99};

        int sum = 0;

        for (int i = 0; i < array.length; i++){

            sum += array[i];
        }

        double result = sum / array.length;

        System.out.println(result);
    }
}