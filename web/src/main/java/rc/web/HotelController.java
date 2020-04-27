package rc.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import rc.domain.Hotel;
import rc.storage.HotelRepository;

import java.util.List;


@RestController
public class HotelController {

    private HotelRepository hotelRepository;

    public HotelController(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @GetMapping({"/hotels"})
    public List<Hotel> getHotels(){
        List<Hotel> hotels = hotelRepository.findAll();
        return hotels;
    }
}
