

public class Cat extends Animal{
    
    // public void bark(){
    //     System.out.printf("wwwwww\n");
    // }

    // public String name;

    // public Integer age;
    
    private String color;
    
    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }


    public static void bark(){
        System.out.printf("wwwwww\n");
    }
    
    public void bark2(){
        System.out.printf("#############\n");
    }

    public Cat(){
        super();
        System.out.printf("from Cat !!! \n");
    }

    // inherit from superclass
    // public Cat(String name, Integer age){
    //     super(name, age);
    //     System.out.printf("from Cat para !!! \n");
    // }

    public Cat(String name, Integer age, String color){
        super();
        super.setName(name);
        super.setAge(age);
        this.color = color;
        System.out.printf("from Cat para !!! \n");
    }


    public static void main(String[] args){
        Animal cat0 = new Animal("cat0", 0);
        Animal cat1 = new Cat("cat1", 1, "red");
        // Cat cat2 = new Animal("cat2", 2);
        Cat cat3 = new Cat("cat3", 3, "blue");

        System.out.println(cat0.getName());
        System.out.println(cat0.getAge());
        System.out.println("-------------------");
        System.out.println(cat1.getName());
        System.out.println(cat1.getAge());
        // System.out.println("-------------------");
        // System.out.println(cat2.getName());
        // System.out.println(cat2.getAge());
        System.out.println("-------------------");
        System.out.println(cat3.getName());
        System.out.println(cat3.getAge());

        // create new method in subclass
        // cat0.bark();
        // cat1.bark();
        // cat3.bark();

        // static method
        // Cat.bark();
        // Cat.bark2();

        // cat0.bark2();
        // cat1.bark2();
        // cat3.bark2();

        // cat0.color;
        // cat1.color;
        // cat3.color;
        
        // System.out.println(cat1.getColor());
        // System.out.println(cat3.getColor());
    }
}
