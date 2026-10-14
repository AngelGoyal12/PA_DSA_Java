
class CircularQueue {
    int[] arr;
    int front;
    int rear;
    int size;
    int capacity;

    CircularQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    boolean offer(int x) {
        if (size == capacity) {
            return false;
        }

        rear = (rear + 1) % capacity;
        arr[rear] = x;
        size++;
        return true;
    }

    Integer poll() {
        if (size == 0) {
            return null;
        }

        int value = arr[front];
        front = (front + 1) % capacity;
        size--;

        if (size == 0) {
            front = 0;
            rear = -1;
        }

        return value;
    }

    Integer getFront() {
        if (size == 0) {
            return null;
        }
        return arr[front];
    }

    Integer getRear() {
        if (size == 0) {
            return null;
        }
        return arr[rear];
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == capacity;
    }

    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(3);

        q.offer(10);
        q.offer(20);
        q.offer(30);

        System.out.println(q.isFull());
        System.out.println(q.poll());

        q.offer(40);

        System.out.println(q.getFront());
        System.out.println(q.getRear());
    }
}