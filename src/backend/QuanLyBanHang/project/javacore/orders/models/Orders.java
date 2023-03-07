package src.backend.QuanLyBanHang.project.javacore.orders.models;

import java.util.ArrayList;
import java.util.List;

public class Orders {
    private Integer id;
    private String customerName;
    private String phone;
    private String email;

    public List<OrderDetail> orderDetails = new ArrayList<>();

    public Orders(Integer id, String customerName, String phone, String email) {
        this.id = id;
        this.customerName = customerName;
        this.phone = phone;
        this.email = email;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }
}
