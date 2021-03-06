package co.kr.abacus.cube.contract.svcgrp.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import co.kr.abacus.cube.contract.common.entity.BaseEntity;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;


// 무한대 클럽 구성원 
@Entity
@Table(name="TB_SB_FMLY_PNT_GRP")
@ToString
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = true)
public class SbFmlyPntGrpEntity extends BaseEntity {

	@EmbeddedId
	private FmlyPntGrpKeyValue fmlyPntGrpKeyValue;
	
	private String pntGrpCd;
	private String grpSttsCd;
	
}
