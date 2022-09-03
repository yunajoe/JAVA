public class Switch {
    public static void main(String[] args) {
        int number = 134354;
        String answer;
        switch(number % 7) {
            case 1:
                System.out.println("One");
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("Six");
                break;

            default:
                System.out.println("zero");
                break;
        }

    }
}
