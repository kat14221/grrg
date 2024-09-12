package pe.edu.upeu.Entity;

import java.sql.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Setter
@Getter
@Table(name = "matriculass")
public class Matriculas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name = "fecha matricula")
	@Temporal(value = TemporalType.DATE)
	private Date fecha_mat;
	@Column(name = "horas")
	private Integer horas;
	@Column(name = "nivel", length = 15)
	private String nivel;
	
	@ManyToOne
	@JoinColumn(name = "Alumnos_id", nullable = false)
	private Alumnos alumnos;
	@ManyToOne
	@JoinColumn(name = "Grado_id", nullable = false)
	private Empleados empleados;
	@ManyToOne
	@JoinColumn(name = "Empleado_id", nullable = false)
	private Grados grados;

}
