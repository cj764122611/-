<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="header.jsp"%>
<script type="text/javascript" src="js/register.js"></script>
</div>
<div id="regLogin" class="wrap">
	<div class="dialog">
		<dl class="clearfix">
			<dt>新用户注册</dt>
			<dd class="past">填写个人信息</dd>
		</dl>
		<div class="box">
			<form id="User_register" name="User_register" >
				<div class="infos">
					<table class="field">
						<tr>
							<td colspan="2" style="text-align: center; color: red"></td>
						</tr>
						<tr>
							<td class="field">用 户 名：</td>
							<td><input type="text" class="text" name="username"  onblur="isUserExists(this.value)"/></td>
						</tr>
						<tr>
							<td class="field">密 码：</td>
							<td><input type="password" class="text" name="password" id="password" /></td>
						</tr>
						<tr>
							<td class="field">确认密码：</td>
							<td><input type="password" class="text" name="repassword" id="repassword" onblur="checkPassword()" />
							</td>
						</tr>
						<tr>
							<td class="field">电 话：</td>
							<td><input type="text" class="text" name="telephone" /></td>
						</tr>
						<tr>
							<td class="field">用户姓名：</td>
							<td><input type="text" class="text" name="name" /></td>
						</tr>
					</table>
					<div class="buttons">
						<input type="button" name="button" value="立即注册"  onclick="register()"/>
					</div>
				</div>
			</form>
		</div>
	</div>
</div>
<%@include file="botton.jsp"%>

