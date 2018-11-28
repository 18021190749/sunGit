package com.demo;

import org.springframework.data.annotation.Persistent;

import javax.imageio.ImageIO;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-09-05 14:29
 */
public class HelloServlet extends HttpServlet {
    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        if (request.getRequestURI().equals("/hello")) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String name = request.getParameter("allname");
            String password = request.getParameter("password");
            String username = request.getParameter("username");
            String phone = request.getParameter("phone");
            java.sql.Date birthday = null;
            try {
                birthday = new java.sql.Date(sdf.parse(request.getParameter("birthday")).getTime());
            } catch (ParseException e) {
                e.printStackTrace();
            }
            System.out.println(name + password + username + phone + birthday);
            Connection connection = null;
            PreparedStatement statement = null;
            try {
                Class.forName("oracle.jdbc.OracleDriver");
                connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:acc", "sunjie", "123456");
                statement = connection.prepareStatement("insert into sys_user values ( seq_sys_user.nextval,?,?,?,?,?,?)");
                statement.setString(1, username);
                statement.setString(2, name);
                statement.setString(3, password);
                statement.setString(4, phone);
                statement.setDate(5, birthday);
                statement.setString(6, "1");
                int end = statement.executeUpdate();
                connection.close();
                System.out.println("条数:" + end);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            response.setCharacterEncoding("utf-8");
            response.setContentType("text/html;charset=utf-8");
            Cookie cookie = new Cookie(username, password);
            ((HttpServletResponse) response).addCookie(cookie);
            PrintWriter printWriter = response.getWriter();
            printWriter.print("成功！当前时间：");
            printWriter.print(sdf.format(new Date()));
            printWriter.close();
        }
        if (request.getRequestURI().equals("/code")) {
            validateCode(request, response);
        }


    }

    public void validateCode(HttpServletRequest request, HttpServletResponse response) {
        BufferedImage image = new BufferedImage(100, 30, 1);
        Graphics g = image.getGraphics();
        Random random = new Random();
        g.setColor(getRandColor(230, 255));
        //矩形背景
        g.fillRect(0, 0, 100, 30);
        g.setFont(new Font("Arial", Font.CENTER_BASELINE | Font.ITALIC, 18));
        // 取随机产生的认证码(4位数字)
        String sRand = "";
        for (int i = 0; i < 4; i++) {
            String rand = String.valueOf(random.nextInt(10));
            sRand += rand;
            // 将认证码显示到图象中
            g.setColor(getRandColor(100, 150));
            // 调用函数出来的颜色相同，可能是因为种子太接近，所以只能直接生成
            g.drawString(rand, 15 * i + 6, 16);
        }
        for (int i = 0; i < (random.nextInt(5) + 5); i++) {
            g.setColor(new Color(random.nextInt(255) + 1, random.nextInt(255) + 1, random.nextInt(255) + 1));
            g.drawLine(random.nextInt(100), random.nextInt(30), random.nextInt(100), random.nextInt(30));
        }
        response.setContentType("image/jpeg");
        try {
            OutputStream outputStream = response.getOutputStream();
            ImageIO.write(image, "jpeg", outputStream);
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * 给定范围获得随机颜色
     *
     * @param fc
     * @param bc
     * @return
     */
    Color getRandColor(int fc, int bc) {
        Random random = new Random();
        if (fc > 255) {
            fc = 255;
        }
        if (bc > 255) {
            bc = 255;
        }
        int r = fc + random.nextInt(bc - fc);
        int g = fc + random.nextInt(bc - fc);
        int b = fc + random.nextInt(bc - fc);
        return new Color(r, g, b);
    }

}
