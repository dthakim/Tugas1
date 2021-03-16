/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pewarisan;

/**
 *
 * @author DANI TAUFIKUL HAKIM
 */
public class Person {
    protected String name;
    protected String address;
    protected String hobby;
    protected int age;
    public Person (String name, String address, String hobby, int age){
     this.name = name;
     this.address = address;
     this.hobby = hobby;
     this.age = age;
        System.out.println("Hello from Person class");
    }
    public String getName() {
        return name;
    }
    public void setName (String name) {
        this.name = name;
    }
    public String getAddress () {
        return address = address;
    }
    public void setAddress (String address){
        this.address = address;
    }
    public String getHobby () {
       return hobby; 
    }
    public void setHobby (String hobby) {
        this.hobby = hobby;
    }
    public int getAge () {
        return age;
    }
    public void setAge (int age) {
        this.age = age;
    }
}
