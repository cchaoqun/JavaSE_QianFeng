package Demo5;

import java.util.Scanner;

public class TestCheckArray{

    public static void main(String[] args){

        //����һ���������飬����һ������n,���n�����������У�����±꣬�������-1

        //����һ��Scanner���ͱ���
        Scanner input = new Scanner(System.in);

        //����һ����������
        int[] array = new int[]{11, 22, 33, 44, 55};

        //����һ������ 
        System.out.println("������һ��������");
        int num = input.nextInt();

        //��������Ƿ������������
        int flag = -1;//����num��δ������������

        for (int i = 0; i < array.length; i++){

            if (array[i] == num){
                flag = i;//�ı�flag����num�����ֵ�λ��
                break;
            }
        }
        System.out.println("�±�Ϊ��" + flag);


    }
}