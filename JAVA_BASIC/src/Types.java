public class Types {
    public static void main(String[] args){
        // 정수형
        byte a = 127;
        int b = 30; // 정수형 default
        short c = 100;
        long d = 12345678910L; // long을 표현하기위한 리터럴은 뒤에l(소문자 엘)또는 L(대문자 엘)을 붙여준다. 
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        // 소수형
        double e = 3.14; // 실수형 default
        float f = 3.14f;
        
        // 글자
        char a1 = 'a';
        char a2 = 97;  // 'a'에 해당하는 ASCII 값
        char a3 = '\u0061'; // 'a'에 해당하는 유니코드 값

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        // 불린
        boolean myBoolean = true;
        boolean myBoolean2 = false;
        System.out.println(myBoolean);
        System.out.println(myBoolean2);

        /**
        String은 기본 자료형이 아니라 클래스
         ""(큰 따옴표)를 사용한다.
         **/
        String str = "My name is ";
        String str2 = "여나당";


        System.out.print(str);
        System.out.print(str2);







    }
}
