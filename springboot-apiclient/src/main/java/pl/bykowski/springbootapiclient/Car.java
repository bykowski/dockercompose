package pl.bykowski.springbootapiclient;

public class Car {

    private Long id;

    private String mark;

    public Car() {
    }

    public Car(Long id, String mark) {
        this.id = id;
        this.mark = mark;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
}
