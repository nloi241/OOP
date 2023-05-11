package oop;
public class Member {
    protected String name;
    protected int id;
    protected int moblie;

    @Override
    public String toString() {
        return "Member{" + "name=" + name + ", id=" + id + ", moblie=" + moblie + '}';
    }

    public Member(String name, int id, int moblie) {
        this.name = name;
        this.id = id;
        this.moblie = moblie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMoblie() {
        return moblie;
    }

    public void setMoblie(int moblie) {
        this.moblie = moblie;
    }
    
    
    
};
