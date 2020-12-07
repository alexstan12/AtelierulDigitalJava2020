package lab3.visitor;

public class DurationVisitor implements Visitor{
    private float totalDuration = 0;
    public String toString(){
        return "The visited element has a total duration of:" + totalDuration;
    }

    @Override
    public void visit(Book book) {
        totalDuration+= book.getNumberOfPages()*5;
    }

    @Override
    public void visit(Video video) {
        totalDuration+=video.getTime()+video.getTime()/30*5;
    }

    @Override
    public void visit(Audio audio) {
        totalDuration+= audio.getTime() + audio.getNumberOfSongs()*0.3;
    }
}
