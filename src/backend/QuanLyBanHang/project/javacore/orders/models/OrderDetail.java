package src.backend.QuanLyBanHang.project.javacore.orders.models;

import java.util.ArrayList;
import java.util.List;

public class OrderDetail {
    private Integer id;
    private Integer orderId;
    private Integer productId;
    private Float price;
    private Integer quantity;

    private List<OrderDetail> orderDetailList = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public Integer getProductId() {
        return productId;
    }

    public Float getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
