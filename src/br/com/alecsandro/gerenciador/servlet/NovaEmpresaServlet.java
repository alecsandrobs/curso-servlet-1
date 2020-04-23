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

@WebServlet("/nova-empresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nome = request.getParameter("nome");
		String parametroData = request.getParameter("data");

		Date data;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			data = sdf.parse(parametroData);
		} catch (ParseException e) {
			throw new ServletException(e);
		}

		Empresa empresa = new Empresa();
		empresa.setNome(nome);
		empresa.setData(data);

		Banco banco = new Banco();
		banco.adiciona(empresa);

//		request.setAttribute("empresa", empresa.getNome());

		response.sendRedirect("lista-empresas");
	}

}
