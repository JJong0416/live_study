package hash;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class HashItems {

    private String key;
    private String value;
    private HashItems nextHashItem;

    public HashItems(String key, String value) {
        this.key = key;
        this.value = value;
    }
}
