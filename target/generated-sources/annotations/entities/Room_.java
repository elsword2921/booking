package entities;

import entities.Convenient;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-09-22T20:36:12")
@StaticMetamodel(Room.class)
public class Room_ { 

    public static volatile SingularAttribute<Room, String> decription;
    public static volatile SingularAttribute<Room, Date> checkin;
    public static volatile SingularAttribute<Room, Convenient> convenient;
    public static volatile SingularAttribute<Room, Double> price;
    public static volatile SingularAttribute<Room, String> name;
    public static volatile SingularAttribute<Room, String> id;
    public static volatile SingularAttribute<Room, String> type;
    public static volatile SingularAttribute<Room, Integer> floor;
    public static volatile SingularAttribute<Room, Date> checkout;

}