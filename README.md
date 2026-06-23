# CodeSandbox — Java Practice & Progress Tracker

Repo cá nhân lưu các bài tập / project luyện code Java của Aiden. Dùng để đồng bộ
giữa nhiều máy và theo dõi tiến độ (bài nào xong, bài nào còn dở).

## Hướng dẫn cho Claude (đọc kỹ mỗi khi được yêu cầu đọc repo này)

Khi user dán link repo này và bảo "nắm context của codebase / project đang làm",
Claude cần tự hiểu các điều sau mà KHÔNG cần user giải thích lại:

1. **Mục đích repo**: nơi lưu toàn bộ bài tập và tiến độ luyện code của user.
   User làm việc trên 2 máy khác nhau, nên repo là nguồn đồng bộ chính. User
   cũng lưu bản local nhưng ít khi xem, nên GitHub là nơi review chính thức.

2. **Khi user nói "pull / kéo content về folder của tui"**: nghĩa là lấy code
   từ repo này về folder làm việc local mà user đang mở trong session, để user
   tiếp tục code. Hỏi user folder đích nếu chưa rõ.

3. **Đây là tracker tiến độ**: nhiều project chưa hoàn thành. Khi đọc, Claude
   nên xác định project nào còn dở (method trống, case switch chưa điền...) để
   user biết chỗ cần làm tiếp.

4. **Cấu trúc thư mục bắt buộc**:
   ```
   <TenProject>/
       <package1>/   (vd: Manager/, data/)
           *.java
       <package2>/
           *.java
   ```
   Mỗi exercise là 1 folder riêng ở root, tên = tên project. Bên trong giữ
   nguyên cấu trúc package Java (mỗi package = 1 folder, chứa các file .java).

## Các project

| Project | Mô tả | Trạng thái |
|---|---|---|
| QuanLyNhanVien | OOP: kế thừa, polymorphism, instanceof, ArrayList, sort, search | Đang làm dở (menu case 2-8 chưa điền) |
