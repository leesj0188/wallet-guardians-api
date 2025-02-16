package com.walletguardians.walletguardiansapi.domain.user.controller;

import com.walletguardians.walletguardiansapi.domain.user.entity.User;
import com.walletguardians.walletguardiansapi.domain.user.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class UserController {

  private final UserService userService;

  @GetMapping("/{userId}")
  public ResponseEntity<User> getUserInfo(@PathVariable("userId") Long userId) {
    log.info(String.valueOf(userId));
    User user = userService.findByUserId(userId);
    return ResponseEntity.ok().body(user);
  }

}
