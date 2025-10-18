class student{
    private String name;
    private int age;
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setAge(int a){
        if (a>0);
        age = a;
    }
        else{
        System.out.println("Age cannot be positive");
    }

    public int getAge(){
        return age;
    }
}
public class index {
    public static void main(String[] args) {
        student s1 = new student();
        s1.setName("John");
        s1.setAge(20);
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
    }
}
