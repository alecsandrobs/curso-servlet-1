package br.com.alecsandro.gerenciador.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/edita-empresa")
public class EditaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String parametroId = request.getParameter("id");
		String nome = request.getParameter("nome");
		String parametroData = request.getParameter("data");

		Long id = Long.parseLong(parametroId);
		Date data = new Date();
		if (parametroData != null && !parametroData.trim().isEmpty()) {
			try {
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				data = sdf.parse(parametroData);
			} catch (ParseException e) {
				throw new ServletException(e);
			}
		}

		Empresa empresa = new Empresa();
		empresa.setId(id);
		empresa.setNome(nome);
		empresa.setData(data);

		Banco banco = new Banco();
		empresa = banco.getById(id);
		empresa.setNome(nome);
		empresa.setData(data);

//		RequestDispatcher rd = request.getRequestDispatcher("/lista-empresas");
		response.sendRedirect("lista-empresas");
	}

}
