package Neskromny_CS41.repository;

import Neskromny_CS41.entity.DoctorSchedule;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorScheduleRepository extends JpaRepository<DoctorSchedule, Long> {

  List<DoctorSchedule> findAllByDoctorId(Long doctorId);

  DoctorSchedule findFirstByDoctorIdAndTime(Long doctorId, LocalDateTime time);

  List<DoctorSchedule> findAllByDoctorIdAndTimeBetween(long doctorId, LocalDateTime from,
      LocalDateTime to);

  List<DoctorSchedule> findAllByPatientId(Long patientId);
}
