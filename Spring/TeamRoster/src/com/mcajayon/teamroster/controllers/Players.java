package com.mcajayon.teamroster.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mcajayon.teamroster.models.Team;
import com.mcajayon.teamroster.models.Player;

/**
 * Servlet implementation class Players
 */
@WebServlet("/addPlayer")
public class Players extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Players() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher view = request.getRequestDispatcher("WEB-INF/NewPlayer.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		Team team (Team) session.getAttribute("team");
		String first_name = request.getParameter("first_name");
		String last_name = request.getParameter("last_name");
		int age = Integer.parseInt(request.getParameter("age"));
		Player newPlayer = new Player(first_name, last_name, age);
		team.addPlayer = (newPlayer);
		int teamId = (Integer)session.getAttribute("id");
		response.sendRedirect("/TeamRoster/teams?id="+teamId);
	}
}