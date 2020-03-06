/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;

import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author lucas.paiva
 */
@WebServlet("/Uploader")
public class Uploader extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public Uploader() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();

        if (!ServletFileUpload.isMultipartContent(request)) {
            out.println("Nothing to upload");
            return;
        }

        FileItemFactory itemfactory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(itemfactory);
        try {
            List<FileItem> items = upload.parseRequest(request);
            for (FileItem item : items) {
                String contentType = item.getContentType();
                if (!contentType.equals("image/png")) {
                    out.println("somente são aceitas imagens PNG");
                    continue;
                }

                UUID hash = UUID.randomUUID();
                String directory = request.getRealPath("/").replace("build/web", "Images");
                // String teste3 = getServletContext.getRealPath("/");;

                // File file = File.createTempFile("img", ".png",new File(directory));
                item.write(new File(directory + hash.toString()+".png"));

                out.println("Imagem salva com sucesso!");
            }
        } catch (FileUploadException e) {
            out.println("Falha ao salvar imagem");
        } catch (Exception ex) {
            out.println("Impossivel salvar: " + ex);

        }
    }
}
