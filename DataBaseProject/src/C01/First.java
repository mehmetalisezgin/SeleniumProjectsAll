package C01;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
   public class First {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private final String firstname;
    private final String lastname;

 public First(String firstname, String lastname) {
  this.firstname = firstname;
  this.lastname = lastname;
 }

 public Long getId() {
  return id;
 }

 public String getFirstname() {
  return firstname;
 }

 public String getLastname() {
  return lastname;
 }

 public static void main(String[] args) {




    }



}
