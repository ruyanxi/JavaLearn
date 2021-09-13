package APILearn.Object;

/**
 * @author: 朢曐(雷杨一凡)
 * @Title: people
 * @ProjectName: java-se-learning
 * @Description：
 * @date： 2021/8/27 11:24
 */
public class people {
    private String name;
    private int age;

    public people() {
    }

    public people(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "people{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        people people = (people) o;

        if (age != people.age) return false;
        return name != null ? name.equals(people.name) : people.name == null;
    }
}
