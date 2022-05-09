package entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "ContinentEntity")
@Table(name = "continents")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@Builder
public class ContinentEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    List<CountryEntity> countryEntityList = new ArrayList<>();
}
