package entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "continents")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@Builder
public class ContinentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
}
