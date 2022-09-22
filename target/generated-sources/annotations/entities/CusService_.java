package entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-09-22T20:36:12")
@StaticMetamodel(CusService.class)
public class CusService_ { 

    public static volatile SingularAttribute<CusService, Date> checkin;
    public static volatile SingularAttribute<CusService, Double> price;
    public static volatile SingularAttribute<CusService, String> service;
    public static volatile SingularAttribute<CusService, Date> checkout;
    public static volatile SingularAttribute<CusService, String> roomid;

}