package cn.bdqn.domain;

public class PeItems {

    private Long itemId;

    private String itemName;

    private Long typeId;

    private Integer necessary;

    private String ref;

    private float price;

    private String info;

    private ItemTypes itemTypes;

    public PeItems() {
    }

    public PeItems(Long itemId, String itemName, Long typeId, Integer necessary, String ref, float price, String info) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.typeId = typeId;
        this.necessary = necessary;
        this.ref = ref;
        this.price = price;
        this.info = info;
    }

    @Override
    public String toString() {
        return "PeItems{" +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", typeId=" + typeId +
                ", necessary=" + necessary +
                ", ref='" + ref + '\'' +
                ", price=" + price +
                ", info='" + info + '\'' +
                ", itemTypes=" + itemTypes +
                '}';
    }

    public ItemTypes getItemTypes() {
        return itemTypes;
    }

    public void setItemTypes(ItemTypes itemTypes) {
        this.itemTypes = itemTypes;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public Integer getNecessary() {
        return necessary;
    }

    public void setNecessary(Integer necessary) {
        this.necessary = necessary;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
