package Demo3;

import java.util.Scanner;

public class TestMultipleIf{

    public static void main(String[] args){
        //System.out.println();
        /* 
        ����Ԥ����ѡ������

        Ԥ�� > 100�� ����S��
        Ԥ�� > 50��  ����5ϵ
        Ԥ�� > 10��  ����
        Ԥ�� < 10��  ������
        */

        Scanner budget = new Scanner(System.in);

        System.out.println("���������Ĺ���Ԥ�㣺");
        
        double b = budget.nextDouble();//����Ԥ����

        if (b > 100){
            System.out.println("����S��");
        }else if(b > 50){
            System.out.println("����5ϵ");
        }else if(b >10){
            System.out.println("����");
        }else{
            System.out.println("������");
        }

        System.out.println("��ӭ�´ι��٣�");
        
    }
}