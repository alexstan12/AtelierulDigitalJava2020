package lab3.visitor;

public class Main {
    public static void main(String[] args) {
        Element e1 = new Book(50,"Book Name");
        Element e2 = new Video("Video Name", 120);
        Element e3 = new Audio(180, "Album", 20);

        Element[] elements = new Element[]{e1,e2, e3};
        Visitor visitor = new DurationVisitor();
        for(Element element:elements){
            element.accept(visitor);
        }
        System.out.println(visitor);

        NameVisitor nameVisitor = new NameVisitor();
        for(Element element:elements){
            element.accept(nameVisitor);
        }
        System.out.println(nameVisitor.getName());
    }
}
