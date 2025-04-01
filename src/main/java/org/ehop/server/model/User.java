package org.ehop.server.model;

import lombok.Data;

@Data
public class User {
    String id;
    String name;
    Gender gender;
    String email;
    String age;
    Organization organization;
    Subscription subscription;
}
