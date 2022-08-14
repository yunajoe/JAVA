public class Operator {
    public static void main(String[] args){
        // 문자열 연산 (+)
        String myString = "오늘도" + "화이팅";
        System.out.println(myString);
        // 문자열과 숫자를 더하면 숫자가 저절로 문자열로 변환
        System.out.println("I'am " + 33 + " years old");
        // 문자열과  불린을 더하면 불린이 저절로 문자열로 변환
        System.out.println("The result is" + false);

        // 특수한 문자("") 를 사용하고 싶다면 \를 사용하자
        System.out.println("스티브잡스 \"connetcting the dots\" 는 중요한 말");


        // 숫자 연산자

        // 불린 연산자는 비교와 불린연산으로 나뉠 수 있다.
        // 비교 연산자 (Comparison Operators)
        int a = 3;
        int b = 5;
        System.out.println(a > b);  // a가 b보다 크다
        System.out.println(a >= b); // a가 b보다 크거나 같다
        System.out.println(a < b);  // a가 b보다 작다
        System.out.println(a <= b); // a가 b보다 작거나 같다
        System.out.println(a == b); // a와 b는 같다
        System.out.println(a != b); // a와 b는 같지 않다.
        // 불린 연산자 (Boolean Operators)
        // AND(&&)의 경우 양쪽 다 true이어야만 true가 나오고, 한쪽이라도 false면 false
        // OR(||)의 경우 양쪽 다 false이어야만 false가 나오고, 한쪽이라도 true면 true
        // NOT(!)의 경우 불린값을 뒤집어준다
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);


        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println(!true);
        System.out.println(!false);
















    }
}
