package wallet.domain;

import wallet.domain.*;
import wallet.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class CouponCanceled extends AbstractEvent {

    private Long id;
    private String price;
    private String buyer;
    private String type;
    private String name;
}


