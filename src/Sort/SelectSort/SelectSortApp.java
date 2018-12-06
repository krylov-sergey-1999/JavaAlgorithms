package Sort.SelectSort;
public class SelectSortApp {
    public static void main(String[] args) {
        int maxSize = 100;
        ArraySel arr;
        arr = new ArraySel(maxSize);
        arr.insert(15);
        arr.insert(64);
        arr.insert(23);
        arr.insert(64);
        arr.insert(26);
        arr.insert(84);
        arr.insert(90);
        arr.insert(101);
        arr.display();
        arr.selectionSort();
        arr.display();
    }
}
