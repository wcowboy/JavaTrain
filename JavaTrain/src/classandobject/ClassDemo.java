package classandobject;

public class ClassDemo {
    String name = null;
    int age;
    ClassDemo(String name,int age){
        this.name = name;
        this.age = age;
        show();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    void show(){
        System.out.println("姓名" + name + "年龄"+ age);
    }

    public static void main(String[] args) {
        ClassDemo person = new ClassDemo("whl",20);

    }
}
