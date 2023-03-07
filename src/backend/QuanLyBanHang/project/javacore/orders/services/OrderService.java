package src.backend.QuanLyBanHang.project.javacore.orders.services;

import src.backend.QuanLyBanHang.project.javacore.orders.App.App;
import src.backend.QuanLyBanHang.project.javacore.orders.models.OrderDetail;
import src.backend.QuanLyBanHang.project.javacore.orders.models.Orders;
import src.backend.QuanLyBanHang.project.javacore.orders.models.Product;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OrderService {
    public void order() {
        Scanner input = new Scanner(System.in);
        System.out.println("---------------------- Mua Sản Phẩm ----------------------");

        try {
            System.out.print("Mã Đặt Hàng: ");
            int id = input.nextInt();

            input.nextLine();

            System.out.print("Nhập tên khách hàng: ");
            String customerName = input.nextLine();

            System.out.print("Nhập số điện thoại: ");
            String phone = input.nextLine();

            System.out.print("Nhập số email: ");
            String email = input.nextLine();

            Orders orders = new Orders(id, customerName, phone, email);

            Integer productId = -1;

            while (true) {
                input = new Scanner(System.in);

                System.out.println("Nhập mã sản phẩm: ");
                productId = input.nextInt();

                if (productId.equals(-1)) {
                    break;
                }

                // kiểm tra mã sản phẩm tồn tại hay không.
                System.out.println("Nhập số lượng: ");
                int quantity = input.nextInt();

                Product product = null;

                for(Product p : App.PRODUCTS) {
                    if (p.getId().equals(productId)) {
                        product = p;
                        break;
                    }
                }
                if (product == null) {
                    System.out.println("Mã sản phẩm không tồn tại");
                }

                OrderDetail orderDetail = new OrderDetail();
                orderDetail.setId(1);
                orderDetail.setOrderId(orders.getId());
                orderDetail.setPrice(product.getPrice());
                orderDetail.setProductId(productId);
                orderDetail.setQuantity(quantity);

                orders.getOrderDetails().add(orderDetail);
            }
            App.ORDERS.add(orders);

        } catch(InputMismatchException ei) {
            System.out.println("Bạn nhập sai giá trị, xin vui lòng nhập lại !");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void show() {
        System.out.println("Danh sách mặt hàng");
        String header = String.format("%s%15s%30s%30s", "Mã", "Tên Khách Hàng", "Số điện thoại", "Email");
        System.out.println(header);

        ProductService productService = new ProductService();
        for(Orders orders : App.ORDERS) {
            String row = String.format("%s%15s%30s%30s", orders.getId(), orders.getCustomerName(), orders.getPhone(),orders.getEmail());
            System.out.println(row);

            String orderDetailHeader = String.format("%30s%10s%30s%30s", "STT", "Tên Sản Phẩm", "Giá", "Số Lượng");

            System.out.println(orderDetailHeader);

            int i = 1;
            for(OrderDetail od : orders.getOrderDetails()) {
                Product p = productService.getById(od.getProductId());
                String orderDetailRow = String.format("%30s%10s%30s%30s", i++ , p.getName(), od.getPrice(), od.getQuantity());
                System.out.println(orderDetailRow);
            }

        }
    }


}
