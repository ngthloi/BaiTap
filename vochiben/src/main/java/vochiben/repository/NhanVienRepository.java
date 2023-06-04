package vochiben.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vochiben.model.NhanVien;

public interface NhanVienRepository extends JpaRepository<NhanVien, String> {
}