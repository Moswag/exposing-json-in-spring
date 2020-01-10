package zw.co.cytex.exposejson.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@Entity
@Table(name = "instrument")
public class InstrumentID {
    @Id
    private Long id;

    @NotBlank
    @Size(max = 40)
    private String instrument;
}
