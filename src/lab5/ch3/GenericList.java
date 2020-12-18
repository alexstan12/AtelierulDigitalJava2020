package lab5.ch3;

public class GenericList<T> implements IGenericList<T> {
    private IGenericNode<T> root;
    private IGenericNode<T> currentNode;

    public GenericList(T rootValue){
        this.root = new GenericNode<>(rootValue);
        this.currentNode = this.root;
    }
    public void insert(T element) {
        GenericNode<T> newNode = new GenericNode<>(element);
        currentNode.setNext(newNode);
        currentNode = currentNode.getNext();
    }

    @Override
    public void println() {
        IGenericNode<T> temp = root;
        while(temp.getNext()!=null){
            System.out.print(temp.getValue()+",");
            temp= temp.getNext();
        }
        System.out.println();
    }
}
