import com.epam.ad.hotel.entity.Hotel;
import com.epam.ad.hotel.entity.HotelFactory;
import com.epam.ad.hotel.entity.ResidentRoom;
import org.apache.log4j.Logger;

import java.math.BigDecimal;

public class Runner implements Cloneable {
    public static final Logger LOGGER = Logger.getLogger(Runner.class);

    public static void main(String[] args) throws CloneNotSupportedException {

        Hotel hotel = HotelFactory.createRandomHotel();
        hotel.sortRooms();

        hotel.sortSecondBuilding(ResidentRoom.RESIDENT_ROOM_COMPARATOR);
        LOGGER.info("Conclusion rooms of the main building, sorted by price and second building sorted by number:");
        LOGGER.info(hotel);
        LOGGER.info("Conclusion rooms on the second building at a price not higher than 1000");
        LOGGER.info(hotel.findResidentRoomsByPriceUpLimit(BigDecimal.valueOf(1000)));
        LOGGER.info("Conclusion rooms on the second building at a price not lower than 700");
        LOGGER.info(hotel.findResidentRoomsByPriceDownLimit(BigDecimal.valueOf(700)));
    }
}
