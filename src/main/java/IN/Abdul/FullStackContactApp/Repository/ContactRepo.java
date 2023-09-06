package IN.Abdul.FullStackContactApp.Repository;

import IN.Abdul.FullStackContactApp.Entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface ContactRepo extends JpaRepository<Contact, Serializable> {
}
