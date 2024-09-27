public class Person {
    private String id;
    private String name;

    Person(String id, String name) {
        this.id = id;
        this.name = name;
    }
    Person(Person p) {
        this.id = p.id;
        this.name = p.name;
    }

    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void display(){
        System.out.println(this.name);
        System.out.println(this.id);
    }
    @Override
    public String toString() {
        return String.format("%s %s", this.name, this.id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;}
            Person p = (Person) obj;
            return this.id.equals(p.id) && this.name.equals(p.name);
        }

}