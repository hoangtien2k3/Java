
## Cài bộ gõ tiếng việt [XVNKB]()

> 1. Cài đặt trình biên dịch

Cài đặt công cụ cần thiết để biên dịch và cài đặt phần mềm trên hệ thống Ubuntu 

- Vào terminal và gõ lệnh sau: [sudo apt-get install build-essential]()

  - ["sudo"]() là từ viết tắt của ["Superuser Do"]() : được sử dụng để thực thi câu lệnh với quyền superuser hoặc root.

  - ["apt-get"]() : là một trong những công cụ quản lý gói phần mềm trên hệ thống Ubuntu

  - ["install"]() là tùy chọn được sử dụng để yêu cầu "apt-get" cài đặt một gói phần mềm cụ thể.

  - ["build-essential"]() : " Gói này bao gồm các [compiler](), [linker]() và thư viện tiêu chuẩn, mà bất kỳ lập trình viên nào cũng có thể sử dụng để phát triển và biên dịch phần mềm trên hệ thống.


> 2. Tải xuống mã nguồn và cài đặt

- ["sudo apt-get install xorg-dev"]() : hệ thống sẽ cài đặt các công cụ cần thiết để phát triển các ứng dụng đồ họa X11 trên hệ thống Linux.

- Câu lệnh "wget http://xvnkb.sourceforge.net/xvnkb-0.2.9a.tar.bz2" được sử dụng để tải về tệp nén tar.bz2 chứa mã nguồn của phần mềm Xvnkb từ liên kết http://xvnkb.sourceforge.net/.

- Sau đó giải nén bằng lệnh: [tar -xvf xvnkb-0.2.9a.tar.bz2]()

- Chuyển vào thư mục vừa giải nén và biên dịch: [cd xvnkb-0.2.9a/](), [./autogen.sh](), [./configure --use-extstroke]()

- phải chỉnh file config.h đúng định dạng

- Sau đó gõ tiếp các lệnh sau: [make]() , [sudo make install]()