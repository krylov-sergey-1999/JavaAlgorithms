package Sort.SelectSort;

public class ArraySel {
    private long[] a; // ссылка на массив a
    private int nElems; // кол-во элементов данных

    public ArraySel(int max) {  // Конструктор
        a = new long[max];  // Создание массива
        nElems = 0;  // Пока нет ни одного элемента
    }

    public void insert(long value) {  // Вставка элемента в массив
        a[nElems] = value;  // Собственно вставка
        nElems++; // Увеличение размера
    }

    public void display() {  // Вывод содержимого массива
        for (int i = 0; i < nElems; i++)
            System.out.print(a[i] + " ");
        System.out.println("");
    }

    public void selectionSort() {
        int out, in, min;
        for (out = 0; out < nElems - 1; out++) {
            min = out;
            for (in = out + 1; in < nElems; in++)
                if (a[in] < a[min])
                    min = in;
            swap(out, min);
        }
    }

    public void swap(int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
}
