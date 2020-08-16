package com.example.study.services;

import com.example.study.models.Authority;

import java.util.List;
import java.util.Optional;

public interface AuthorityService {

    void createAuthority(Authority authority);

    Optional<Authority> findAuthorityByName(String name);

    List<Authority> findAuthorities();
    /**
     * To find all authorities
     *
     * @return list of authority
     */
    List<Authority> findAllAuthorities();
}
