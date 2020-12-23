//package com.onebill.productbilling.Entities;
//
//import java.util.List;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//import javax.validation.constraints.NotNull;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//
//import lombok.Data;
//
//@Entity
//@Data
//@Table(name = "product")
//public class Product {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@Column(name = "product_id")
//	private int productId;
//
//	@Column(name = "product_name",unique = true)
//	@NotNull
//	private String productName;
//
//	@NotNull
//	@Column(name = "product_type")
//	private String productType;
//
//	@OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
//	@JsonIgnore
//	private List<Plan> plan;
//
//}

package com.onebill.productbilling.Entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Data
@Table(name = "product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "product_id")
	private int productId;

	@Column(name = "product_name", unique = true)
	@NotNull
	private String productName;

	@NotNull
	@Column(name = "product_type")
	private String productType;

	@OneToMany(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.EAGER,orphanRemoval=true)
	private List<Plan> plan;

}
