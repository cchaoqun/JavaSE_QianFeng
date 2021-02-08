package Demo8;

public class TestDoWhile{

    public static void main(String[] args){

        //��ӡ100��HelloWorld

        int i = 1;//��ʼ����

        do{//ֱ��ִ��ѭ��������û���������

            System.out.println("HelloWorld" + i);//ѭ������

            i++;//��������
        }while(i <= 100);//�ж����㣬��ѭ���������㣬����ִ��һ�� ��ִ�д��� 1~n�Σ�

        System.out.println("End of program");

    }
}