/**
 * 
 */
/**
 * @author PRAMOD
 *
 */
package model;
public class Student {
    Integer id;
    String name;
    Integer batch;
    Integer roll;
    String parent;
    String address;

    public Student(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public Student(String name,Integer roll,Integer batch,String parent,String address){
        this.name = name;
        this.roll = roll;
        this.batch = batch;
        this.parent= parent;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBatch() {
        return batch;
    }

    public void setBatch(Integer batch) {
        this.batch = batch;
    }

    public Integer getRoll() {
        return roll;
    }

    public void setRoll(Integer roll) {
        this.roll = roll;
    }

    public String getparent() {
        return parent;
    }

    public void setparent(String parent) {
        this.parent = parent;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}