public class Ifelse {
    public static void main(String[] args) {
       int a = 38, b = 28;
       if (a==b){
           System.out.println("a와 b는 똑같습니다. a = b = " + a);
       }else {
             System.out.println("a와 b는 똑같지 않습니다");
           if(a>b){
             System.out.println("a가 b보다 "+(a-b)+"만큼 더 큽니다");
           }else {
               System.out.println("b가 a보다 "+(b-a)+"만큼 더 큽니다");
           }
       }
    }
}
