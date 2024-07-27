package workermanagement;

import data.Worker;
import java.util.*;

/**
 *
 * @author quang
 */
public class WorkerManagement {

    private static List<Worker> arr = new ArrayList();

    public static void main(String[] args) {
        fakeData();
        sapXepTangDanTheoLuong();
        suaThongTinLD();
    }

    public static void fakeData() {
        Worker wk1 = new Worker("Ld2021", "van a", 6);
        Worker wk2 = new Worker("Ld2022", "van b", 25);
        Worker wk3 = new Worker("Ld2023", "van c", 16);
        Worker wk4 = new Worker("Ld2024", "van d", 30);
        Worker wk5 = new Worker("Ld2025", "van e", 15);
        arr.add(wk1);
        arr.add(wk2);
        arr.add(wk3);
        arr.add(wk4);
        arr.add(wk5);

        Worker.inTieuDe();
        for (Worker x : arr) {
            x.inDuLieu();
        }
    }

    public static void sapXepTangDanTheoLuong() {
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i).tinhLuong() > arr.get(j).tinhLuong()) {
                    Worker t = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, t);
                }

            }
        }
        System.out.println("Sau khi sắp xếp danh sách tăng dần theo số lương:");
        Worker.inTieuDe();
        for (Worker x : arr) {
            x.inDuLieu();
        }
    }

    public static void suaThongTinLD() {
        Scanner sc = new Scanner(System.in);
        String id;
        int check = 0;  //bien nay dung de xac dinh co ton tai cong nhan voi ma vua nhap hay khong
        System.out.print("Mời nhập vào mã lao động của công nhân bạn muốn sửa thông tin: ");
        id = sc.nextLine();
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getMa().equalsIgnoreCase(id)) {
                check++;
                System.out.println("Đây là thông tin công nhân bạn muốn sửa: ");
                Worker.inTieuDe();
                arr.get(i).inDuLieu();
                System.out.println("Mời sửa thông tin: ");
                System.out.print("Mã lao động: ");
                arr.get(i).setMa(sc.nextLine());
                System.out.print("Tên lao động: ");
                arr.get(i).setTen(sc.nextLine());
                System.out.print("Số ngày công: ");
                arr.get(i).setSoNgayCong(Integer.parseInt(sc.nextLine()));
                System.out.println("Chỉnh sửa thành công!");
                System.out.println("Danh sách sau khi cập nhật thông tin: ");
                Worker.inTieuDe();
                for (Worker x : arr) {
                    x.inDuLieu();
                }

            }
        }
        if (check == 0) {
            System.out.println("Không thể tìm thấy công nhân có mã vừa nhập!");
        }
    }
}
