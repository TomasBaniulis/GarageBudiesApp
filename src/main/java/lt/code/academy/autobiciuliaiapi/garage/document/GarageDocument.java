package lt.code.academy.autobiciuliaiapi.garage.document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lt.code.academy.autobiciuliaiapi.data.*;
import lt.code.academy.autobiciuliaiapi.garage.dto.Garage;
import lt.code.academy.autobiciuliaiapi.users.dto.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Document(collection = "Garages")
public class GarageDocument {
    private ObjectId id;
    private String companyCode;
    private String vatCode;
    private String companyName;
    private String email;
    private String password;
    private Set<Address> addresses;
    private Set<RepairType> companyProfile;
    private String companyDescription;
    private Double evaluation;
    private Set<Evaluation> evaluations;
    private Set<User> customers;
    private Set<WorkPlace> workPlaces;
    private Set<RepairPrices> priceList;
    private Set<CustomerComment> customerComments;
    private Set<CarRepair> allRepair;

    public GarageDocument convert (Garage garage){
        return new GarageDocument(garage.getId(),
                garage.getCompanyCode(),
                garage.getVatCode(),
                garage.getCompanyName(),
                garage.getEmail(),
                garage.getPassword(),
                garage.getAddresses(),
                garage.getCompanyProfile(),
                garage.getCompanyDescription(),
                garage.getEvaluation(),
                garage.getEvaluations(),
                garage.getCustomers(),
                garage.getWorkPlaces(),
                garage.getPriceList(),
                garage.getCustomerComments(),
                garage.getAllRepairs());
    }
}
