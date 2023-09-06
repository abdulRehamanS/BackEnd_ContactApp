package IN.Abdul.FullStackContactApp.Service;


import IN.Abdul.FullStackContactApp.Entity.Contact;
import IN.Abdul.FullStackContactApp.Repository.ContactRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceImpl implements ContactService {

    @Autowired
    ContactRepo repo;

    @Override
    public String saveContact(Contact contact) {
        repo.save(contact);

        if (contact.getId() != null) {
            return "Contact Saved";
        } else {
            return "Contact Not Saved";
        }

    }

    @Override
    public String updateContact(Contact contact) {
        if (repo.existsById(contact.getId())) {

            repo.save(contact);
            return "Contact updated";

        } else {
            return "Contact Not Found";
        }
    }

    @Override
    public List<Contact> getAllContact() {
        return repo.findAll();
    }

    @Override
    public Contact getContactById(Integer id) {
        Optional<Contact> findById = repo.findById(id);
        return findById.orElse(null);
    }

    @Override
    public String deleteContactById(Integer id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return "Contact deleted";
        } else {
            return "Contact not deleted";
        }
    }
}
