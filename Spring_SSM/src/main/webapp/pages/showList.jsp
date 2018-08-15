<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<table class="house-list">
	<c:forEach items="${pageSet.list }" var="house">
		<tr>
			<td class="house-thumb">
				<span> <a ref="page/show.jsp?id=10001"><img src="images/thumb_house.gif" /></a> </span>
			</td>
			<td>
				<dl>
					<dt>
						<a href="house_detail.action/${house.id}">${house.title}</a>
					</dt>
					<dd>${house.description}<br /> 联系方式：${house.contact}</dd>
				</dl>
			</td>

			<c:if test="${user.id == house.user.id}">
				<td class="house-type">
					<label class="ui-green"><input type="button" onclick='update(${house.id})' value="修    改" /> </label>
				</td>
				<td class="house-price">
					<label class="ui-green"> <input type="button" onclick='delHouse(${house.id})' value="删    除" /> </label>
				</td>
			</c:if>
		</tr>
		<c:if test="${user.id == house.user.id}">
			<td class="house-price" colspan="2"></td>
		</c:if>
	</c:forEach>
</table>

<div class="pager">
	<ul>
		<li class="current">
			<a href="javascript:getHouseByPage(1,${pageSet.pagesize})"> 首页</a>
		</li>
		<li class="current">
			<a href="javascript:getHouseByPage(${pageSet.pages-1 <= 1?1 :pageSet.pages-1},${pageSet.pagesize})">上一页</a>
		</li>
		<li class="current">
			<a href="javascript:getHouseByPage(${pageSet.pages+ 1>= pageSet.pageNum ?pageSet.pageNum:pageSet.pages+ 1},${pageSet.pagesize})">下一页</a> 
		</li>
		<li class="current">
			<a href="javascript:getHouseByPage(${pageSet.pageNum},${pageSet.pagesize})"> 尾页</a> 
		</li>
	</ul>
	<span class="total">第${pageSet.pages}页/共${pageSet.pageNum}页 &nbsp; &nbsp; &nbsp; &nbsp;总共${pageSet.total}条记录&nbsp; &nbsp; &nbsp; &nbsp;每页${pageSet.pagesize}条记录</span>
</div>