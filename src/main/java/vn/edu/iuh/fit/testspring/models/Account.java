package vn.edu.iuh.fit.testspring.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public @Data class Account {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String ownerName;
    private double balance;
}
