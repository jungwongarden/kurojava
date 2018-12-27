package com.Trendshop.admin.controller.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Trendshop.controller.action.Action;
import com.Trendshop.dao.QnaDAO;
import com.Trendshop.dto.QnaVO;

public class AdminQnaListAction implements Action {

  @Override
  public void execute(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    String url = "admin/qna/qnaList.jsp";
    
    QnaDAO qnaDAO = QnaDAO.getInstance();
    ArrayList<QnaVO> qnaList = qnaDAO.listAllQna();

    request.setAttribute("qnaList", qnaList);

    request.getRequestDispatcher(url).forward(request, response);
  }
}
