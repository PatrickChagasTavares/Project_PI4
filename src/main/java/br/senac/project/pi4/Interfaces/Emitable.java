/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.project.pi4.Interfaces;

import br.senac.project.pi4.models.Report;

/**
 *
 * 
 */
public interface Emitable {

    public Report generateReport();
    public Report generateReport(int id);
}
