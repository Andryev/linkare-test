package domain;

import java.util.Objects;

public class Dog {

    private String name;
    private String race;
    private Integer height;
    private Integer weight;

    public Dog(String name, String race, Integer height, Integer weight) {
        this.name = name;
        this.race = race;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name) && Objects.equals(race, dog.race);
    }

}
