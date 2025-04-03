package Main.Models.Services.Impl;

import Main.Models.Booking;

public class MaxHeap {
    private final Booking[] heap;
    private int size;
    private final int capacity;

    public MaxHeap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new Booking[capacity + 1];
    }

    private int parent(int index) {
        return index / 2;
    }

    private int leftChild(int index) {
        return 2 * index;
    }

    private int rightChild(int index) {
        return 2 * index + 1;
    }

    private void swap(int i, int j) {
        Booking temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public void insert(Booking booking) {
        if (size >= capacity) {
            System.out.println("Heap is full. we can't insert more values.");
            return;
        }

        size++;
        heap[size] = booking;
        int current = size;

        while (current > 1 && compare(heap[current], heap[parent(current)]) > 0) {
            swap(current, parent(current));
            current = parent(current);
        }
        display();
    }

    private int compare(Booking a, Booking b) {
        if (a.getPriorityCode() != b.getPriorityCode()) {
            return Integer.compare(a.getPriorityCode(), b.getPriorityCode());
        } else {
            return Double.compare(a.getBookingAmount(), b.getBookingAmount());
        }
    }
    public void deleteMax() {
        if(size == 0){
            System.out.println("Heap is empty");
            return;
        }
        Booking max = heap[1];
        heap[1] = heap[size];
        size--;

        heapify(1);
        display();
    }

    private void heapify(int index){
        int left = leftChild(index);
        int right = rightChild(index);
        int largest = index;

        if(left <= size && compare(heap[left], heap[largest]) > 0){
            largest = left;
        }

        if(right <= size && compare(heap[right], heap[largest]) > 0){
            largest = right;
        }
    if(largest != index){
        swap(index, largest);
        heapify(largest);
      }
    }
    public void display(){
        System.out.println("Current Heap");
        if(size == 0){
            System.out.println("Heap is empty");
        } else {
            for (int i=1; i <= size; i++){
                System.out.println(heap[i] + " ");
            }
            System.out.println("\n");
        }
    }
}
