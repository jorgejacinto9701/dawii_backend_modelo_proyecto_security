package com.cibertec.security;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.filter.OncePerRequestFilter;

public class JwtTokenFilter extends OncePerRequestFilter {

	private final static Logger logger = LoggerFactory.getLogger(JwtTokenFilter.class);

	@Autowired
	JwtProvider jwtProvider;

	@Autowired
	UserDetailsService userDetailsService;

	@Override
	protected void doFilterInternal(HttpServletRequest req, HttpServletResponse res, FilterChain filterChain)
			throws ServletException, IOException {
		logger.error(">>> Ingreso doFilterInternal");
		try {
			String token = getToken(req);
<<<<<<< HEAD
			logger.error(">>> Llegó token ==> " + token);
			
=======
			logger.info(">>> doFilterInternal >> token >> "  + token);
>>>>>>> branch 'master' of https://github.com/jorgejacinto9701/dawii_backend_modelo_proyecto_security.git
			if (token != null && jwtProvider.validateToken(token)) {
				String nombreUsuario = jwtProvider.getNombreUsuarioFromToken(token);
<<<<<<< HEAD
				logger.error(">>> Llegó Usuario ==> " + nombreUsuario);
				
=======
				logger.info(">>> doFilterInternal >> nombreUsuario >> "  + nombreUsuario);
>>>>>>> branch 'master' of https://github.com/jorgejacinto9701/dawii_backend_modelo_proyecto_security.git
				UserDetails userDetails = userDetailsService.loadUserByUsername(nombreUsuario);

				UsernamePasswordAuthenticationToken auth = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
				SecurityContextHolder.getContext().setAuthentication(auth);
			}
		} catch (Exception e) {
			logger.error("fail en el método doFilter " + e.getMessage());
		}
		filterChain.doFilter(req, res);
	}

	private String getToken(HttpServletRequest request) {
		String header = request.getHeader("Authorization");
		if (header != null && header.startsWith("Bearer"))
			return header.replace("Bearer ", "");
		return null;
	}
}
