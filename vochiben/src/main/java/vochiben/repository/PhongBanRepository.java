package vochiben.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import vochiben.model.PhongBan;

public interface PhongBanRepository extends JpaRepository<PhongBan, String> {
}