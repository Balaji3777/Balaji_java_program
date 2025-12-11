package ENCAPSULATION;

public class Task1 {
	private String name;
    private int age;

    public Task1(String name, int age) {
        this.name = name;
        this.age = age;
    }

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
        if (age >= 0) {   
            this.age = age;
        }
    }


    public static void main(String[] args) {
        Task1 p = new Task1("jas", 19);

        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());

        p.setName("jashwa");
        p.setAge(20);

        System.out.println("Updated Name: " + p.getName());
        System.out.println("Updated Age: " + p.getAge());
    }
}
