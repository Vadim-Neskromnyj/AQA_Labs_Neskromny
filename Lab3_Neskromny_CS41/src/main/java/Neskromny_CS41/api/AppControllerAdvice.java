package Neskromny_CS41.api;

import Neskromny_CS41.exception.SessionWithDoctorScheduleException;
import Neskromny_CS41.exception.UnknownScheduleException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AppControllerAdvice {

  @ExceptionHandler(IllegalArgumentException.class)
  public IllegalArgumentException handleWrongInput(IllegalArgumentException e) {
    return e;
  }

  @ExceptionHandler(SessionWithDoctorScheduleException.class)
  public SessionWithDoctorScheduleException handleWrongInput(SessionWithDoctorScheduleException e) {
    return e;
  }

  @ExceptionHandler(UnknownScheduleException.class)
  public UnknownScheduleException handleWrongInput(UnknownScheduleException e) {
    return e;
  }
}
