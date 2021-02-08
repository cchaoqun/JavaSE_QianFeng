package Demo4;

import java.util.Scanner;

public class TestNestedIf{
    public static void main(String[] args){
        //System.out.println();
        /* 
        �����˶���
        �ɼ�С��10s�Ľ����ܾ���
        */

        //����Scanner���ͱ�����¼��ɼ����Ա�

        Scanner timerInput = new Scanner(System.in);

        Scanner sexInput = new Scanner(System.in);

        System.out.println("���������ĳɼ�");
        double timer = timerInput.nextDouble();//¼������ɼ�

        System.out.println("�����������Ա�");
        String sex = sexInput.next();//¼���Ա�
        //String sex = "��";

        if(timer <= 10){//�������

            //�����ܾ���
            if(sex == "��"){//�ڲ�����
                System.out.println("�����������ܾ���");
            }else{
                System.out.println("����Ů�����ܾ���");
            }

        }else{
            System.out.println("��̭");
        }
    }

}