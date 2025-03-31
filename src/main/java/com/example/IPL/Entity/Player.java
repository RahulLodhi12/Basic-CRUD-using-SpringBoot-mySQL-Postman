package com.example.IPL.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="PLAYERS")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String team;
    private int age;
    private int runs;

    public Player() {
        super();
    }

    public Player(Long id, String name, String team, int age, int runs) {
        super();
        this.id = id;
        this.name = name;
        this.team = team;
        this.age = age;
        this.runs = runs;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", team='" + team + '\'' +
                ", age=" + age +
                ", runs=" + runs +
                '}';
    }
}
