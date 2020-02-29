package playground.items;

import com.google.common.collect.Sets;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import playground.items.model.Item;
import playground.items.model.ItemCategory;

import java.util.Set;

@RestController
@RequestMapping("/items")
public class ItemsController {

    @RequestMapping("/")
    public Set<Item> index() {
        ItemCategory itemCategory = ItemCategory.builder().categoryId("ReligiousItems").categoryName("Religious Items").build();
        Item item = Item.builder().isParent(false).Title("Zikr beads").itemCategory(itemCategory).build();
        return Sets.newHashSet(item);
    }

}
