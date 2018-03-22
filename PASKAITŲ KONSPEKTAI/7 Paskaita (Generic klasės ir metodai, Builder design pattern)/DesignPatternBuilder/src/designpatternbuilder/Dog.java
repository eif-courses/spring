/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternbuilder;

/**
 *
 * @author Marius
 */
public class Dog {

    public enum Type {
        CORGI, PUG, OTHER;
    }
    private String name;
    private int age = -1;
    private String owner;
    private Type type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Type getType() {
        return type;
    }
    public void setType(Type type) {
        this.type = type;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Dog{" + "name=" + name + ", age=" + age + ", owner=" + owner + ", type=" + type + '}';
    }
    public static class Builder {

        private final Dog dog = new Dog();

        public Builder name(String name) {
            dog.name = name;
            return this;
        }

        public Builder age(int age) {
            dog.age = age;
            return this;
        }

        public Builder type(Type type) {
            dog.type = type;
            return this;
        }
        public Builder owner(String owner) {
            dog.owner = owner;
            return this;
        }

        public Dog build() {
            return dog;
        }
    }
}
