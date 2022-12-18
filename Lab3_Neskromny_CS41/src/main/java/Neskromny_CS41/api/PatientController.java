package Neskromny_CS41.api;

import Neskromny_CS41.entity.DoctorSchedule;
import Neskromny_CS41.entity.Patient;
import Neskromny_CS41.repository.DoctorScheduleRepository;
import Neskromny_CS41.repository.PatientRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/patients")
public class PatientController {

  private final DoctorScheduleRepository doctorScheduleRepository;
  private final PatientRepository patientRepository;

  @GetMapping("/{id}/schedules")
  public List<DoctorSchedule> fetchSchedulesForPatient(@PathVariable Long id) {
    return doctorScheduleRepository.findAllByPatientId(id);
  }

  @GetMapping("/")
  public List<Patient> fetchAllPatients() {
    return patientRepository.findAll();
  }
}
