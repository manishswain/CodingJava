package Test;

public class ObjectAssociate {
    public static void main(String[] args) {
        One one = new One(2, "Manish");
        Two two = new Two(1, "address");

        Dto dto = new Dto();
        dto.setId1(one.getId());
        dto.setName(one.getName());
        dto.setId2(two.getId());
        dto.setAddress(two.getAddress());


    }

}

class One {
    private int id;
    private String name;

    @Override
    public String toString() {
        return "One [id=" + id + ", name=" + name + "]";
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

    public One(int id, String name) {
        this.id = id;
        this.name = name;
    }

}

class Two {
    private int id;
    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Two(int id, String address) {
        this.id = id;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Two [address=" + address + ", id=" + id + "]";
    }

}

class Dto {
    int id1;
    String name;
    int id2;
    String address;
    public int getId1() {
        return id1;
    }
    public void setId1(int id1) {
        this.id1 = id1;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId2() {
        return id2;
    }
    public void setId2(int id2) {
        this.id2 = id2;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }  
}
