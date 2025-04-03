package org.ehop.server.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Organization {
    private String id;
    private String name;
    private String description;
    private String logoUrl;
    private String webUrl;
}
