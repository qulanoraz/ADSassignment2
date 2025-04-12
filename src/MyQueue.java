public class MyQueue<T> {
    private MyLinkedList<T> list = new MyLinkedList<>();

    public void enqueue(T item) {
        list.add(item);
    }

    public T dequeue() {
        if (list.size() == 0) throw new RuntimeException("Queue is empty");
        T item = list.get(0);
        list.remove(0);
        return item;
    }

    public T peek() {
        if (list.size() == 0) throw new RuntimeException("Queue is empty");
        return list.get(0);
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }
}