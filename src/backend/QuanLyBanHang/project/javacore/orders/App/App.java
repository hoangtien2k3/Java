package src.backend.QuanLyBanHang.project.javacore.orders.App;

import src.backend.QuanLyBanHang.project.javacore.orders.models.Orders;
import src.backend.QuanLyBanHang.project.javacore.orders.models.Product;
import src.backend.QuanLyBanHang.project.javacore.orders.services.OrderService;
import src.backend.QuanLyBanHang.project.javacore.orders.services.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static List<Product> PRODUCTS = new ArrayList<>();
    public static List<Orders> ORDERS = new ArrayList<>();

    public static void menu() {
        System.out.println("\n--------------- Danh Sách Chức Năng ----------------");
        System.out.println("1. Thêm mới sản phẩm");
        System.out.println("2. Hiển thị sản phẩm");
        System.out.println("3. Sửa sản phẩm");
        System.out.println("4. Xóa sản phẩm");
        System.out.println("5. Mua hàng");
        System.out.println("6. Hiển thị danh sách đơn hàng");
        System.out.println("7. Thoát");
    }

    public static void main(String[] args) {
        int function = 0;

        do {
            menu();
            Scanner input = new Scanner(System.in);
            try {
                System.out.print("\nChọn chức năng: ");
                function = input.nextInt();
                ProductService productService = new ProductService();
                OrderService orderService = new OrderService();

                switch (function) {
                    case 1:
                        productService.insert();
                        break;
                    case 2:
                        productService.show();
                        break;
                    case 3:
                        productService.update();
                        break;
                    case 4:
                        break;
                    case 5:
                        orderService.order();
                        break;
                    case 6:
                        orderService.show();
                        break;
                    case 7:
                        break;

                }

            } catch(Exception e) {
                System.out.println(e.getMessage());
            }
        } while (function != 7);

    }
}
