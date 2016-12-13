/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.service;

import mvc.entity.User;

/**
 *
 * @author lengzq
 */
public interface LoginService {
    public boolean login(User user);
}
