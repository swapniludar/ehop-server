package org.ehop.server.service;

import org.ehop.server.model.Gender;
import org.ehop.server.model.Organization;
import org.ehop.server.model.Subscription;
import org.ehop.server.model.User;
import org.ehop.server.model.Validity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    public List<User> getAllUsers() {
        // Logic to retrieve all users from the database
        Organization org1 = new Organization("orgId1", "orgName1", "orgDescription1", "orgLogoUrl1", "orgWebUrl1");
        Organization org2 = new Organization("orgId2", "orgName2", "orgDescription2", "orgLogoUrl2", "orgWebUrl2");

        Subscription sub1 = new Subscription("subId1", "subName1", "subDescription1", List.of(), 100.0, new Validity());
        Subscription sub2 = new Subscription("subId2", "subName2", "subDescription2", List.of(), 200.0, new Validity());

        User user1 = new User("id1", "name1", Gender.MALE, "email1", "age1", org1, sub1);
        User user2 = new User("id2", "name2", Gender.FEMALE, "email2", "age2", org2, sub2);

        return List.of(user1, user2);
    }
}
