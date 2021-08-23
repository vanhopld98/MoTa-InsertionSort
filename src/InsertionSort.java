import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int[] list) {
        int pos, temp;
        for (int i = 1; i < list.length; i++) {
            temp = list[i];
            pos = i;
            System.out.println("Gán temp = " + temp + ", pos = " + pos);

            while (pos > 0 && temp < list[pos - 1]) {
                System.out.println("Thỏa mãn điều kiện pos > 0 && temp < list[pos - 1]");
                System.out.println("Đổi bị trí " + list[pos] + " với " + list[pos - 1]);
                list[pos] = list[pos - 1];
                pos--;
            }
            System.out.println("Gán lại list[pos] = " + temp);
            list[pos] = temp;
            System.out.println("Hết " + i + " vòng lặp");
            System.out.println("Mảng sau khi hết " + i + " vòng lặp");
            for (int element : list) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + size + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.println("Your input list:");
        for (int showList : list) {
            System.out.print(showList + "\t");
        }
        System.out.println("\nBegin sort processing...");
        insertionSort(list);
    }
}