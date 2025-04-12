public class MyMinHeap<T extends Comparable<T>> {
    private MyArrayList<T> heap;

    public MyMinHeap() {
        heap = new MyArrayList<>();
    }

    public void add(T item) {
        heap.add(item);
        heapifyUp(heap.size() - 1);
    }

    public T peek() {
        if (heap.size() == 0) throw new RuntimeException("Heap is empty");
        return heap.get(0);
    }

    public T poll() {
        if (heap.size() == 0) throw new RuntimeException("Heap is empty");

        T result = heap.get(0);
        T lastItem = heap.get(heap.size() - 1);
        heap.remove(heap.size() - 1);

        if (heap.size() > 0) {
            heap.getRawArray()[0] = lastItem;
            heapifyDown(0);
        }

        return result;
    }

    private void heapifyUp(int index) {
        Object[] arr = heap.getRawArray();
        while (index > 0) {
            int parentIdx = (index - 1) / 2;
            T current = (T) arr[index];
            T parent = (T) arr[parentIdx];

            if (current.compareTo(parent) < 0) {
                Object tmp = arr[index];
                arr[index] = arr[parentIdx];
                arr[parentIdx] = tmp;
                index = parentIdx;
            } else {
                break;
            }
        }
    }

    private void heapifyDown(int index) {
        Object[] arr = heap.getRawArray();
        int size = heap.size();

        while (index < size) {
            int left = 2 * index + 1;
            int right = 2 * index + 2;
            int smallest = index;

            if (left < size && ((T) arr[left]).compareTo((T) arr[smallest]) < 0) {
                smallest = left;
            }

            if (right < size && ((T) arr[right]).compareTo((T) arr[smallest]) < 0) {
                smallest = right;
            }

            if (smallest != index) {
                Object tmp = arr[index];
                arr[index] = arr[smallest];
                arr[smallest] = tmp;
                index = smallest;
            } else {
                break;
            }
        }
    }

    public boolean isEmpty() {
        return heap.size() == 0;
    }

    public int size() {
        return heap.size();
    }
}