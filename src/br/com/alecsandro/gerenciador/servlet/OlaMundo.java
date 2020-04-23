package br.com.alecsandro.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/holla")
public class OlaMundo extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		PrintWriter out = resp.getWriter();
		String texto = String.format("<html><head><title>%s</title></head><body>%s</body></html>",
				"### Primeiro Servlet ###", "Olá Meu primeiro Servlet Olá");

		out.println(texto);

	}
}
