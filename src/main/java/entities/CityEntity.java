package entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "CityEntity")
@Table(name = "cities")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@Builder
@NamedQueries({
    @NamedQuery(name = "CityEntity.findByCountry", query = "SELECT c FROM cities c WHERE c.country = ?1")
})
public class CityEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    boolean isCapital;
    Double latitude;
    Double longitude;
    String country;
}
