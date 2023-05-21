package lt.code.academy.autobiciuliaiapi.garage.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lt.code.academy.autobiciuliaiapi.data.*;
import lt.code.academy.autobiciuliaiapi.users.dto.User;
import org.bson.types.ObjectId;

import java.util.List;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Garage {

    private ObjectId id;
    private String companyCode;
    private String vatCode;
    private String companyName;
    private String email;
    private Set<Address> addresses;
    private Set<RepairType> companyProfile;
    private String companyDescription;
    private Set<Evaluation> evaluations;
    private Double evaluation;
    private Set<User> customers;
    private Set <WorkPlace> workPlaces;
    private Set<RepairPrices> priceList;
    private Set<CustomerComment> customerComments;
    private Set<CarRepair> allRepairs;



}
