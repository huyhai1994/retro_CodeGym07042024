import java.lang.reflect.Array;
import java.util.Arrays;

public class BaiTap {
    public static void main(String[] args) {
        int[] arr = new int[10];  // them phan tu moi  tu dong tang length len;
        // ArrayList -> giong js nhung chi chua 1 kieu du lieu;
        int size = 5;  // So luong phan tu
        System.out.println("Mang truoc them: ");
        System.out.println(Arrays.toString(arr));
        size = addElement(arr,2,size);
        System.out.println("Mang sau them: ");
        System.out.println(Arrays.toString(arr));
        // insert : element -> arrays
        size = insertElement(arr,-25,1,size);
        System.out.println("mang sau khi chen: ");
        System.out.println(Arrays.toString(arr));
        searchElement(arr,size,-25);
        size = removeElement(arr,1,size);
        System.out.println("Mang sau khi xoa: ");
        System.out.println(Arrays.toString(arr));
        editElement(arr, 0, 97);
        System.out.println("Mang sau khi sua: ");
        System.out.println(Arrays.toString(arr));
    }
    
    public static int addElement(int [] array, int item, int size ) {
        array[size] = item;
        size++;
        return size;
    }
    public static int insertElement(int [] arr, int item, int index,int size) {
        for (int i = size; i > index; i--) {
            arr[i] = arr[i-1];
        }
        arr[index] = item;
        size++;
        return size;
    }
    public static void searchElement(int [] array, int size, int item){
        for (int i = 0; i < size; i++) {
            if (array[i] == item){
                System.out.println("Vi tri phan tu" + item + " la" + i);
            }
        }
    }
    public static int removeElement (int[] array, int index, int size){
        for (int i = index; i < size; i++) {
            array[i] = array[i+1];
        }
        size--;
        return size;
    }
    public static void editElement(int[] array, int index, int item){
        array[index] = item;
    }
}