package zw.co.cytex.exposejson.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zw.co.cytex.exposejson.model.InstrumentID;

import java.util.Optional;


public interface InstrumentRepository extends JpaRepository<InstrumentID, Long> {

    Boolean existsByInstrument(String instrument);
}
