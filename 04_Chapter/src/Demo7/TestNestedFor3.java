package Demo7;

public class TestNestedFor3{

    public static void main(String[] args){

        /* 
        ��ӡֱ��������
        *
        **
        ***
        ****
        *****

        */

        //����������
        for (int i = 1; i <= 5; i++){
            //�ڲ��������
            for (int j = 1; j <= i; j++){

                System.out.print('*');

            }
            System.out.println();
        }



    }
}