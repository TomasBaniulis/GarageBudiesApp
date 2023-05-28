package lt.code.academy.autobiciuliaiapi.garages;

import lombok.AllArgsConstructor;
import static  lt.code.academy.autobiciuliaiapi.EndPoint.*;

import lt.code.academy.autobiciuliaiapi.garages.dto.Garage;
import lt.code.academy.autobiciuliaiapi.garages.service.GarageService;
import org.bson.types.ObjectId;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(GARAGES)
public class GarageController {

    private final GarageService garageService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Garage> showAllGarages (){
        return garageService.getAllGarages();
    }

    @GetMapping(value = GARAGE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Garage ShowGarage (@PathVariable(garageId)ObjectId id){
        return garageService.getGarageById(id);
    }




}
