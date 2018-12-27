package com.Trendshop.admin.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Trendshop.dao.QnaDAO;
import com.Trendshop.controller.action.Action;
import com.Trendshop.dto.QnaVO;

public class AdminQnaDetailAction implements Action {

  @Override
  public void execute(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    String url = "admin/qna/qnaDetail.jsp";

    String qseq = request.getParameter("qseq").trim();

    QnaDAO qnaDAO = QnaDAO.getInstance();
    QnaVO qnaVO = qnaDAO.getQna(Integer.parseInt(qseq));

    request.setAttribute("qnaVO", qnaVO);
        
    request.getRequestDispatcher(url).forward(request, response);
  }
}
