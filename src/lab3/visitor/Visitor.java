package lab3.visitor;

public interface Visitor {
    public void visit(Book book);
    public void visit(Video video);
    public void visit(Audio audio);

}
