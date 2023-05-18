
# Cài đặt các công tụ từ mà nguồn:  Cài bộ gõ tiếng việt [XVNKB]()

## 1. Cài đặt trình biên dịch

Cài đặt công cụ cần thiết để biên dịch và cài đặt phần mềm trên hệ thống Ubuntu 

- Vào terminal và gõ lệnh sau: [sudo apt-get install build-essential]()

  - ["sudo"]() là từ viết tắt của ["Superuser Do"]() : được sử dụng để thực thi câu lệnh với quyền superuser hoặc root.

  - ["apt-get"]() : là một trong những công cụ quản lý gói phần mềm trên hệ thống Ubuntu

  - ["install"]() là tùy chọn được sử dụng để yêu cầu "apt-get" cài đặt một gói phần mềm cụ thể.

  - ["build-essential"]() : " Gói này bao gồm các [compiler](), [linker]() và thư viện tiêu chuẩn, mà bất kỳ lập trình viên nào cũng có thể sử dụng để phát triển và biên dịch phần mềm trên hệ thống.


## 2. Tải xuống mã nguồn và cài đặt

- ["sudo apt-get install xorg-dev"]() : hệ thống sẽ cài đặt các công cụ cần thiết để phát triển các ứng dụng đồ họa X11 trên hệ thống Linux.

## 3. Câu lệnh "wget http://xvnkb.sourceforge.net/xvnkb-0.2.9a.tar.bz2"
- Câu lệnh "wget http://xvnkb.sourceforge.net/xvnkb-0.2.9a.tar.bz2" được sử dụng trong hệ điều hành Linux/Unix để tải về một tập tin từ một địa chỉ web (`http://xvnkb.sourceforge.net/xvnkb-0.2.9a.tar.bz2`) và lưu trữ tập tin đó vào thư mục hiện tại.

Cụ thể, các thành phần trong câu lệnh là:

- `wget`: là một chương trình dòng lệnh được sử dụng để tải về tệp từ các địa chỉ web.
- `http://xvnkb.sourceforge.net/xvnkb-0.2.9a.tar.bz2`: là địa chỉ web của tập tin cần tải về. Đây là đường dẫn đến tệp tin `xvnkb-0.2.9a.tar.bz2` trên trang web `http://xvnkb.sourceforge.net/`.
- `tar.bz2`: là định dạng của tệp tin cần tải về. Đây là một định dạng được sử dụng để nén các tập tin trong hệ thống Unix/Linux.


## 4. Sau đó giải nén bằng lệnh: [tar -xvf xvnkb-0.2.9a.tar.bz2]()
Cụ thể, các tham số trong lệnh `tar -xvf xvnkb-0.2.9a.tar.bz2` có ý nghĩa như sau:

- `-x`: sử dụng để giải nén tệp tin.
- `-v`: hiển thị quá trình giải nén tệp tin trên màn hình.
- `-f`: cho biết rằng tệp tin cần giải nén được chỉ định sau tham số này.
- `xvnkb-0.2.9a.tar.bz2`: tệp tin cần giải nén.
Sau khi thực thi lệnh `tar -xvf xvnkb-0.2.9a.tar.bz2`, tất cả các tệp tin bên trong tệp tin nén `xvnkb-0.2.9a.tar.bz2` sẽ được giải nén vào thư mục hiện tại của bạn.

## 5. Chuyển vào thư mục vừa giải nén và biên dịch: [cd xvnkb-0.2.9a/](), [./autogen.sh](), [./configure --use-extstroke]()
- `cd xvnkb-0.2.9a/`: Dùng để chuyển vào thư mục vừa giải nén `xvnkb-0.2.9a`.
- `./autogen.sh`: Làm việc chuẩn bị cấu trúc cho phần mềm, bao gồm các tệp Cấu hình và Makefile.
- `./configure --use-extstroke`: Lệnh này giúp bạn cấu hình và thiết lập chương trình. `--use-extstroke` là một tùy chọn được sử dụng trong quá trình cấu hình để bật tính năng hỗ trợ gõ tiếng Việt với bộ gõ Unikey sử dụng thư viện được cài đặt trên hệ điều hành Linux.

## 6. phải chỉnh file config.h đúng định dạng
- `make` để biên dịch chương trình `xvnkb`
- `make install` để cài đặt chương trình trên hệ thống của mình.


# Cài đặt công cụ quản lý gói:
Gói `vlc` là một phần mềm mã nguồn mở và miễn phí dùng để phát các loại tập tin đa phương tiện như video và âm thanh trên các hệ điều hành khác nhau như Linux, macOS, Windows, Android, iOS,...

## 1. Lệnh `apt-cache search vlc` được sử dụng trong hệ điều hành Ubuntu:
- để tìm kiếm các gói phần mềm có liên quan đến `vlc` trong kho lưu trữ của Ubuntu

## 2. Lệnh `sudo apt install vlc` được sử dụng trong Ubuntu
- Sau khi thực thi lệnh `sudo apt install vlc`, hệ thống sẽ kiểm tra xem gói phần mềm `vlc` đã được cài đặt hay chưa. Nếu chưa, hệ thống sẽ tải về gói phần mềm `vlc` từ kho lưu trữ và cài đặt nó trên hệ thống.




