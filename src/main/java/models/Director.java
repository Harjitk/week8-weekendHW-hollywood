package models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "directors")

public class Director extends FilmCrew {

    private List<Film> films;

    public Director() {
    }


    public Director(int id, String firstName, String lastName, int money, List<Film> films) {
        super(id, firstName, lastName, money);
        this.films = films;
    }

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }
}