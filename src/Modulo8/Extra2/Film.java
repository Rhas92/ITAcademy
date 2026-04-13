package Modulo8.Extra2;

public class Film {
    String title;
    int length;
    int minAge;
    String director;

    public Film(String title, int length, int minAge, String director) {
        this.title = title;
        this.length = length;
        this.minAge = minAge;
        this.director = director;
    }
    public String getTitle() {
        return title;
    }
    public int getLength() {
        return length;
    }
    public int getMinAge() {
        return minAge;
    }
    public String getDirector() {
        return director;
    }

    @Override
    public String toString() {
        return ("\nFilm info: " + "\nTitle: " + this.title +
                "\nLength: " + this.length + " min" + "\nMinimum Age: " + this.minAge + "\nDirector: " + this.director);
    }
}
