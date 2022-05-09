package entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "countries")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@Builder
public class CountryEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String code;
    String continent;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    List<CityEntity> cityEntityList = new ArrayList<>();

}
