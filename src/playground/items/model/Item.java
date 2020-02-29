package playground.items.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Item {
    private String Title;
    private boolean isParent;
    private ItemCategory itemCategory;
}
