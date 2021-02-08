package Demo7;

import java.util.Scanner;

public class TestNestedFor2 {

    public static void main(String[] args){

        //���������࣬ÿ����5��ͬѧ�ĳɼ�


        //����Scanner���ͱ���
        Scanner input = new Scanner(System.in);

        //i���������༶
        for (int i = 1; i <= 3; i++){

            //��ʼ���ܺͱ���
            double sum = 0.0;

            System.out.println("****��" + i + "���༶****");

            for (int j = 1; j <= 5; j++){

                System.out.println("��" + j + "��ͬѧ�ĳɼ���");

                double score = input.nextDouble();

                sum += score;

            }
            //�����
            double ave = sum / 5;

            System.out.println("��" + i + "���༶�ľ���Ϊ��" + ave);

        }

    }
    
}