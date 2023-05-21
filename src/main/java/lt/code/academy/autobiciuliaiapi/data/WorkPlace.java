package lt.code.academy.autobiciuliaiapi.data;

import java.util.List;
import java.util.Set;
import java.util.UUID;

public class WorkPlace {
    private UUID id;
    private Set<RepairType> possibleRepairs;
    Set<RepairBooking> allBookings;
}
