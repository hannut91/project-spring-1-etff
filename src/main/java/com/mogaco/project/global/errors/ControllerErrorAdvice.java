package com.mogaco.project.global.errors;

import com.mogaco.project.member.application.MemberNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseBody
@ControllerAdvice
public class ControllerErrorAdvice {

  @ResponseStatus(HttpStatus.BAD_REQUEST)
  @ExceptionHandler(IllegalArgumentException.class)
  public void handleIllegalArgument() {
  }

  @ResponseStatus(HttpStatus.NOT_FOUND)
  @ExceptionHandler(MemberNotFoundException.class)
  public ErrorResponse handleMemberNotFound() {
    return new ErrorResponse("Member not found");
  }
}
