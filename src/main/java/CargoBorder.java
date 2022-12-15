import java.util.Scanner;

public class CargoBorder {

    public static void main(String[] args) {
        Integer truck = 1 ;
        Integer container = 1 ;
        Integer box ;
        Integer boxInCont = 27;
        Integer contInTruck = 12;
        try {
            System.out.println("How many boxes  , we all calculate");
            Scanner scanner = new Scanner(System.in);
            box = scanner.nextInt();
            System.out.println("Truck :" + truck);
            System.out.println("Container :" + container);
            for (int x = 1; x <= box; x++) {
                System.out.println("Box :" + x);
                if (x % (boxInCont * contInTruck) == 0) {
                    truck++;
                    System.out.println("Truck :" + truck);
                }
                if (x % boxInCont == 0) {
                    container++;
                    System.out.println("Container :" + container);
                }
            }
            System.out.println("All Track :" + truck);
            System.out.println("All Container : " + container);
        }catch (Exception e){
            System.out.println("Не верные данные");
        }

    }
}
