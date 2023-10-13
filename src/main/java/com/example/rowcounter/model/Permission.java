package com.example.rowcounter.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="PERMISSIONS")
@Getter
@Setter
@NoArgsConstructor
public class Permission {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "permissions_id_sq")
    @SequenceGenerator(name = "permissions_id_sq", sequenceName = "permissions_id_sq", allocationSize = 1)
    private int id;

    private String type;

}
