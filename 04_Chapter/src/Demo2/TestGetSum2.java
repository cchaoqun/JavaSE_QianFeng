package Demo2;

public class TestGetSum2 {
    
    public static void main(String[] args){
        //��1~100֮������ż���ĺ�

        //����һ�� ��ȡ����ż�������

        //�������� ���ɻ�ȡ1~100֮���ÿһ�����֣�����ż���жϣ��������������

        int i = 1;//��ʼ����

        int sum = 0;

        while (i <= 100){//ѭ������

            if (i % 2 == 0){//ż���ж�

                sum = sum + i;//ѭ������
            }

            i++;
        }

        System.out.println("����ż���ĺ�Ϊ��" + sum);


    }
}