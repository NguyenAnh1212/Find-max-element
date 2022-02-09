import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        // khai báo mảng và độ dài mảng, cho phép nhập tối đa 20 phần tử.
        int size;
        int [] array;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if(size > 20){
                System.out.println("Size should not exceed 20");
            }
        }while (size >20);
        array = new int[size];
        //Nhập giá trị cho các phần tử của mảng
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element "+(i+1) +": ");
            array[i] = scanner.nextInt();
        }
        System.out.print("Property list: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        // Duyệt mảng tìm giá trị lớn nhất và vị trí
        int max = array[0];
        int index = 1;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
                index = i +1;
            }
        }
        System.out.println("\n"+"The largest property value in the list is " + max + " ,at position " + index);
    }
}
