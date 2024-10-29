import java.util.Objects;
/*
Student@364872
Student@364872
Both students are same
 */
public class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public static void main(String[] args) {
        Student s1=  new Student(1,"test");
        Student s2=  new Student(1,"test");
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        if(s1.equals(s2)){
            System.out.println("Both students are same");
        }else{
            System.out.println("Not same");
        }
    }
}
