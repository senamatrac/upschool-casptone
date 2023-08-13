package io.upschool.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;

import java.util.Set;

@Entity
@Table(name = "aircraft")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = {"id"})
@Builder
@Audited
public class AircraftType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(unique = true)
    private String iataCode;

    @Column
    private String model;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "aircraftType", cascade = CascadeType.ALL)
    private Set<Seat> seats;


}
