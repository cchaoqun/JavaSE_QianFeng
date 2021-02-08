package Demo13;

import java.util.Scanner;

public class TestScanner2 {

    public static void main(String[] args){
        System.out.println();
        //����Scanner���ͱ���
        Scanner input = new Scanner(System.in);

        System.out.println("������һ��ֵ");

        int i = input.nextInt();//��������

        double d = input.nextDouble();//����С��

        String str = input.next();//�����ַ���

        char c = input.next().charAt(0);//���������ַ����ĵ�һ���ַ�

        System.out.println("����: " + i );
        System.out.println("С��: " + d);
        System.out.println("�ַ���: " + str);
        System.out.println("�ַ�����һ���ַ�: " + c);
    }
    
}