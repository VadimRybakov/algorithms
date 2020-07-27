package stackAndQueue;

public class Dec<T> {
    private int head;
    private int tail;
    private int size;
    private T[] arr;
    public Dec(int size) {
        if(size < 1) throw new RuntimeException("size must me >= 1");
        else this.size = size;
        arr = (T[]) new Object[size];
        head = -1;
        tail = 0;
    }

    private void extendCenterArr(T[] array){
        size = size*2;
        T[] temp = (T[]) new Object[size];
        System.arraycopy(array, 0, temp, 0, head + 1);
        System.arraycopy(array, tail, temp, size - (arr.length - tail ), arr.length - tail - 1 );
        arr = temp;
    }

    private T[] extendArr(T[] array){
        size *= 2;
        T[] temp = (T[]) new Object[size];
        System.arraycopy(array, 0, temp, 0, head + 1);
        array = temp;
        return array;
    }

    public void insertLeft(T value){
        if(tail == 0 && head != size - 1) {
            tail = size - 1;
            arr[tail] = value;
        }
        else if(tail == 0 && head == size - 1){
            extendArr(arr);
            tail = size - 1;
            arr[tail] = value;
        }
        else if(tail == head + 1){
            extendCenterArr(arr);
            tail = size - 1;
            arr[tail] = value;
        }
        else {
            tail--;
            arr[tail] = value;
        }
    }

    public void insertRight(T value){
        if(tail == head + 1) {
            extendCenterArr(arr);
            head++;
            arr[head] = value;
        }
        else if(head == size - 1) {
            extendArr(arr);
            head++;
            arr[head] = value;
        }
        else {
            head++;
            arr[head] = value;
        }
    }
    public T removeLeft(){
        if(arr[tail] == null) throw new RuntimeException("Error, deq is empty");
        T temp;
        if( tail == 0 && head == -1)
            throw new RuntimeException("Error, deq is empty");
        else if(tail == size - 1) {
            temp = arr[tail];
            arr[tail] = null;
            tail = 0;
        }
        else {
            temp = arr[tail];
            tail++;
        }
        return temp;
    }
    public T removeRight(){
        T temp;
        if(head < 0 && tail != -1) {
            head = size - 1;
            if(arr[head] == null) throw new RuntimeException("Error, deq is empty");
            temp = arr[head];
            arr[head] = null;
            head--;
        }
        else {
            if(arr[head] == null) throw new RuntimeException("Error, deq is empty");
            temp = arr[head];
            arr[head] = null;
            head--;
        }
        return temp;
    }
}
