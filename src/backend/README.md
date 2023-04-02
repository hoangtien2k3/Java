
![image](https://user-images.githubusercontent.com/122768076/225546281-e07e92ee-0b50-4832-b961-908763b1b906.png)
![](https://images.viblo.asia/99c936d5-36dc-4928-921a-30e1b4338983.png)
![](https://images.viblo.asia/594d086c-73c2-4802-9266-55c7914f3f43.jpeg)
#### [1. backend-roadmap](https://drive.google.com/file/d/1TJOYRf4tuRDxRBQGOs00mArmcmzK6UjV/view)
#### [2. backend-roadmap](https://topdev.vn/blog/wp-content/uploads/2018/08/1_WQviQNNE2cnhVAiQpIXkQg.png)



## Bước 1 – Học một ngôn ngữ mới

Có cả tá lựa chọn về ngôn ngữ dành cho bạn. Tôi có chia nhỏ nó ra các categories để bạn dễ lựa chọn hơn. Đối với những người mới thì tôi khuyên bạn nên chọn các ngôn ngữ scripting vì chúng có nhiều demand và cho phép bạn bắt kịp nhanh chóng. Nếu bạn có một ít kiến thức frontend, bạn sẽ thấy Node.js dễ hơn nhiều và có rất nhiều job về nó đang mở.

Nếu bạn đang làm backend và biết một số scripting language, tôi đề xuất không chọn một ngôn ngữ scripting language khác nữa mà chọn trong section “Functional” hoặc “Multiparadigm”. Ví dụ, nếu bạn đang làm PHP hoặc Mode.js, đừng nên chọn Python hoặc Ruby, mà hãy thử Erlang hoặc Golang. Nó sẽ giúp bạn tư duy xa hơn và open với những mảng khác hơn.


## Bước 2 - Thực hành ngay những cái đã học

Học phải đi đôi với hành. Một khi bạn đã chọn được ngôn ngữ phù hợp và có được nền tảng căn bản về nó, hãy dùng nó ngay. Hãy tạo nên càng nhiều app nhỏ càng tốt. Dưới đây là một số gợi ý cho bạn:

- Ứng dụng các command mà bạn dùng trên bash, ví dụ ứng dụng function ls
- Viết một command để fetch và lưu các post reddit trên /r/programming dưới dạng file JSON
- Viết một command cung cấp directory structure dưới dạng format JSON ví dụ jsonify dir-name cho ra file JSON có structure bên trong dir-name
- Viết một command đọc JSON của bước trên và tạo ra directory structure
- Nghĩ một vài task hằng ngày của mình và automate chúng


## Bước 3 - Học Package Manager

Một khi đã học được những cái cơ bản của một ngôn ngữ và tại nên một vài app mẫu, hãy học cách dùng package manager ngôn ngữ đó. Các package manager sẽ giúp bạn dùng các thư viện ngoài  và phân phối các thư viện cho người khác dùng.

Nếu bạn chọn PHP thì bạn có thể học về Composer, Node.js sẽ có NPM hoặc Yarn, Python có Pip và Ruby có RubyGems. Dù cho bạn chọn cái nào đi nữa, hãy cứ tiếp tục và học về package manager.


## Bước 4 - Các tiêu chuẩn và Best Practices

Mỗi ngôn ngữ có những tiêu chuẩn riêng và best practices (cách làm tốt nhất). Hãy tìm ra và học hỏi từ nó. Ví dụ, PHP có PHP-FIG và PSRs. Với Node.js sẽ có rất nhiều hướng dẫn phục vụ cộng đồng cũng như nhiều ngôn ngữ khác.


## Bước 5 - Bảo mật

Hãy nhớ đọc về các best practices trong mảng bảo mật. Đọc OWASPguidelines để hiểu về nhiều vấn đề bảo mật khác nhau và cách phòng tránh nó đối với từng ngôn ngữ mà bạn chọn.

## Bước 6 - Thực hành thêm nữa

Sau những nền tảng cơ bản, tiêu chuẩn và best practice, bảo mật cũng như cách dùng package manager, bây giờ là lúc tự tạo nên một package và phân phối nó đi cho người  khác dùng, nhớ follow các tiêu chuẩn và best practices đã học. Ví dụ như, nếu bạn chọn PHP, bạn có thể release nó trên Packagist, còn nếu chọn Node.js thì release trên Npm registry,…

Sau khi đã xong, bạn có thể search thêm một số project trên Github và mở một số pull request trong các projects. Dưới đây là một vài gợi ý cho bạn:

Refactor và ứng dụng những best practice mà bạn học được
Xem các vấn đề mở và thử giải quyết nó
Add thêm một số functionality


## Bước 7 - Học thêm về Testing

Hiện có rất nhiều kiểu test, mục tiêu đó là phải hiểu rõ các loại này là gì. Nhưng trước mắt hãy cách viết Unit Test và Integration test cho app trước đã. Đồng thời hãy tìm hiểu thêm về các phương pháp testing như mocks, stubs,…


## Bước 8 - Thực tế

Hãy viết thử unit test cho một số task thực tế mà bạn đã làm, đặc biệt là những cái bạn đã làm ở Bước 6.

Đồng thời nhớ tính toán thử mức độ cover của các test đã viết.


## Bước 9 - Học về Relational Database

Làm thế nào để bảo toàn data trên relational database (dữ liệu quan hệ). Trước khi bạn lựa chọn tool để học, hãy tìm hiểu trước về các phương pháp database terminologies khác nhau như các key, index, normalization, tuple, v.v

Có rất nhiều sự lựa chọn, tuy nhiên nếu bạn học một cái rồi, thì những cái còn lại sẽ trở nên dễ hơn. Một trong những cái lý tưởng để bắt đầu đó là MySQL, MariaDB (khá giống nhau và là một mảnh của MySQL) và PostgreSQL. Pick MySQL.

## Bước 10 - Thời gian thực tế

Bây giờ bạn sẽ đem tất cả những thứ bạn đã học ra để sử dụng. Tạo nên một ứng dụng đơn giản, bất cứ idea nào, ví dụ một ứng dụng viết blog, rồi áp dụng các feature dưới đây:

- User Account — Đăng ký và Đăng nhập
- Những user đã đăng ký có thể tạo các bài blog
- User có thể xem tất cả các bài blog mà mình đã viết
- User có thể xoá bài blog
- User chỉ xem được blog của mình chứ không xem của người khác được
- Viết các unit/integration test cho app
- Bạn có thể áp dụng index cho các query. Phân tích queries để biết chắc là các index đang hoạt động


## Bước 11 - Học một Framework

Tuỳ vào project và ngôn ngữ mà bạn chọn thì bạn có thể cần hoặc không cần đến framework. Mỗi ngôn ngữ có rất nhiều lựa chọn, hãy tìm hiểu và xem xem ngôn ngữ của bạn có gì và chọn một cái liên quan.

Nếu bạn chọn PHP, tôi đề xuất bạn nên dùng Laravel hoặc Symfony hoặc đối với các framework nhỏ thì bạn có thể dùng Lumen hoặc Slim. Nếu bạn chọn Node.js thì cũng có rất nhiều lựa chọn nhưng cái mạnh nhất đến nay đó là Express.js.


## Bước 12 - Thời gian thực hành

Để thực hành bước này, hãy convert app và bạn đã làm ở Bước 10 để áp dụng framework mình đã chọn. Nhớ port mọi thứ kể cả các test nhé.

![](https://topdev.vn/blog/wp-content/uploads/2018/08/codingda-1536x864.jpg)


## Bước 13 - Học NoSQL Database
Đầu tiên hãy tìm hiểu nó là cái gì, chúng khác dữ liệu quan hệ chỗ nào và tại sao cần dùng đến nó. Có rất nhiều sự lựa chọn, chỉ cần tìm kiếm một chút và so sánh các feature sẽ thấy được sự khác nhau. Một số option phổ biến gồm có MongoDB, Cassandra, RethinkDB và Couchbase. Nếu phải chọn một thì bạn nên chọn MongoDB.

## Bước 14 - Caching
Hãy tìm hiểu cách ứng dụng app level caching cho ứng dụng của mình. Hiểu được cách sử dụng mà bạn đã build ở Bước 12.


## Bước 15 - Tạo các RESTful API

Tìm hiểu về REST và học cách tạo ra các RESTful API và nhớ đọc về REST trong bài viết gốc của Roy Fielding, để cứ hễ ai bảo REST chỉ dành cho HTTP API là bạn sẽ có thể sửa lưng họ ngay.


## Bước 16 - Học các Auth Method khác nhau
Bạn cần phải biết chúng là gì, sử dụng thế nào và cái này khác cái kia ở chỗ nào

- OAuth - Open Authentication
- Basic Authentication
- Token Authentication
- JWT - JSON Web Tokens
- OpenID

## Bước 17 - Các Message Broker
Cũng có nhiều lựa chọn cho bạn nhưng có 2 cái nổi bật hơn đó là RabbitMQ và Kafka. Nếu phải chọn một thì nên hãy học RabbitMQ trước.

## Bước 18 - Công cụ Search

Khi app đã bắt đầu phát triển, các query đơn giản dù cho trên dữ liệu quan hệ hay dữ liệu NoSQL sẽ không từ cắt ra và bạn sẽ phải resort riêng công cụ search. Bạn nên cân nhắc tuỳ nhu cầu, vì có rất nhiều option và mỗi option đều có những điểm đặc biệt riêng.

## Bước 19 - Học cách dùng Docker

Docker có thể giúp bạn rất nhiều trong quá trình lập trình ứng dụng, không chỉ tạo lặp một môi trường tương tự khi produce,  giữ cho hệ điều hành luôn sạch sẽ hoặc thúc đẩy code, test và deploy. Tôi sẽ cho bạn một câu hỏi để tìm hiểu và tự trả lời cho mình “Nó sẽ giúp tôi bằng cách nào?”. Cứ thế hãy tìm hiểu và học cách dùng Docker.


## Bước 20 - Trau dồi kiến thức về các Web Server

Nếu đã đến bước này, bạn chắc chắn đã phải tiếp xúc với nhiều server. Lúc này chủ yếu bạn sẽ tìm điểm khác nhau giữa các web server, hiểu được những giới hạn và các configuration option có sẵn cũng như cách viết app để tối ưu hoá các giới hạn này.

## Bước 21 — Học cách dùng Web Socket

Mặc dù không bắt buộc, có thêm kiến thức này có thể giúp ích cho bạn rất nhiều. Tìm hiểu xem cách viết web app real-time và một số app mẫu bằng web-socket, bạn có thể dùng nó trên blog application để ứng dụng các update real-time trên blog posts listing.

## Bước 22 - Học GraphQL

Hiểu rõ nó khác chỗ nào REST và tại sao lại gọi nó là REST 2.0.

## Bước 23 - Xem các biểu đồ dữ liệu
Các Biểu đồ đồ thị sẽ giúp bạn linh hoạt hơn khi xử lý data, cũng như cung cấp cho bạn nguồn lưu trữ nhanh chóng và hiệu quả để dễ thu hồi hoặc query nó. Học thêm về Neo4j or OrientDB.


## Bước 24 - Không ngừng khám phá thêm
Một khi bạn đã bắt tay vào học và làm, chắc chắn bạn sẽ vấp phải thêm nhiều thứ mà chúng tôi chưa liệt kê hết trên đây. Hãy luôn ở trong tâm lý mở không ngại học cái mới, vì kết quả thế nào là do bạn chọn. 






