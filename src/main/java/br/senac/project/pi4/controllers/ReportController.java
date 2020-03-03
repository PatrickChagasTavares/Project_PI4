/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.project.pi4.controllers;

import br.senac.project.pi4.models.BranchOffice;
import br.senac.project.pi4.models.ItemOrdered;
import br.senac.project.pi4.models.Report;
import br.senac.project.pi4.models.User;
import java.sql.SQLException;

/**
 *
 * 
 */
public class ReportController {

    public static Report generateRegionalReport(int idBranch, User user) throws SQLException {
        Report report = user.generateReport(idBranch);
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

    public static Report generateAllReports(User user) {
        Report report = user.generateReport();
        if (report != null) {
            double soma = 0;
            for (BranchOffice total : report.getBranchList()) {
                soma += total.getTotalValue();
            }
            report.setTotalBranchValue(soma);
        }
        return report;
    }
}
