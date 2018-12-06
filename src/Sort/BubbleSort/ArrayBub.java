package Sort.BubbleSort;

public class ArrayBub {
    private long[] a; // ссылка на массив a
    private int nElems; // кол-во элементов данных

    public ArrayBub(int max) {  // Конструктор
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

    public void bubbleSort() {
        int out, in;
        for (out = nElems - 1; out > 1; out--)
            for (in = 0; in < out; in++)
                if (a[in] > a[in + 1])
                    swap(in, in + 1);
    }

    public void swap(int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
}
