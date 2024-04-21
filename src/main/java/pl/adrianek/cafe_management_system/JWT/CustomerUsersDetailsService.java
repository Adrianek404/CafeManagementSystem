package pl.adrianek.cafe_management_system.JWT;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import pl.adrianek.cafe_management_system.dao.UserDao;

public class CustomerUsersDetailsService implements UserDetailsService {

    @Autowired
    UserDao userDao;

    private pl.adrianek.cafe_management_system.POJO.User userDetail;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
