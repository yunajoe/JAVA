public class Array {
    public static void main(String[] args) {

        int[] intArray = new int[30];
        for(int i = 0; i < intArray.length; i++){
            intArray[i] = i+ 1001;
        }
        String[] remainders = new String[4];
        // String[] remainders = {"Zero","One","Two","Three"}
        remainders[0] = "Zero";
        remainders[1] = "One";
        remainders[2] = "Two";
        remainders[3] = "Three";
        for(int element: intArray){
            System.out.println(remainders[element%4]);
        }
    }
}
