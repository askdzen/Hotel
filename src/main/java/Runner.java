import com.epam.ad.hotel.entity.Hotel;
import com.epam.ad.hotel.entity.HotelFactory;

public class Runner {
    public static void main(String[] args) {
        Hotel hotel= HotelFactory.createRandomHotel();
       // hotel.getTotalRoomsCost();
        hotel.show();
    }
}
