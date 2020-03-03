/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.project.pi4.Interfaces;

import br.senac.project.pi4.models.User;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 * 
 */
public interface Authenticable {

    public void login(User user, HttpServletRequest request, HttpSession session);
}
