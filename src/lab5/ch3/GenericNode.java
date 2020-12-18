package lab5.ch3;

public class GenericNode<T> implements IGenericNode<T>{
    private T value;
    private IGenericNode<T> next=null;

    public GenericNode(T value) {
        this.value = value;
    }

    @Override
    public T getValue() {
        return value;
    }

    @Override
    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public IGenericNode<T> getNext() {
        return next;
    }

    @Override
    public void setNext(IGenericNode<T> next) {
        this.next = next;
    }
}
