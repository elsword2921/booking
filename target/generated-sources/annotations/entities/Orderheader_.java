package entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-09-21T19:44:37")
@StaticMetamodel(Orderheader.class)
public class Orderheader_ { 

    public static volatile SingularAttribute<Orderheader, Date> date;
    public static volatile SingularAttribute<Orderheader, String> decription;
    public static volatile SingularAttribute<Orderheader, Integer> cusid;
    public static volatile SingularAttribute<Orderheader, Double> price;
    public static volatile SingularAttribute<Orderheader, String> id;
    public static volatile SingularAttribute<Orderheader, Integer> floor;
    public static volatile SingularAttribute<Orderheader, String> roomid;
    public static volatile SingularAttribute<Orderheader, Integer> staffid;

}