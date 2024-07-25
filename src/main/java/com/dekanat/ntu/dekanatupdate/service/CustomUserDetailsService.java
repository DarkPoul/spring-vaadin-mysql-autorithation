package com.dekanat.ntu.dekanatupdate.service;


import com.dekanat.ntu.dekanatupdate.entity.UserEntity;
import com.dekanat.ntu.dekanatupdate.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Optional;

@Service
public class CustomUserDetailsService implements UserDetailsService {


    private final UserRepository userRepository;

    @Autowired
    public CustomUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        assert userRepository != null;
        Optional<UserEntity> userEntityOpt = userRepository.findByEmail(email);
        if (userEntityOpt.isEmpty()) {
            throw new UsernameNotFoundException("User not found with email: " + email);
        }

        UserEntity userEntity = userEntityOpt.get();
        GrantedAuthority authority = new SimpleGrantedAuthority("ROLE_" + userEntity.getRole());
        return new User(userEntity.getEmail(), userEntity.getPassword(), Collections.singleton(authority));
    }
}
