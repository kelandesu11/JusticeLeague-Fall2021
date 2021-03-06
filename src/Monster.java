import java.io.Serial;
import java.io.Serializable;

/**
 * @dkilbert Jeremy Edit 11/3/21: Added Entity parent class, made class serializable.
 */


public class Monster extends Entity implements Serializable {
    /**
     *
     */
    @Serial
    private static final long serialVersionUID = -53589054373799944L;
    private String name;
    private String description;
    private int id;

    public Monster(int health, int damage) {
        super(health, damage);
    }

    public Monster() {
    }

    public Monster(String name, String description, int id, int health, int damage) {
        super(health, damage);
        this.name = name;
        this.description = description;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", id=" + id +
                '}';
    }
}
