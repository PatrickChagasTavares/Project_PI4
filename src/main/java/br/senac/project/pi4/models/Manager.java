/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.project.pi4.models;

import br.senac.project.pi4.DAOs.ReportDAO;
import br.senac.project.pi4.Interfaces.Emitable;
import br.senac.project.pi4.enums.Roles;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 * 
 */
public class Manager extends User {

    private final Roles permission = Roles.GERENTE; //permission user 

    public Manager(String mail, String password) {
        super(mail, password);
    }

    public Manager() {

    }

    @Override
    public Roles getPermission() {
        return permission;
    }

    @Override
    public void login(User user, HttpServletRequest request, HttpSession session) {
        session.setAttribute("user", user);
    }

    @Override
    public Report generateReport(int idBranch) {
        Report report = ReportDAO.generateReport(idBranch);
        if (report != null) {
            double soma = 0;
            for (ItemOrdered item : report.getItemList()) {
                soma += item.getValue() * item.getQuantityItem();
            }
            report.setTotalBranchValue(soma);
            return report;
        }
        return null;
    }

    @Override
    public Report generateReport() {
       return null;

    }
}
