package Demo6;

import java.util.Scanner;

public class TestContinue {

    public static void main(String[] args){

        //����һ���༶��5��ͬѧ��ͨ������̨����5��ͬѧ�ķ�����������ƽ����
        //������κ�һλͬѧ�ĳɼ������Ƿ����ݣ�������0~100֮������֣�ʱ���˳�����ѭ��

        //����Scanner���͵ı���
        Scanner input = new Scanner(System.in);

        //��ʼ���ܺ�
        double sum = 0.0;

        for (int i = 1; i <= 5;){

            //����̨¼��һ��ѧ���ĳɼ�
            System.out.println("��" + i + "�ĳɼ�Ϊ��");

            double studentScore = input.nextDouble();

            if (studentScore < 0 || studentScore > 100.0){
                continue;
            }
            //�Գɼ����
            sum += studentScore;

            i++;
        }
        double aveScore = sum / 5;

        System.out.println("�༶ƽ���ɼ�Ϊ��" + aveScore);

    }

}
    
