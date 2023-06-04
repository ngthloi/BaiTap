package vochiben.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vochiben.repository.NhanVienRepository;
import vochiben.model.NhanVien;

@Service
@Transactional
public class NhanVienService {
    @Autowired
    private NhanVienRepository nhanVienRepository;

    public NhanVien saveNhanVien(NhanVien nhanVien) {
        return nhanVienRepository.save(nhanVien);
    }

    public void deleteNhanVien(String maNV) {
        nhanVienRepository.deleteById(maNV);
    }

    public NhanVien getNhanVienByMaNV(String maNV) {
        return nhanVienRepository.findById(maNV).orElse(null);
    }
}

