package IN.Abdul.FullStackContactApp.Service;

import IN.Abdul.FullStackContactApp.Entity.Contact;

import java.util.List;

public interface ContactService {


    // saveContact

    public String saveContact(Contact contact);

    //updateContact

    public String updateContact(Contact contact);

    // getAllContact

    List<Contact> getAllContact();

    //getContactById

    public Contact getContactById(Integer id);

    //deleteById

    public String deleteContactById(Integer id);
}
