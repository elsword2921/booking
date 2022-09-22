package entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-09-22T20:36:12")
@StaticMetamodel(Reply.class)
public class Reply_ { 

    public static volatile SingularAttribute<Reply, Date> date;
    public static volatile SingularAttribute<Reply, Integer> cmtid;
    public static volatile SingularAttribute<Reply, String> cusid;
    public static volatile SingularAttribute<Reply, String> roomid;
    public static volatile SingularAttribute<Reply, String> content;

}