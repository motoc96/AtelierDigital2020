package Lab3.visitor;

public interface Visitor {
    void visit(Element[] e);
    void visit(Book book);
    void visit(Audio audio);
    void visit(Video video);

}
