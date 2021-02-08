package Demo5;

import java.util.Scanner;

public class TestSwitch{
    public static void main(String[] args){

        /* 
        һ��ʳ��

        ��һ �� ����
        �ܶ� �� ����
        ���� �� ³��
        ���� �� �ղ�
        ���� �� ���
        ���� �� ����
        ���� �� ����
        */
        //����Scanner���ͱ���
        Scanner weekDayInput = new Scanner(System.in);

        System.out.println("��������������");

        int weekDay = weekDayInput.nextInt();//����������������1-7��

        switch(weekDay){//����weekDay��ֵ���ҵ�ƥ���case,��ִ���߼�����

            default:
                 System.out.println("������1-7֮�������");
                 break;
            case 1:
                System.out.println("����");
                break;
            case 3:
                System.out.println("³��");
                break;
            case 4:
                System.out.println("�ղ�");
                break;
            case 5:
                System.out.println("���");
                break;
            //����ִ����ͬ�߼������case���Էŵ�һ����Ϊswitch�����˳��
            case 2:
            case 6:
            case 7:
                System.out.println("����");
                break;
        }
        System.out.println("�������");
    }

}