package Test;

public class Solution31 {
    public static void main(String[] args) {
        Random rand = new Random(3, "Manish");
        StaticClass.randomMethod(rand);
    }

}

class Random {
    private Integer num;
    private String name;

    public Random(Integer num, String name) {
        this.num = num;
        this.name = name;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Random [num=" + num + ", name=" + name + "]";
    }

}
