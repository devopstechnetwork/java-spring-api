package dev.sandrocaseiro.apitemplate.security;

public interface IAuthenticationInfo {
    boolean isAuthenticated();

    Integer getId();
}