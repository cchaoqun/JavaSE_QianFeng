package Demo5;

import java.util.Scanner;

public class TestBreak {

    public static void main(String[] args){

        //����һ���༶��5��ͬѧ��ͨ������̨����5��ͬѧ�ķ�����������ƽ����
        //������κ�һλͬѧ�ĳɼ������Ƿ����ݣ�������0~100֮������֣�ʱ��ֱ���˳�����ѭ���ṹ

        //����Scanner���͵ı���
        Scanner input = new Scanner(System.in);

        //��ʼ���ܺ�
        double sum = 0.0;

        //�Ϸ����ݱ��
        boolean flag = true;


        for (int i = 1; i <= 5; i++){

            //����̨¼��һ��ѧ���ĳɼ�
            System.out.println("��" + i + "�ĳɼ�Ϊ��");

            double studentScore = input.nextDouble();

            if (studentScore < 0 || studentScore > 100.0){

                flag = false;//�Ƿ�����

                break;
            }
            //�Գɼ����
            sum += studentScore;
        }
        if(flag == true){//����flag��Ǿ����Ƿ���Ҫ������������

            double aveScore = sum / 5;

            System.out.println("�༶ƽ���ɼ�Ϊ��" + aveScore);

        }else{

            System.out.println("�Ƿ����ݣ�����������ɼ�������ƽ����");
        }

            
        
        
    }
    
}