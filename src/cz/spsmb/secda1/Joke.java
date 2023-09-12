package cz.spsmb.secda1;

public final class Joke {
    private long id;
    private String text;


    public Joke(long id, String text){
        this.id = id;
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Joke{" +
                "id=" + id +
                ", text='" + text + '\'' +
                '}';
    }
}
