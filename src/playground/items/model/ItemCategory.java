package playground.items.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ItemCategory {
    private String categoryId;
    private String categoryName;
}
