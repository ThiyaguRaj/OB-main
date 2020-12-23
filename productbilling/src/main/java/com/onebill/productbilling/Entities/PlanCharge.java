//package com.onebill.productbilling.Entities;
//
//import java.io.Serializable;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//import lombok.Data;
//
//@SuppressWarnings("serial")
//@Entity
//@Data
//@Table(name="plan_charge")
//public class PlanCharge implements Serializable{
//	
//	@Id
//	@Column(name="charge_type")
//	private String chargeType;
//	
//	@Column(name="charge")
//	private double charge;
//	
//	@Column(name="document")
//	private String document;
//	
//	@Id
//	@ManyToOne
//	@JoinColumn(name="plan_id")
//	private Plan plan;
//}

package com.onebill.productbilling.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
@Table(name = "plan_charge")
@IdClass(PlanChargeCK.class)
public class PlanCharge {

	@Id
	@Column(name = "charge_type")
	private String chargeType;

	@NotNull
	@Column(name = "charge")
	private double charge;

	@Column(name = "document")
	private String document;

	@Id
	@ManyToOne
	@JoinColumn(name = "plan_id")
	@JsonIgnore
	private Plan plan;

}
