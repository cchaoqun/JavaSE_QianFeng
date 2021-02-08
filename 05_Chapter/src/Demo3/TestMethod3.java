package Demo3;

public class TestMethod3 {
    

    //�����ڶ�ε���printSign����ʱ����ӡ��ͬ�����ķ���
    public static void main(String[] args){

        System.out.println("��ǰ���¹�");

        printSign(5 , '#');//ʵ�ʲ�����10 , '#'�ڵ��ô��η���ʱ���������δ���ʵ�ʲ���ֵ��Ϊ��ʽ������ֵ(���ͣ�������˳��������βζ�Ӧ)

        System.out.println("���ǵ���˪");
   
        printSign(10, '$');

        System.out.println("��ͷ������");
      
        printSign(15, '%');

        System.out.println("��ͷ˼����");

        printSign(20 , '*');
    }

    //�Զ��巽��
    public static void printSign(int count, char sign){//int count : ��ʽ����������������ʱ��ѭ��count��sign

        for (int i = 1; i <= count; i++){

            System.out.print(sign);
        }

        System.out.println();
    }
    
}