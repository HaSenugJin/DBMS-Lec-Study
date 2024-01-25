package user;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.LocalDateTime;

//@WebServlet("/join-form")
public class JoinFormServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LocalDateTime now = LocalDateTime.now();

        String html = " <!DOCTYPE html>\n" +
                "                <html lang=\"en\">\n" +
                "                <head>\n" +
                "                    <meta charset=\"UTF-8\">\n" +
                "                    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "                    <title>Document</title>\n" +
                "                </head>\n" +
                "                <body>\n";

                for (int i = 0; i < 1; i++) {
                    html = html + "                    <h1>회원가입 페이지"+now+"</h1>\n";
                }

                html = html +"                    <hr>\n" +
                "                    <form action=\"/join\" method=\"post\">\n" +
                "                        <input type=\"text\" placeholder=\"username\" name=\"username\">\n" +
                "                        <input type=\"text\" placeholder=\"password\" name=\"password\">\n" +
                "                        <input type=\"text\" placeholder=\"email\" name=\"email\">\n" +
                "                        <button>회원가입</button>\n" +
                "                    </form>\n" +
                "                </body>\n" +
                "                </html>";
        resp.getWriter().println(html);
    }
}