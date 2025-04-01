package org.ehop.server.model;

import lombok.Data;

@Data
public class Organization {
    private String id;
    private String name;
    private String description;
    private String logoUrl;
    private String webUrl;
}
