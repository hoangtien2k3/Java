
### 1) Sequential vs Parallel computing:







### 2) Parallel computing architecture :  Kiến trúc tính toán song song

Các CPU (bộ vi xử lý) ngày này bao gồm rất nhiều processors (đa nhân) bên trong, chúng ta thường nay nghe đến Intel i5, i7 với 4 nhân (core), 8 luồng (thread)

- Nhờ có nhiều processor (core) như vậy nên chúng thật sự có thể xử lý các bài toán song song với nhau.


#### Sẽ có 4 loại kiến trúc:

- SISD: Single instruction stream, single data stream.
- SIMD: Single instruction stream, multiple data stream.
- MISD: Multiple instruction stream, single data stream.
- MIMD: Multiple instruction stream, multiple data stream.


#### + SISD: 
- Đầu tiên với kiến trúc SISD, trong bất kì thời điểm nào, chỉ có thể xử lý duy nhất một instruction và tương tác với duy nhất một nguồn data. 
- Đây là kiến trúc được áp dụng phổ biến cho các máy tính đời đầu.

#### + SIMD:
-  SIMD, một loại parallel computing với nhiều processor (core), hay chúng ta gọi là nhân của hệ điều hành (multiple processing units).

#### + MISD:
- processor sẽ xử lý riêng một instruction, tuy nhiên tất cả các processors sẽ thực hiện thao tác trên cùng một data.

#### + MIMD:
- MIMD. Mỗi processor sẽ thực hiện những instruction riêng biệt trên data riêng biệt.














