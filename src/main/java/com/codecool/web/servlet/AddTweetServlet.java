package com.codecool.web.servlet;

import com.codecool.web.model.Tweet;
import com.codecool.web.service.TweetService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.List;

@WebServlet({"/new-tweet"})
public class AddTweetServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("name");
        String content = request.getParameter("content");
        Date timeStamp = new Date();

        TweetService.getInstance().addTweet(name, content, timeStamp);

        List<Tweet> tweets = TweetService.getInstance().getTweets();

        if (tweets != null) {
            request.getSession().setAttribute("tweets", tweets);
            request.getRequestDispatcher("tweets-jstl.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("no-tweets.jsp").forward(request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Tweet> tweets = TweetService.getInstance().getTweets();

        request.getSession().setAttribute("tweets", tweets);
        request.getRequestDispatcher("tweets-jstl.jsp").forward(request, response);

    }
}
