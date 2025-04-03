package org.ehop.server.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    String id;
    String name;
    Gender gender;
    String email;
    String age;
    Organization organization;
    Subscription subscription;
}
