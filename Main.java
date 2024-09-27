public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("SP24-BSE-085", "Muhammad Sameer Yaseen");
        Person p2 = new Person(p1);
        p2.setId("SP24-BSE-112");
        p2.setName("Muhammad Sameer Yaseen");
        p1.display();
        p2.display();
//       System.out.println(p1.toString());
        if(p1.equals(p2)){
            System.out.println("Persons are same");
        }else {
            System.out.println("Persons are different");
        }

    }
}
