package com.alper.entity;

import com.alper.enums.ECluster;
import com.alper.enums.ERegion;
import jakarta.persistence.*;
import lombok.*;

import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.List;


@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Data
@Entity
@Table(name = "tblleague")
public class League extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="leaguename")
	private String leagueName;
	@Column(name="leagueseason")
	private String leagueSeason;
	@Enumerated(EnumType.STRING)
	private ECluster cluster;
	@Enumerated(EnumType.STRING)
	private ERegion region;
	@Temporal(TemporalType.DATE)
	@Column(name="startdate")
	private LocalDate startDate;
	@ElementCollection
	@Column(name="teamidlist")
	private List<Long> teamIDList;
	
}