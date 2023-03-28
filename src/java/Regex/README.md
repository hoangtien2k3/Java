## LÝ THUYẾT VÀ CÁC QUY TẮC
Java Regex:
Java Regex hoặc Regular Expression là một giao diện lập trình để xác định
các mô hình dùng để tìm kiếm hoặc thao tác chuỗi.

    
*   Gói java.util.regex package:
    + src.java.JavaCore.Interface MatchResult
    + Lớp Matcher
    + Lớp Pattern
    + Lớp PatternSyntaxException


    Methods of the Matcher Class:

    1. boolean matches():  kiểm tra xem biểu thức chính quy có khớp với mẫu hay không.
    2. boolean find():     tìm biểu thức tiếp theo khớp với mẫu.
    3. boolean find(int start):    tìm biểu thức tiếp theo khớp với mẫu từ số bắt đầu đã cho.
    4. String group():     trả về chuỗi con phù hợp.
    5. int start():        trả về vị trí bắt đầu của chuỗi con phù hợp.
    6. int end():          trả về vị trí kết thúc của chuỗi con phù hợp.
    7. int groupCount():   trả về tổng số các chuỗi con phù hợp.


//////////////////////////////////////////////////////////////////////////////////////////////


    Lớp Pattern:
    - Đây là phiên bản được biên dịch của một biểu thức chính quy.
    - Nó được sử dụng để xác định một mẫu cho bộ máy regex.

    1. static Pattern compile(String regex):    biên dịch regex đã cho và trả về thể hiện của Pattern.
    2. Matcher matcher(CharSequence input):     tạo một matcher khớp với đầu vào đã cho với mẫu.
    3. static boolean matches(String regex, CharSequence input):    Nó biên dịch biểu thức chính quy và tìm kiếm các chuỗi con từ chuỗi input phù hợp với mẫu regex.
    4. String[] split(CharSequence input):      chia chuỗi input đã cho thành mảng các kết quả trùng khớp với mẫu đã cho.
    5. String pattern():    trả về mẫu regex.




#### Các lớp ký tự Regex

        Regex	                    Mô tả
        [...]	            trả về một ký tự phù hợp

        [abc]	            a, b, hoặc c

        [^abc]	            Bất kỳ ký tự nào ngoại trừ a, b, hoặc c

        [a-zA-Z]	        a tới z hoặc A tới Z

        [a-d[m-p]]	        a tới d, hoặc m tới p: [a-dm-p]

        [a-z&&[def]]	    d, e, hoặc f

        [a-z&&[^bc]]	    a tới z, ngoại trừ b và c: [ad-z]

        [a-z&&[^m-p]]	    a tới z, ngoại trừ m tới p: [a-lq-z]

        [0-9]	            0 tới 9


//////////////////////////////////////////////////////////////////////////////////////////////


#### Số lượng ký tự trong Regex

    Regex	            Mô tả	                                    Pattern	Ví dụ
    X?	        X xảy ra một hoặc không lần.	                    hellos?	hello, hellos, helloss

    X+	        X xảy ra một hoặc nhiều lần.	                    Version \w-\w+	Version A-b1_1

    X*	        X xảy ra không hoặc nhiều lần.	                    A*B*C*	AAACC

    X{n}	    X chỉ xảy ra n lần.	                                \d{4}	2018, 20189, 201

    X{n,}	    X xảy ra n hoặc nhiều lần.	                        \d{4,}	2018, 20189, 201

    X{y,z}	    X xảy ra ít nhất y lần nhưng nhỏ hơn z lần.	        \d{2,3}	2018, 201


//////////////////////////////////////////////////////////////////////////////////////////////


#### Ký tự đặc biệt trong Regex

    Regex	        Mô tả

    ^	        + Có 2 cách sử dụng.
                    1. Đánh dấu bắt đầu của một dòng, một chuỗi.
                    2. Nếuu sử dụng trong dấu [...] thì nó có nghĩa là phủ định.

    .	        + Bất kỳ ký tự nào

    $	        + Đánh dấu Kết thúc của một dòng

    \d	        + Bất kỳ chữ số nào, viết tắt của [0-9]

    \D	        + Bất kỳ ký tự nào không phải chữ số, viết tắt của [^0-9]

    \s	        + Bất kỳ ký tự trống nào (như dấu cách, tab, xuống dòng, ...), viết tắt của [\t\n\x0B\f\r]

    \S	        + Bất kỳ ký tự trống nào không phải ký tự trống, viết tắt của [^\s]

    \w	        + Bất kỳ ký tự chữ nào (chữ cái và chữ số), viết tắt của [a-zA-Z_0-9]

    \W	        + Bất kỳ ký tự nào không phải chữ cái và chữ số, viết tắt của [^\w]

    \b	        + Ranh giới của một từ

    \B	        + Không phải ranh giới của một từ


//////////////////////////////////////////////////////////////////////////////////////////////


#### Ký tự logic trong Regex

    Regex	    Mô tả	                                Pattern	Ví dụ
    |	        Hoặc	                                22|33	33

    /           Bắt đầu hoặc kết thức chuỗi regex.

    \           Biểu diễn một ký tự ngay sau nó.        \*  thành ký tự * chứ không phải là số lần lặp nữa.
                Từ ký tự đặc biệt, trở thành ký tự
                thường và ngược lại.

    ( … )	    Group các ký tự và chụp lại	            A(nt|pple)	Ant, Apple

    \1	        Nội dung của Group 1	                r(\w)g\1x	regex

    \2	        Nội dung của Group 2	                (\d\d)\+(\d\d)=\2\+\1	12+65=65+12

    (?: … )	    Khớp với x nhưng không nhớ kết quả.     A(? : nt|pple)	  Ant, Apple

    x(?= y)     Chỉ khớp x nếu sau x là y               "hello" sẽ khớp với /h(?:e)/ nhưng kết quả trả về chỉ có h

    x(?! y)     Chỉ khớp x nếu ngay sau x không
                phải là y

