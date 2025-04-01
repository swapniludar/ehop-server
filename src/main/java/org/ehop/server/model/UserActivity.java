package org.ehop.server.model;

import lombok.Data;

@Data
public class UserActivity {
    private String id;
    private long timestamp;
    private User user;
    private Organization organization;
    private Subscription subscription;
    private Service service;
    private ServiceStatus status;
}
