package music.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Taikhoan")
public class Taikhoan implements Serializable{
	@Id
	@GeneratedValue
	Integer MaTK;
	String tenDN;
	String MatKhau;
	Integer Quyen;
	Boolean TinhtrangTK;
	String Email;
	String Ten;
	Integer Tuoi;
	

	public Integer getMaTK() {
		return MaTK;
	}

	public void setMaTK(Integer MaTK) {
		this.MaTK = MaTK;
	}

	public String getTenDN() {
		return tenDN;
	}

	public void setTenDN(String nameVN) {
		this.tenDN = tenDN;
	}

	public String getMatkhau() {
		return MatKhau;
	}


	public Integer getQuyen() {
		return Quyen;
	}

	public void setQuyen(Integer quyen) {
		Quyen = quyen;
	}

	public Boolean getTinhtrangTK() {
		return TinhtrangTK;
	}

	public void setTinhtrangTK(Boolean tinhtrangTK) {
		TinhtrangTK = tinhtrangTK;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getTen() {
		return Ten;
	}

	public void setTen(String ten) {
		Ten = ten;
	}

	public Integer getTuoi() {
		return Tuoi;
	}

	public void setTuoi(Integer tuoi) {
		Tuoi = tuoi;
	}

	

	

	public String getMatKhau() {
		return MatKhau;
	}



}
