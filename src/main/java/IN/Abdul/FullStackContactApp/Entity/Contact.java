package IN.Abdul.FullStackContactApp.Entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Contact_Details")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    String name;
    String email;
    Integer phone;
}
