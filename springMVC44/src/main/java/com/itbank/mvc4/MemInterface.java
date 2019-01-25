package com.itbank.mvc4;

import java.util.ArrayList;

public interface MemInterface {

	void update(MemberDTO dto) throws Exception;

	void delete(String id) throws Exception;

	void insert(MemberDTO dto) throws Exception;

	ArrayList<MemberDTO> selectAll() throws Exception;

	MemberDTO select(String input) throws Exception;

	void login(String input1, String input2) throws Exception;

}