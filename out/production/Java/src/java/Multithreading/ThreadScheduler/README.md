
## Thread scheduler trong java

Java Thread Scheduler là một phần của Java Virtual Machine (JVM) đảm nhiệm cho việc quản lý và sắp xếp các luồng đang chạy trong hệ thống. Nó tìm ra luồng nào cần phải chạy và cho phép chúng chạy trong thời gian tốt nhất, đảm bảo tối ưu hóa sử dụng tài nguyên và tối ưu hóa hiệu suất hệ thống.

Java Thread Scheduler sử dụng một giải pháp sắp xếp luồng động (dynamic scheduling) để xác định luồng nào cần phải chạy trong thời gian tới. Nó sẽ đánh giá các yếu tố như ưu tiên, trạng thái, độ trễ và số lần chạy của mỗi luồng và sau đó chọn ra luồng để chạy.

Các luồng có thể có ưu tiên cao hoặc ưu tiên thấp, có thể đang chờ hoặc đang chạy. Ưu tiên của mỗi luồng có thể được thiết lập bằng phương thức setPriority(). Java Thread Scheduler sẽ tự động sắp xếp luồng theo thứ tự ưu tiên, nhưng không giữ cho chúng chạy theo thứ tự này mãi mãi. Nó sẽ tự động đánh giá và sắp xếp lại các luồng để tối ưu hóa t















