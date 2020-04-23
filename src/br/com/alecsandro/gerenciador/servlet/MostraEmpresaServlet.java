package br.com.alecsandro.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mostra-empresa")
public class MostraEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String parametroId = request.getParameter("id");
		Long id = Long.parseLong(parametroId);

		Banco banco = new Banco();

		Empresa empresa = banco.getById(id);

		request.setAttribute("empresa", empresa);

		RequestDispatcher rd = request.getRequestDispatcher("/formEditaEmpresa.jsp");
		rd.forward(request, response);
	}

}
