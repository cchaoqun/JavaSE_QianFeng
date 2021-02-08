package Demo2;

public class TestDefaultValue{

    public static void main(String[] args){

        //�����Ĭ��ֵ

        //������Ĭ��ֵ��
        // ������0
        // С����0.0
        // �ַ���\u0000 (��ӦASCII���һ�� �հ�)
        // ������false
        // ������null
        

        int[] a = new int[5];
        //��û��Ϊ���鸳ֵ������£����ɿ�����ȷ����
        for (int i = 0; i < a.length; i++){

            System.out.println(a[i]);
        }

        String[] strs = new String[5];

        for (int i = 0; i < a.length; i++){

            System.out.println(strs[i]);
        }
    }
}