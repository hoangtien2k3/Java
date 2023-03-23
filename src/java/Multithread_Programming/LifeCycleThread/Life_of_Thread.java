/*
    Vòng đời của thred (các trạng thái) trong java
        1. New
        2. Runnable
        3. Running
        4. Non-Runnable (Blocked)
        5. Terminated


    1. New
        Thread ở trạng thái new nếu bạn tạo một thể hiện của lớp Thread nhưng trước khi gọi phương thức start().

    2. Runnable
        Thread ở trạng thái runnable sau khi gọi phương thức start(), nhưng trình lên dịch (scheduler)
        của thread đã không chọn nó là thread đang chạy.

    3. Running
        Thread ở trạng thái running nếu trình lên dịch của thread đã chọn nó.

    4. Non-Runnable (Blocked)
        Đây là trạng thái khi thread vẫn còn sống, nhưng hiện tại không được chọn để chạy.

    5. Terminated
        Một thread ở trong trạng thái terminated hoặc dead khi phương thức run() của nó bị thoát.



* */

package src.java.Multithread_Programming.LifeCycleThread;

public class Life_of_Thread {

}
