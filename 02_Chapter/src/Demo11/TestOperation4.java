package Demo11;

public class TestOperation4 {
    public static void main(String[] args){

        int javaScore = 100;
        int webScore = 99;

        //�Ƚ������Ƿ����
        System.out.println( javaScore == webScore );

        //�ֱ��ж϶����Ƿ�����
        System.out.println( javaScore == 100 );
        System.out.println( webScore == 100 );

        //һ�����ж϶����Ƿ�Ϊ����
        //                                  false
        //                         true     &&      false        �������ʽͬʱΪ���Ϊ��         
        System.out.println(javaScore == 100 && webScore == 100 );

        //һ�����ж϶����Ƿ���һ������
        //                                  true
        //                      true        ||       flase 
        System.out.println(javaScore == 100 || webScore == 100);

        boolean result = javaScore == 100;

        //java�ĳɼ���������
        System.out.println(result);//true

        //java�ĳɼ�����������
        System.out.println(!result);//false
    }
    
}