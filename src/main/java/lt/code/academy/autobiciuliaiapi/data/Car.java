package lt.code.academy.autobiciuliaiapi.data;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;
import java.util.UUID;
@NoArgsConstructor
@Setter
@Getter
public class Car {
    private UUID id;
    private String vinCode;
    private String manufacturer;
    private String model;
    private Integer engineCapacity;
    private String engineCode;
    private Fuel fuel;
    private Integer power;
    private Transmission transmission;
    private Drivetrain drivetrain;
    private Boolean aerConditioning;
    private LocalDate manufacturingDate;
    private LocalDate techDate;
    private Integer mileage;
    private Set<CarRepair> repairHistory;
    private NextEngineOilChange nextEngineOilChange;
    private NextTransmissionOilChange nextTransmissionOilChange;

}
