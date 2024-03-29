package edu.fisa.lab.model.domain;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder  


@Table(name="product")
@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private Long productId;

	@Column//데이터베이스와 매핑
	private String productName;

	@Column
	private int price;

	@Column
	private String brand;

	@Column
	private int size;

	private Category category;
	
	@OneToMany(mappedBy = "product")
	private List<Draw> drawList = new ArrayList<>();
	
	public void addDraw(Draw d) {
		d.setProduct(this);
		this.drawList.add(d);
	}
	
	//== 생성 메서드 ==
}
