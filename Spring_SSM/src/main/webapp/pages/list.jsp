<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@include file="header.jsp"%>
<script type="text/javascript" src="js/list.js"></script>
	<c:if test="${user != null }">
		<div class="search">
			<label class="ui-green">
				欢迎用户:${user.username }&nbsp;&nbsp;回来
			</label> 
			<label class="ui-green">
				<input onclick="add()" type="button" name="search" value="发布房屋信息" />
			</label> 
			<label class="ui-green">
				<input type="button" name="search" value="退       出" onclick='loginout()' />
			</label>
		</div>
	</c:if>
	<c:if test="${user == null }">
		<div class="search">
			<label class="ui-green">
				<input type="button" name="search" value="请先登录" onclick='document.location="pages/login.jsp"' />
			</label>
		</div>
	</c:if>
	</div>
<div class="main wrap">
	<div id="houseArea">
		
	</div>
</div>

<%@include file="botton.jsp"%>