package Programme_26_encapsulation;

public class TestEncapsulation {
    public static void main(String [] args){
        Encapsulate obj = new Encapsulate();
        //setting values of the variables
        obj.setName("Amitabh");
        obj.setRollNo(420);
        obj.setAge(80);
        //Displaying values of the variables
        System.out.println("Actor's name: "+obj.getName());
        System.out.println("Actor's age: "+ obj.getAge());
        System.out.println("Actor's rollNo: "+ obj.getRollNo());

    }
}
