package entities;

import lombok.*;

import javax.persistence.*;

@Entity(name = "CityEntity")
@Table(name = "cities")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@Builder
public class CityEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;
    String country;
    boolean isCapital;
    Double latitude;
    Double longitude;
}
