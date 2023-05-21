package lt.code.academy.autobiciuliaiapi.data;

import org.bson.types.ObjectId;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.util.UUID;

public class RepairBooking {
    private UUID id;
    private RepairType repairType;
    private ObjectId customerId;
    private UUID carId;
    private String additionalComments;
    private LocalDate date;


}
