package com.flouci.application1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Task {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "task_seq_generator")
	@SequenceGenerator(name = "task_seq_generator", sequenceName = "TASK_SEQ", allocationSize = 1)
	private Long id;
	private Double amount;
	private Double tva;
}
