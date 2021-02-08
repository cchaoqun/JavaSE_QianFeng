package Demo7;

public class TestforNestedFor4 {
    
    public static void main(String[] args){

        /* 
        ��ӡ9*9�˷��ھ���
        */

        //����������
        for (int i = 1; i <= 9; i++){
            //�ڲ��������
            for (int j = 1; j <= i; j++){

                System.out.print(i + " * " + j + " = " + i * j + "\t");

            }
            System.out.println();
        }



    }
}