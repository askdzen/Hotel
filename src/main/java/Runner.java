import com.epam.ad.hotel.entity.Hotel;
import com.epam.ad.hotel.entity.HotelFactory;
import com.epam.ad.hotel.entity.ResidentRoom;

import java.util.Collections;

public class Runner implements Cloneable{
    public static void main (String[] args)throws CloneNotSupportedException {
        Hotel hotel = HotelFactory.createRandomHotel();
        System.out.println(hotel.getTotalRoomsCost());
        System.out.println(hotel);
        Collections.sort(hotel.rooms);
        System.out.println(hotel);

        ResidentRoom residentRoom=new ResidentRoom.ResidentRoomBuilder().breakfast(false).build();
      //  Object r = residentRoom.clone();
    }
}
