package main.java.edu.technopolis.homework;


import java.util.HashMap;
import java.util.Map;

public class  LFUCache<T> {
    private static int capacity=10; //объем кэша
    private HashMap<Integer,Node<T>> cache=new HashMap<>();
    private int size;

    public LFUCache() {}

    public LFUCache(int capacity) {this.capacity=capacity;}

    public void add(int key, T value){
        if (!isFull()){
            Node<T> node=new Node<>();
            node.setValue(value);
            node.setFrequency(1);

            cache.put(key,node);
        }else{
            cache.remove(LFUKey());

            Node<T> node=new Node<>();
            node.setValue(value);
            node.setFrequency(1);

            cache.put(key,node);
        }
    }

    public T get(int key){
        if (cache.containsKey(key)){
            Node<T> node=cache.get(key);
            node.frequency++;
            cache.put(key,node);
            return node.getValue();
        }
        return null;
    }

    public int LFUKey(){
        int key=0;
        int minFrequency=Integer.MAX_VALUE;

        for (Map.Entry<Integer,Node<T>> entry:cache.entrySet()) {
            if (minFrequency>entry.getValue().frequency){
                key=entry.getKey();
                minFrequency=entry.getValue().frequency;
            }
        }
        return key;
    }

    public boolean isFull(){
        if(size==capacity) return true;

        return false;
    }

    class Node<T>{
        private T value;
        private int frequency;

        public Node() {}

        public T getValue() {
            return value;
        }

        public int getFrequency() {
            return frequency;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public void setFrequency(int frequency) {
            this.frequency = frequency;
        }
    }

    public static void main(String[] args) {
        LFUCache<Integer> vocabulary=new LFUCache<>();
        for (int i=0;i<15; i++){
            int k=i%10;
            vocabulary.add(k,i);
        }

        System.out.println(vocabulary.get(6));
        System.out.println(vocabulary.get(4));
        System.out.println(vocabulary.get(10));
    }
}