package IN.Abdul.FullStackContactApp.Controller;



import IN.Abdul.FullStackContactApp.Entity.Contact;
import IN.Abdul.FullStackContactApp.Service.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContactController {
    @Autowired
    ServiceImpl service;


    @PostMapping("/add")
    public String saveContact(@RequestBody Contact contact) {
        return service.saveContact(contact);
    }

    @PostMapping("/update")
    public String updateContact(@RequestBody Contact contact) {
        return service.updateContact(contact);
    }


    @GetMapping("/all")
    List<Contact> getAllContact() {
        return service.getAllContact();
    }

    @GetMapping("/get/{id}")
    public Contact getContactById(@PathVariable Integer id) {
        return service.getContactById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteContactById(@PathVariable Integer id) {
        return service.deleteContactById(id);
    }


}
