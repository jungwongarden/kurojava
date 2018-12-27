package com.Trendshop.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Trendshop.dao.QnaDAO;
import com.Trendshop.dto.MemberVO;
import com.Trendshop.dto.QnaVO;

public class QnaWriteAction implements Action {

  @Override
  public void execute(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    String url = "TrendshopServlet?command=qna_list";
    
    HttpSession session = request.getSession();
    MemberVO loginUser = (MemberVO) session.getAttribute("loginUser");    
    
    if (loginUser == null) {
      url = "TrendshopServlet?command=login_form";
    }else{      
      QnaVO qnaVO = new QnaVO();
      qnaVO.setSubject(request.getParameter("subject"));
      qnaVO.setContent(request.getParameter("content"));      
      QnaDAO qnaDAO = QnaDAO.getInstance();
      qnaDAO.insertqna(qnaVO, loginUser.getId());      
    }    
    response.sendRedirect(url);
  }
}
