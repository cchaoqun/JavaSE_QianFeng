package Demo2;

public class TestGetSum{

    public static void main(String[] args){

        //�� 1~100֮���������ֵĺ�

        //1.ѭ��100��
        //2.ѭ�����������

        int i = 1;//��ʼ����

        int sum = 0;

        while ( i <= 100){//ѭ������

            sum = sum + i;//ѭ������

            i++;//��������
        }

        System.out.println("�ܺ�Ϊ��" + sum);

        System.out.println("�������...");
    }
}