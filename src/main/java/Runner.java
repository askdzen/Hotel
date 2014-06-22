import com.epam.ad.hotel.entity.Hotel;
import com.epam.ad.hotel.entity.HotelFactory;
import com.epam.ad.hotel.entity.ResidentRoom;
import org.apache.log4j.Logger;

import java.math.BigDecimal;

public class Runner implements Cloneable {
public static final Logger LOGGER=Logger.getLogger(Runner.class);
    public static void main(String[] args) throws CloneNotSupportedException {

        Hotel hotel = HotelFactory.createRandomHotel();
        hotel.sortRooms();
        hotel.sortSecondBuilding(ResidentRoom.RESIDENT_ROOM_COMPARATOR);
        LOGGER.info("Вывод комнат главного корпуса, отсортированного по цене и второго корпуса отсортированного по номеру");
        LOGGER.info(hotel);
        LOGGER.info("Вывод комнат второго корпуса с ценой не выше 1000");
        LOGGER.info(hotel.findResidentRoomsByPriceUpLimit(BigDecimal.valueOf(1000)));
        LOGGER.info("Вывод комнат второго корпуса с ценой не ниже 700");
        LOGGER.info(hotel.findResidentRoomsByPriceDownLimit(BigDecimal.valueOf(700)));
    }
}
