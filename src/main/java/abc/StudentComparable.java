package abc;

public class StudentComparable implements Comparable<StudentComparable>{
    @Override
    public int compareTo(StudentComparable o) {
//        return 1;
        return this.getName().compareTo(o.getName());
    }

    private String name;
    private int age;
    private String address;
    public StudentComparable(){

    }
    public StudentComparable(String name, int age, String address){
        super();
        this.name=name;
        this.age=age;
        this.address=address;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public String toString(){
        return "StudenComparable@name="+name+",age="+age+",address="+address;
    }
}
