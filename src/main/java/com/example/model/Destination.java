package com.example.model;

import java.util.Objects;

public class Destination implements java.io.Serializable {
    private String start;
    private String finish;

    public Destination(String start, String finish) {
        this.start = start;
        this.finish = finish;
    }

    public Destination() {
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getFinish() {
        return finish;
    }

    public void setFinish(String finish) {
        this.finish = finish;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Destination that = (Destination) o;
        return Objects.equals(start, that.start) && Objects.equals(finish, that.finish);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, finish);
    }
}
