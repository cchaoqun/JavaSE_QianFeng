package Demo4;

import java.util.Scanner;


public class TestFor2 {

    public static void main(String[] args){

        //����һ���༶��5��ͬѧ��ͨ������̨����5��ͬѧ�ķ�����������ƽ����

        //����Scanner���͵ı���
        Scanner input = new Scanner(System.in);

        //��ʼ���ܺ�
        double sum = 0.0;


        for (int i = 1; i <= 5; i++){

            //����̨¼��һ��ѧ���ĳɼ�
            System.out.println("��" + i + "�ĳɼ�Ϊ��");

            double studentScore = input.nextDouble();
            //�Գɼ����
            sum += studentScore;
        }

        double aveScore = sum / 5;

        System.out.println("�༶ƽ���ɼ�Ϊ��" + aveScore);
    }
    
}