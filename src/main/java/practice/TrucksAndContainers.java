package practice;

import java.util.Scanner;

public class TrucksAndContainers {

    private static final int MAX_CONTAINERS_PER_ONE_TRUCK = 12;
    private static final int MAX_BOXES_PER_ONE_CONTAINER = 27;

    private static String newLineUniversal = System.lineSeparator();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countBoxes = scanner.nextInt();

        int truck = 0;
        int containers = 0;

        if (countBoxes > 0) {
            System.out.println("Грузовик: " + ++truck + newLineUniversal + '\t' + "Контейнер: " + ++containers);
        } else {
            truck = 0;
            containers = 0;
        }
        for (int box = 1; box <= countBoxes; box++) {
            System.out.println("\t" + "\t" + "Ящик: " + box);
            if (box % (MAX_BOXES_PER_ONE_CONTAINER * MAX_CONTAINERS_PER_ONE_TRUCK) == 0) {
                System.out.println("Грузовик: " + ++truck);

            }
            if (box % MAX_BOXES_PER_ONE_CONTAINER == 0 && countBoxes > MAX_BOXES_PER_ONE_CONTAINER) {
                System.out.println('\t' + "Контейнер: " + ++containers);
            }
        }

        System.out.println("Необходимо:" + newLineUniversal + "грузовиков - " + truck + " шт." + newLineUniversal + "контейнеров - " + containers + " шт.");
    }
}



        // TODO: вывести в консоль коробки разложенные по грузовикам и контейнерам
        // пример вывода при вводе 2
        // для отступа используйте табуляцию - \t

        /*
        Грузовик: 1
            Контейнер: 1
                Ящик: 1
                Ящик: 2
        Необходимо:
        грузовиков - 1 шт.
        контейнеров - 1 шт.
        */

