package Demo8;

import java.util.Scanner;

public class BankOperation{

    public static void main(String[] args){

        /* 
        ===================��ӭʹ��ATM�Զ����з���===================
        1������ 2����� 3��ȡ�� 4��ת�� 5����ѯ��� 6���޸����� 0���˳�
        
        ����0���˳�����
        ����0~6��������֣�������������������ֱ������0�˳�����
        Ҫ��ʹ�� switch��do while
        */

        //����Scanner���ͱ���
        Scanner input = new Scanner (System.in);
        //System.out.println();
        
        //����ѭ�������ĳ�ʼֵ
        int opNum = 1;
        do{
            //ÿ����������ǰ�Ĳ�����ʾ
            System.out.println("===================��ӭʹ��ATM�Զ����з���===================");
            System.out.println("1������ 2����� 3��ȡ�� 4��ת�� 5����ѯ��� 6���޸����� 0���˳�");

            //����̨��������
            opNum = input.nextInt();

            //�ж����������Ƿ���0~6֮�䣬���������һ������
            if (opNum < 0 || opNum > 6){

                System.out.println("�����������������"); 
                continue;
            }

            switch(opNum){
                
                case 0:
                    System.out.println("ִ���˳�����");
                    break;
                case 1:
                    System.out.println("ִ�п�������");
                    break;
                case 2:
                    System.out.println("ִ�д���");
                    break;
                case 3:
                    System.out.println("ִ��ȡ���");
                    break;
                case 4:
                    System.out.println("ִ��ת�˹���");
                    break;
                case 5:
                    System.out.println("ִ�в�ѯ����");
                    break;
                case 6:
                    System.out.println("ִ���޸����빦��");
                    break;

            }



        }while(opNum != 0);

        System.out.println("-------�˳�����-------");


    }
}