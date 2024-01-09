

public class Animal {

    private String name;
    private Integer age;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Integer getAge(){
        return this.age;
    }

    public void setAge(Integer age){
        this.age = age;
    }

    public Animal(){
        System.out.printf("from Animal !!! \n");
    }

    public Animal(String name, Integer age){
        this.name = name;
        this.age = age;
        System.out.printf("from Animal para !!! \n");
    }
}
