package Modulo8.Extra1;

public class Player {
    int id;
    String name;
    String nickname;
    boolean alive;

    public Player(int id, String name) {
        this.id = id;
        this.name = name;
        this.nickname = name + id;
        this.alive = true;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getNickname() {
        return nickname;
    }
    public boolean getAlive() {
        return alive;
    }
    public boolean play(Revolver r) {
        if (r.shoot()) {
            this.alive = false;
            return true;
        }
        else
            return false;
    }
}
