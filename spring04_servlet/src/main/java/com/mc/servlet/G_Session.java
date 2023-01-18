package com.mc.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class G_Session
 */
@WebServlet("/session")
public class G_Session extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public G_Session() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// Session : 한 번의 연결
		// httpSession : 웹 어플리케이션 관점에서 한번의 연결(Session)을 수명주기로 가지는 데이터를 저장하기 위한 객체
		//				웹 어플리케이션 관점에서 한번의 연결(Session) : 브라우저 session 
		
		String nickname = request.getParameter("nickname");
		
		// session객체 가져오기
		HttpSession session = request.getSession();
		
		
		//session crud
		// setAttribute :  세션에 데이터 저장
		// getAttribute :  세션에서 데이터 가져오기
		// removeAttribute :  세션에서 데이터 삭제
		session.setAttribute("user", nickname);
		response.sendRedirect("/spring04_servlet/index.html");
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
