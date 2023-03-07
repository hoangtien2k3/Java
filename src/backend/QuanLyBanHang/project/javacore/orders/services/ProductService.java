package src.backend.QuanLyBanHang.project.javacore.orders.services;

import src.backend.QuanLyBanHang.project.javacore.orders.App.App;
import src.backend.QuanLyBanHang.project.javacore.orders.models.Product;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProductService {

    public void insert() {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập thông tin sảng phẩm");

        try {
            // Nhập thông tin của Sản phẩm.
            System.out.print("Mã: ");
            int id = input.nextInt();

            input.nextLine();

            System.out.print("Tên: ");
            String name = input.nextLine();

            System.out.print("Số Lượng: ");
            int quantity = input.nextInt();

            input.nextLine();

            System.out.print("Ghi chú: ");
            String description = input.nextLine();

            System.out.print("Giá: ");
            float price = input.nextFloat();


            Product p = new Product(id, name, quantity, description, price); // tạo Constructer và truyền dữ liệu vào.
            App.PRODUCTS.add(p); // insert dữ liệu vào


        } catch(InputMismatchException ei) {
            System.out.println("Bạn nhập sai giá trị, xin vui lòng nhập lại !");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }


    public void show() {
        System.out.println("Danh sách sản phẩm");
        String header = String.format("%s%15s%30s%15s%15s", "Mã", "Tên", "Số lượng", "Giá", "Ghi Chú");
        System.out.println(header);
        for(Product p : App.PRODUCTS) {
            String row = String.format("%d%15s%30d%15f%15s", p.getId(), p.getName(), p.getQuantity(), p.getPrice(), p.getDescription());
            System.out.println(row);
        }
    }

    public void update() {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Nhập mã: ");
            Integer id = input.nextInt();

            Product product = null;

            for(Product p : App.PRODUCTS) {
                if (p.getId().equals(id)) {
                    product = p;
                    break;
                }
            }
            if (product == null) {
                System.out.println("Mã xác thực không tồn tại, xin vui lòng nhập lại");
            }
            System.out.println("Thông tin sản phẩm: ");
            String row = String.format("%d%15s%30d%15f%15s", product.getId(), product.getName(), product.getQuantity(), product.getPrice(), product.getDescription());
            System.out.println(row);

            for(int i = 0; i < App.PRODUCTS.size(); i++) {
                if (id.equals(App.PRODUCTS.get(i).getId())) {

                    input.nextLine();

                    System.out.print("Tên: ");
                    String name = input.nextLine();

                    System.out.print("Số Lượng: ");
                    int quantity = input.nextInt();

                    input.nextLine();

                    System.out.print("Ghi chú: ");
                    String description = input.nextLine();

                    System.out.print("Giá: ");
                    float price = input.nextFloat();

                    App.PRODUCTS.get(i).setName(name);
                    App.PRODUCTS.get(i).setQuantity(quantity);
                    App.PRODUCTS.get(i).setDescription(description);
                    App.PRODUCTS.get(i).setPrice(price);

                }
            }

        } catch(InputMismatchException ei) {
            System.out.println("Bạn nhập sai giá trị, xin vui lòng nhập lại !");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }


    }

    public Product getById(int id) {
        Product product = new Product();
        for(Product p : App.PRODUCTS) {
            if (p.getId().equals(id)) {
                product = p;
                break;
            }
        }
        return  product;
    }

}
