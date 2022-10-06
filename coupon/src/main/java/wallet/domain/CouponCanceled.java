package wallet.domain;

import wallet.domain.*;
import wallet.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CouponCanceled extends AbstractEvent {

    private Long id;
    private String price;
    private String buyer;
    private String type;
    private String name;

    public CouponCanceled(Coupon aggregate){
        super(aggregate);
    }
    public CouponCanceled(){
        super();
    }
}
