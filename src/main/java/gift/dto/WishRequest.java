package gift.dto;

public class WishRequest {

    private Long productId;
    private int number;

    public WishRequest(Long product_id, int number) {
        this.productId = product_id;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public Long getProductId() {
        return productId;
    }
}
