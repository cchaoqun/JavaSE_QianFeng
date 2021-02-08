package Demo3;

public class TestCreates{

    public static void main(String[] args){

        //���鴴���﷨

        //-------------------------
        /* 
        ���������ٷ���ռ�

            ��������[] ������; 
            ������ = new ��������[����];
        */
        int[] array1;

        array1 = new int[4];

        System.out.println(array1[0]);

        //-------------------------
        /* 
        ����������ռ�
            ��������[] ������ = new ��������[����];
        */

        int[] array2 = new int[4];

        System.out.println(array2[0]);

        //-------------------------
        /* 
        ��������ֵ(��)
            ��������[] ������ = new ��������[]{value1, value2, value3, ...}
        */

        int[] array3 = new int[]{11, 22, 33};

        for (int i = 0; i < array3.length; i++){

            System.out.println(array3[i]);
        }

        //-------------------------
        /* 
        ��������ֵ(��)
            ��������[] ������ = {value1, value2, value3, ...}//��ʾ��ʼ����ע�⣬���ɻ���
        */

        int[] array4 = {77, 88, 99};

        for (int i = 0; i < array4.length; i++){

            System.out.println(array4[i]);
        }


    }
}