package com.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.model.League;

/**
 * Servlet implementation class ListLeague
 */
public class ListLeague extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private List<League> list =null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListLeague() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
		
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		list=new ArrayList<League>();
		list.add(new League(UUID.randomUUID().toString(), "SUMMER", 2020, "Duke's Soccer League"));
		list.add(new League(UUID.randomUUID().toString(), "Autumn", 2020, "English Premere League"));
		list.add(new League(UUID.randomUUID().toString(), "Winter", 2020, "Beach Volley League"));
		out.println("<html><head><title>List of Leagues</title></head><body><table border='1'><tr><td>Id</td><td>Season</td><td>Year</td><td>title</td></tr>");
		
		for(League l:list)
		{
			out.println("<tr><td>"+l.getLeagueID()+"</td><td>"+l.getSeason()+"</td><td>"+l.getYear()+"</td><td>"+l.getTitle()+"</tr>");
			
		}
		out.println("</table></body></html>");
		
	}
}
