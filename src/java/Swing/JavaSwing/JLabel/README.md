
## JLabel trong Java
Lớp JLabel trong Java Swing có thể hiển thị hoặc text, hoặc hình ảnh hoặc cả hai. Các nội dung của Label được gán bởi thiết lập căn chỉnh ngang và dọc trong khu vực hiển thị của nó.

### Tạo Label trong Java Swing
Constructor:
- public JLabel ()
- public JLabel (java.lang.String text)
- public JLabel (java.lang.String text, int horizontalAlignment)
- public JLabel (Icon image)
- public JLabel (Icon image, int horizontalAlignment)
- public JLabel (Java.lang.String text, Icon icon, int horizontalAlignment)



### Mnemonic Key:
Hàm **setDisplayedMnemonic()** dùng để tạo một mnemonic key cho Label, mnemonic key này sẽ được gạch chân để gợi ý cho người dùng.


### Căn chỉnh văn bản:
Chúng ta có thể quản lý vị trí xuất hiện của văn bản trong Label. Ví dụ căn chỉnh label hiển thị giữa theo chiều dọc và chiều ngang.
```JAVA
label.setHorizontalAlignment(JLabel.CENTER);
label.setVerticalAlignment(JLabel.CENTER);
```


### Vô hiệu hoá Label:
































