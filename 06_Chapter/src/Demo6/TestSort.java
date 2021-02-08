package Demo6;/* 
����ĸ���
    һ�������Ĵ洢�ռ䣬�洢��ͬ�������͵�ֵ

���������
    int[] ������ = new int[];

����ķ���
    ��ֵ��������[�±�] = ֵ��
    ȡֵ��������[�±�];

����ı���
    ��ͷ��β����һ������Ԫ�ط���

�����Ӧ��
    ����Ԫ��ͳ�ƣ���������Ԫ�أ�����JDK��������Ԫ�ص���

*/




import java.util.Arrays;
public class TestSort{

    public static void main(String[] args){

        //���������
        /* 
            JDK����java.util.Arrays.sort(������);//JDK�ṩ(����)
        */

        int[] num = new int[]{4, 2, 5, 6, 3, 1};

        //����JDK�ṩ�����鹤�ߣ���������
        Arrays.sort(num);

        //��һ�α���������
        System.out.println("��һ�α���(����)");
        for (int i = 0; i < num.length; i++){

            System.out.println(num[i]);
        }

        //������Ҫ�ֹ��ķ�ʽ��ɵ��� 
        for (int i = 0; i < num.length / 2; i++){
            
            int temp = num[i];

            num[i] = num[num.length -i -1];

            num[num.length -i -1] = temp;
        }

        //��һ�α���������
        System.out.println("�ڶ��α���(����)");
        for (int i = 0; i < num.length; i++){

            System.out.println(num[i]);
        }
    }
}