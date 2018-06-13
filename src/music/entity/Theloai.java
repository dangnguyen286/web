package music.entity;


import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import music.entity.BaiHat;
import java.util.Collection;
@Entity
@Table(name="Theloai")
public class Theloai {

	@Id
	@OneToMany(mappedBy="theloai")
	Collection<BaiHat> baihats;
	Integer MaTL;
	String TenTheLoai;
	public Integer getMaTL() {
		return MaTL;
	}
	public void setMaTL(Integer maTL) {
		MaTL = maTL;
	}
	public String getTenTheLoai() {
		return TenTheLoai;
	}
	public void setTenTheLoai(String tenTheLoai) {
		TenTheLoai = tenTheLoai;
	}
	
	
}
