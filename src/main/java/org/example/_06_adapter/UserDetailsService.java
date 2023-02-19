package org.example._06_adapter;

public interface UserDetailsService {

    UserDetails loadUser(String username);

}
