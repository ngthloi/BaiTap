package vochiben.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vochiben.model.PhongBan;
import vochiben.repository.PhongBanRepository;

@Service
@Transactional
public class PhongBanService {
    @Autowired
    private PhongBanRepository phongBanRepository;

    public PhongBan savePhongBan(PhongBan phongBan) {
        return phongBanRepository.save(phongBan);
    }

    public void deletePhongBan(String maPhong) {
        phongBanRepository.deleteById(maPhong);
    }

    public PhongBan getPhongBanByMaPhong(String maPhong) {
        return phongBanRepository.findById(maPhong).orElse(null);
    }
}