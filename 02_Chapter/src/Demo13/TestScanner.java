package Demo13;//package������Դ�ļ�������

import java.util.Scanner;//1.�����ⲿ�ļ�

public class TestScanner{

    public static void main(String[] args){
        
        //2.������һ��Scanner���͵ı���

        Scanner input = new Scanner(System.in);  
        
        //3.ʹ��
        System.out.println("������һ�����֣�");//����̨��ȡһ������

        int i = input.nextInt();

        System.out.println("�������ֵΪ��" + i);
    }
}