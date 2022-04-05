package program_26_encapsulation;

public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulations obj = new Encapsulations();
        obj.setName("Amit");
        obj.setAge(19);
        obj.setRollNo(51);

        //Displaying value of the variables
        System.out.println("Prime's name: " + obj.getName());
        System.out.println("Prime's age: " + obj.getAge());
        System.out.println("Prime's rollNo: " + obj.getRollNo());

    }
}
