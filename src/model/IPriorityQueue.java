package model;

public interface IPriorityQueue<T> {
    public T extractMax();
    public void insertElement(int priority, T element);
    public T showMax();
    public String showQueue();
    public void increaseKey(T element, int newPriority);
}
