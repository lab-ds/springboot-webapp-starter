package br.edu.ifrs.canoas.lds.webapp.config.auth;

import org.springframework.security.core.GrantedAuthority;

import lombok.Getter;

import java.util.Collection;

/**
 * Created by rodrigo on 3/19/17.
 */
public class UserImpl extends org.springframework.security.core.userdetails.User{

	private static final long serialVersionUID = 1308839480601748734L;

	private br.edu.ifrs.canoas.lds.webapp.domain.User user;

    public UserImpl(String username, String password, Collection<? extends GrantedAuthority> authorities, br.edu.ifrs.canoas.lds.webapp.domain.User user) {
        super(username, password, authorities);
        this.user = user;
    }

    public UserImpl(String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
    }

    public UserImpl(String username, String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired, boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
    }

    public br.edu.ifrs.canoas.lds.webapp.domain.User getUser() {
		return user;
	}

}
