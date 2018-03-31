package hello;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mytable1 {
    @Id
    Long id;
    String name;

}
