package org.ehop.server.model;

import lombok.Data;

@Data
public class UserActivity {
    private String id;
    private long timestamp;
    private User user;
    private Organization organization;
    private Subscription subscription;
    private Benefit benefit;
    private ServiceStatus status;
}
